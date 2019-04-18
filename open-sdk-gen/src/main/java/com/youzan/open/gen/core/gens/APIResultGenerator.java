package com.youzan.open.gen.core.gens;

import com.google.common.base.CaseFormat;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.youzan.open.gen.core.clazz.Clazz;
import com.youzan.open.gen.core.converter.TypeConverter;
import com.youzan.open.gen.core.meta.MetaCenter;
import com.youzan.open.gen.core.model.ObjectMeta;
import com.youzan.open.gen.model.OpenAPI;
import com.youzan.open.gen.model.OpenAPIResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author ph0ly
 * @time 2016-12-01
 */
@Component
public class APIResultGenerator extends AbstractGenerator {

    private static final Logger LOG = LoggerFactory.getLogger(APIResultGenerator.class);

    @Override
    public void generate(GeneratorContext context) {
        String className = context.getClassName() + "Result";
        OpenAPI openAPI = context.getOpenAPI();

        TypeConverter typeConverter = context.getTypeConverter();
        MetaCenter metaCenter = context.getMetaCenter();

        List<OpenAPIResult> openAPIResults = openAPI.getResults();
        if (openAPIResults == null || openAPIResults.size() == 0) {
            openAPIResults = Lists.newArrayList();
        }

        List<Map> fields = Lists.newArrayList();

        Map<String, Object> model = Maps.newHashMap();
        model.put("packageVersion", "v" + openAPI.getVersion().replace(".", "_"));
        model.put("className", className);
        Map<String, Clazz> classes = Maps.newHashMap();

        for (OpenAPIResult openAPIResult : openAPIResults) {
            String name = openAPIResult.getName();
            String type = openAPIResult.getType();

            String realType = typeConverter.convert(type);

            Map fieldMap = Maps.newHashMap();
            fieldMap.put("name", CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, name.replace("[]", "")));
            fieldMap.put("realName", name);
            fieldMap.put("type", realType);
            String capitalizedName;
            if (name.length() > 1) {
                name = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, name);
                capitalizedName = name.substring(0, 1).toUpperCase() + name.substring(1);
            } else {
                capitalizedName = name.toUpperCase();
            }
            fieldMap.put("capName", capitalizedName.replace("[]", ""));

            fields.add(fieldMap);

            // 元数据中心查询是否为复杂类型
            ObjectMeta meta = (ObjectMeta)metaCenter.find(realType);
            if (meta != null) {
                getMetaClass(meta, classes);
            }
        }

        model.put("fields", fields);
        model.put("classes", classes.values());

        String fileName = context.getGenPath() + "/model/" + className + ".java";
        save("result.vm", model, fileName);

        LOG.info("API({}) class({}) generated", context.getOpenAPI().getName(), className);
    }
}
