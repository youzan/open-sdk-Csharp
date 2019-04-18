package com.youzan.open.gen.core.gens;

import com.google.common.base.CaseFormat;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.youzan.open.gen.core.clazz.Clazz;
import com.youzan.open.gen.core.converter.TypeConverter;
import com.youzan.open.gen.core.meta.MetaCenter;
import com.youzan.open.gen.core.model.ObjectMeta;
import com.youzan.open.gen.model.OpenAPI;
import com.youzan.open.gen.model.OpenAPIParam;
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
public class APIParamGenerator extends AbstractGenerator {

    private static final Logger LOG = LoggerFactory.getLogger(APIParamGenerator.class);

    @Override
    public void generate(GeneratorContext context) {

        String className = context.getClassName() + "Params";
        OpenAPI openAPI = context.getOpenAPI();

        TypeConverter typeConverter = context.getTypeConverter();
        MetaCenter metaCenter = context.getMetaCenter();

        String method = openAPI.getMethod();

        Map<String, Object> model = Maps.newHashMap();
        model.put("packageVersion", "v" + openAPI.getVersion().replace(".", "_"));
        model.put("className", className);
        model.put("hasFile", (method.equals("POST") || method.equals("PUT")) ? "true" : "false");

        List<Map> fields = Lists.newArrayList();
        List<Map> fileParams = Lists.newArrayList();
        List<Map> params = Lists.newArrayList();

        Map<String, Clazz> classes = Maps.newHashMap();
        List<OpenAPIParam> openAPIParams = openAPI.getParams();
        for (OpenAPIParam openAPIParam : openAPIParams) {
            String paramName = openAPIParam.getParamName();
            String paramType = openAPIParam.getParamType();

            String realType = typeConverter.convert(paramType);

            Map fieldMap = Maps.newHashMap();
            fieldMap.put("name", CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, paramName.replace("[]", "")));
            fieldMap.put("realName", paramName);
            fieldMap.put("type", realType);
            String capitalizedName;
            if (paramName.length() > 1) {
                paramName = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, paramName);
                capitalizedName = paramName.substring(0, 1).toUpperCase() + paramName.substring(1);
            } else {
                capitalizedName = paramName.toUpperCase();
            }
            fieldMap.put("capName", capitalizedName.replace("[]", ""));

            fields.add(fieldMap);
            if (realType.equals("ByteWrapper[]") || realType.equals("ByteWrapper")) {
                fileParams.add(fieldMap);
            } else {
                params.add(fieldMap);
            }

            // 元数据中心查询是否为复杂类型
            ObjectMeta meta = (ObjectMeta)metaCenter.find(paramType);
            if (meta != null) {
                getMetaClass(meta, classes);
            }
        }

        model.put("fields", fields);
        model.put("params", params);
        if (fileParams.size() > 0) {
            model.put("fileParams", fileParams);
        }
        model.put("classes", classes.values());

        String fileName = context.getGenPath() + "/model/" + className + ".java";
        save("param.vm", model, fileName);

        LOG.info("API({}) class({}) generated", context.getOpenAPI().getName(), className);

    }


}
