package com.youzan.open.gen.core.meta;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.common.base.Optional;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.Lists;
import com.youzan.open.gen.core.converter.TypeConverter;
import com.youzan.open.gen.core.model.Meta;
import com.youzan.open.gen.core.model.ObjectMeta;
import com.youzan.open.gen.core.model.PrimaryMeta;
import com.youzan.open.gen.util.http.DefaultHttpClient;
import com.youzan.open.gen.util.http.HttpClient;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @author ph0ly
 * @time 2016-12-01
 * PHP元数据中心
 */
@Component
public class PHPMetaCenter implements MetaCenter {

    private HttpClient httpClient;

    private Cache<String, Meta> cache = CacheBuilder.newBuilder().expireAfterWrite(1, TimeUnit.HOURS).build();

    @Autowired
    private TypeConverter typeConverter;

    @PostConstruct
    public void init() {
        httpClient = new DefaultHttpClient();
        load();
    }

    private synchronized void load() {
        Map<String, Object> result = httpClient.get("http://api.koudaitong.com/open/doc/findAllStructs?debug=gateway", HttpClient.Params.custom().build(), new TypeReference<Map<String, Object>>() {
        });

        Object val = result.get("response");
        if (val == null) {
            throw new RuntimeException("Find all struct response format error");
        }
        Map<String, Object> response = (Map)val;
        List<Map<String, String>> structs = (List)response.get("structs");
        // 扁平化处理
        for (Map<String, String> struct : structs) {
            String structName = struct.get("name");
            Meta meta = getStruct(structName.trim());
            cache.put(structName, meta);

            Meta arrayMeta = new ObjectMeta();
            BeanUtils.copyProperties(meta, arrayMeta);
            arrayMeta.setType(structName + "[]");
            cache.put(arrayMeta.getType(), arrayMeta);
        }

        // 构建Meta关系
        Map<String, Meta> cacheMap = cache.asMap();
        for (String key : cacheMap.keySet()) {
            Meta meta = cacheMap.get(key);
            Meta newMeta = buildRelationship(meta);
            cache.put(key, newMeta);
        }

        System.out.println("aa");
    }

    // 构建该meta的深层关系
    private Meta buildRelationship(Meta meta) {
        if (meta instanceof PrimaryMeta) {
            return meta;
        }

        List<Meta> children = ((ObjectMeta)meta).getMetas();

        ObjectMeta newMeta = new ObjectMeta();
        BeanUtils.copyProperties(meta, newMeta);
        List<Meta> newChildMetas = Lists.newArrayList();

        for (Meta child : children) {
            String realType = typeConverter.convert(child.getType().trim());
            Meta cachedMeta = cache.getIfPresent(realType);
            if (cachedMeta == null || realType.equals(meta.getType())) {
                newChildMetas.add(child);
            } else {
                Meta resultMeta = buildRelationship(cachedMeta);
                resultMeta.setName(child.getName());
                resultMeta.setType(realType);
                newChildMetas.add(resultMeta);
            }
        }

        newMeta.setMetas(newChildMetas);
        return newMeta;
    }

    // 获取该结构的一级关系
    private Meta getStruct(String name) {
        Map<String, Object> result = httpClient.get("http://api.koudaitong.com/open/doc/getStruct?debug=gateway&name=" + name.replace("[]", ""), HttpClient.Params.custom().build(), new TypeReference<Map<String, Object>>() {
        });
        Object val = result.get("response");
        if (val == null) {
            throw new RuntimeException("Get struct response format error");
        }

        Map<String, Object> response = (Map)val;
        Map<String, Object> struct = (Map)response.get("struct");
        Map<String, Object> fields = (Map)struct.get("fields");

        ObjectMeta resultMeta = new ObjectMeta();
        resultMeta.setName(struct.get("name").toString().trim());
        resultMeta.setType(name);
        resultMeta.setDesc(struct.get("desc").toString());

        List<Meta> metas = Lists.newArrayList();
        for (String key : fields.keySet()) {
            Map<String, Object> detail = (Map) fields.get(key);
            final String fieldType = typeConverter.convert(detail.get("type").toString().trim());
            String example = Optional.fromNullable(detail.get("example")).toString();
            String desc = Optional.fromNullable(detail.get("desc")).toString();

            Meta fieldMeta = new PrimaryMeta();
            fieldMeta.setName(key);
            fieldMeta.setType(fieldType);
            fieldMeta.setDesc(desc);
            fieldMeta.setExample(example);
            metas.add(fieldMeta);
        }

        resultMeta.setMetas(metas);
        return resultMeta;
    }

    @Override
    public synchronized Meta find(String name) {
        return cache.getIfPresent(name);
    }
}
