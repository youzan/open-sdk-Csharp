package com.youzan.open.gen.core.gens;

import com.google.common.collect.Maps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author ph0ly
 * @time 2016-12-01
 */
@Component
public class APIGenerator extends AbstractGenerator {

    private static final Logger LOG = LoggerFactory.getLogger(APIGenerator.class);

    @Override
    public void generate(GeneratorContext context) {
        String paramClassName = context.getParamClassName();
        String resultClassName = context.getResultClassName();
        String className = context.getClassName();
        String method = context.getOpenAPI().getMethod();
        String version = context.getOpenAPI().getVersion();
        String name = context.getOpenAPI().getName();

        Map<String, Object> model = Maps.newHashMap();
        model.put("packageVersion", "v" + version.replace(".", "_"));
        model.put("className", className);
        model.put("name", name);
        model.put("method", method);
        model.put("version", version);
        model.put("resultClass", resultClassName);
        model.put("paramClass", paramClassName);

        String fileName = context.getGenPath() + "/api/" + className + ".java";
        save("api.vm", model, fileName);

        LOG.info("API({}) class({}) generated", context.getOpenAPI().getName(), className);

    }
}
