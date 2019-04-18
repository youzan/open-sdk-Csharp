package com.youzan.open.gen.core.gens;

import com.youzan.open.gen.core.converter.TypeConverter;
import com.youzan.open.gen.core.meta.MetaCenter;
import com.youzan.open.gen.model.OpenAPI;

/**
 * @author ph0ly
 * @time 2016-12-01
 */
public class GeneratorContext {

    private OpenAPI openAPI;
    private String baseVersionPackageName;
    private String paramClassName;
    private String resultClassName;
    private String className;
    private String genPath;

    private TypeConverter typeConverter;
    private MetaCenter metaCenter;

    public OpenAPI getOpenAPI() {
        return openAPI;
    }

    public void setOpenAPI(OpenAPI openAPI) {
        this.openAPI = openAPI;
    }

    public String getBaseVersionPackageName() {
        return baseVersionPackageName;
    }

    public void setBaseVersionPackageName(String baseVersionPackageName) {
        this.baseVersionPackageName = baseVersionPackageName;
    }

    public String getParamClassName() {
        return paramClassName;
    }

    public void setParamClassName(String paramClassName) {
        this.paramClassName = paramClassName;
    }

    public String getResultClassName() {
        return resultClassName;
    }

    public void setResultClassName(String resultClassName) {
        this.resultClassName = resultClassName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public TypeConverter getTypeConverter() {
        return typeConverter;
    }

    public void setTypeConverter(TypeConverter typeConverter) {
        this.typeConverter = typeConverter;
    }

    public MetaCenter getMetaCenter() {
        return metaCenter;
    }

    public void setMetaCenter(MetaCenter metaCenter) {
        this.metaCenter = metaCenter;
    }

    public String getGenPath() {
        return genPath;
    }

    public void setGenPath(String genPath) {
        this.genPath = genPath;
    }
}
