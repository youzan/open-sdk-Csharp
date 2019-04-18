package com.youzan.open.gen.core.gens;

import com.google.common.base.CaseFormat;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.youzan.open.gen.core.Generator;
import com.youzan.open.gen.core.clazz.ClassBuilder;
import com.youzan.open.gen.core.clazz.Clazz;
import com.youzan.open.gen.core.converter.TypeConverter;
import com.youzan.open.gen.core.model.Meta;
import com.youzan.open.gen.core.model.ObjectMeta;
import org.apache.commons.io.FileUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Map;

/**
 * @author ph0ly
 * @time 2016-12-01
 */
public abstract class AbstractGenerator implements Generator {

    @Autowired
    private VelocityEngine engine;

    @Autowired
    private TypeConverter typeConverter;

    protected void getMetaClass(ObjectMeta meta, Map<String, Clazz> classes) {
        String className = meta.getType().replace("[]", "");

        List<Meta> children = meta.getMetas();
        if (children == null) {
            return;
        }
        Clazz clazz = new Clazz();
        clazz.setName(className);
        clazz.setCapName(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, clazz.getName()));
        List<Clazz.Field> fields = Lists.newArrayList();
        for (Meta child : children) {
            Clazz.Field field = new Clazz.Field();
            field.setName(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, child.getName()));
            field.setType(typeConverter.convert(child.getType()));
            field.setRealName(child.getName());
            String capitalizedName;
            String fieldName = field.getName();
            if (fieldName.length() > 1) {
                capitalizedName = fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
            } else {
                capitalizedName = fieldName.toUpperCase();
            }
            field.setCapName(capitalizedName.replace("[]", ""));
            fields.add(field);
            if (child instanceof ObjectMeta) {
                getMetaClass((ObjectMeta) child, classes);
            }
        }
        clazz.setFields(fields);
        classes.put(className, clazz);
    }

    protected void save(String templateName, Map model, String path) {
        Template template = engine.getTemplate(templateName);
        VelocityContext velocityContext = new VelocityContext();
        velocityContext.put("model", model);
        StringWriter writer = new StringWriter();
        template.merge(velocityContext, writer);

        String code = writer.toString();
        try {
            FileUtils.writeStringToFile(new File(path), code, "utf-8");
            //Files.write(Paths.get(path), code.getBytes(), StandardOpenOption.CREATE_NEW);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
