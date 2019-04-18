package com.youzan.open.gen.core.clazz;

import com.google.common.base.CaseFormat;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.util.List;
import java.util.Map;

/**
 * @author ph0ly
 * @time 2016-11-30
 */
public class ClassBuilder {

    public static class Method {
        private String accessControl = "public";
        private String returnType = "void";
        private String name;
        private List<NameValuePair> params = Lists.newArrayList();
        private String code;

        public String getAccessControl() {
            return accessControl;
        }

        public void setAccessControl(String accessControl) {
            this.accessControl = accessControl;
        }

        public String getReturnType() {
            return returnType;
        }

        public void setReturnType(String returnType) {
            this.returnType = returnType;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<NameValuePair> getParams() {
            return params;
        }

        public void setParams(List<NameValuePair> params) {
            this.params = params;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }
    }

    public static class Field {
        private String accessControl;
        private String type;
        private String name;
        private List<String> annotations = Lists.newArrayList();

        public String getAccessControl() {
            return accessControl;
        }

        public void setAccessControl(String accessControl) {
            this.accessControl = accessControl;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<String> getAnnotations() {
            return annotations;
        }

        public void setAnnotations(List<String> annotations) {
            this.annotations = annotations;
        }
    }

    private String className;
    private String packageName;
    private String superClassName;
    private boolean isStatic = false;
    private List<String> implementsInterfaces = Lists.newArrayList();
    private List<String> importPackages = Lists.newArrayList();
    private List<Field> fields = Lists.newArrayList();
    private List<Method> methods = Lists.newArrayList();
    private List<ClassBuilder> classes = Lists.newArrayList();

    public ClassBuilder importPackage(String packageName) {
        importPackages.add(packageName);
        return this;
    }

    public ClassBuilder importPackage(Class clazz) {
        importPackages.add(clazz.getCanonicalName());
        return this;
    }

    public ClassBuilder setClassName(String className) {
        this.className = className;
        return this;
    }

    public ClassBuilder setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    public ClassBuilder setSuperClassName(String superClass) {
        this.superClassName = superClass;
        return this;
    }

    public ClassBuilder setSuperClassName(Class clazz) {
        this.superClassName = clazz.getCanonicalName();
        return this;
    }

    public ClassBuilder implementsInterface(String interfaceName) {
        implementsInterfaces.add(interfaceName);
        return this;
    }

    public ClassBuilder implementsInterface(Class clazz) {
        implementsInterfaces.add(clazz.getCanonicalName());
        return this;
    }

    public ClassBuilder addMethod(Method method) {
        methods.add(method);
        return this;
    }

    public ClassBuilder addField(Field field) {
        fields.add(field);
        return this;
    }

    public ClassBuilder addClass(ClassBuilder builder) {
        this.classes.add(builder);
        return this;
    }

    public boolean getIsStatic() {
        return isStatic;
    }

    public void setIsStatic(boolean aStatic) {
        isStatic = aStatic;
    }

    public static ClassBuilder custom() {
        return new ClassBuilder();
    }

    public String build() {
        if (StringUtils.isBlank(className)) {
            throw new IllegalArgumentException("Class name can't be empty");
        }

        List<String> classCodeLines = Lists.newArrayList();
        // package section
        if (StringUtils.isNotBlank(packageName)) {
            classCodeLines.add("package " + packageName + ";");
            classCodeLines.add("");
        }

        // imports section
        for (String packageName : importPackages) {
            classCodeLines.add("import " + packageName + ";");
        }
        classCodeLines.add("");

        // class section
        String classDefinitionLine = "public " + (isStatic ? "static" : "") + " class " + className + " ";
        if (StringUtils.isNotBlank(superClassName)) {
            classDefinitionLine += "extends " + superClassName;
        }
        if (implementsInterfaces != null && implementsInterfaces.size() > 0) {
            classDefinitionLine += " implements " + Joiner.on(", ").join(implementsInterfaces);
        }
        classDefinitionLine += " {";
        classCodeLines.add(classDefinitionLine);

        // field section
        if (fields != null && fields.size() > 0) {
            for (Field field : fields) {
                classCodeLines.add("\t" + field.getAccessControl() + " " + field.getType() + " " + field.getName() + ";");
            }
        }
        classCodeLines.add("");

        // generate getter setter
        if (fields != null && fields.size() > 0) {
            for (Field field : fields) {
                String fieldType = field.getType();
                String fieldName = field.getName();
                String upperFieldName = fieldName;
                if (fieldName.length() > 1) {
                    upperFieldName = fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
                }
                String setterName = "set" + upperFieldName;
                String getterName = "get" + upperFieldName;

                Method method = new Method();
                method.setAccessControl("public");
                method.setName(setterName);
                List<NameValuePair> setterParams = Lists.newArrayList();
                NameValuePair param = new BasicNameValuePair(fieldType, fieldName);
                setterParams.add(param);
                method.setParams(setterParams);
                method.setCode("this." + fieldName + " = " + fieldName + ";");

                methods.add(method);

                method = new Method();
                method.setAccessControl("public");
                method.setName(getterName);
                method.setCode("return this." + fieldName + ";");
                method.setReturnType(fieldType);

                methods.add(method);
            }
        }

        // methods section
        for (Method method : methods) {
            List<String> methodLines = Lists.newArrayList();
            String methodDefinitionLine = "\t" + method.getAccessControl() + " " + method.getReturnType() + " " + method.getName();
            List<String> params = Lists.newArrayList();
            for (NameValuePair nameValuePair : method.getParams()) {
                params.add(nameValuePair.getName() + " " + nameValuePair.getValue());
            }
            methodDefinitionLine = methodDefinitionLine + "(" + Joiner.on(", ").join(params) + ") {";
            methodLines.add(methodDefinitionLine);
            methodLines.add("\t\t" + method.getCode());
            methodLines.add("\t}");
            methodLines.add("");

            classCodeLines.add(Joiner.on("\n").join(methodLines));
        }

        if (classes != null && classes.size() > 0) {
            for (ClassBuilder builder : classes) {
                List<String> codeLines = Splitter.on("\n").splitToList(builder.build());
                classCodeLines.add(Joiner.on("\n\t").join(codeLines));
            }
        }

        // class section end
        classCodeLines.add("}");

        return Joiner.on("\n").join(classCodeLines);
    }

}
