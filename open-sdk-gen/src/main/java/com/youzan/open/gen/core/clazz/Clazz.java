package com.youzan.open.gen.core.clazz;

import java.util.List;

/**
 * @author ph0ly
 * @time 2016-12-02
 */
public class Clazz {

    private String name;
    private String capName;
    private List<Field> fields;

    public static class Field {
        private String name;
        private String type;
        private String realName;
        private String capName;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getCapName() {
            return capName;
        }

        public void setCapName(String capName) {
            this.capName = capName;
        }

        public String getRealName() {
            return realName;
        }

        public void setRealName(String realName) {
            this.realName = realName;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapName() {
        return capName;
    }

    public void setCapName(String capName) {
        this.capName = capName;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }
}
