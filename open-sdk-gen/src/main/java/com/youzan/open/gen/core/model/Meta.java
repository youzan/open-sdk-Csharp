package com.youzan.open.gen.core.model;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author ph0ly
 * @time 2016-12-01
 */
public abstract class Meta {

    private String name;
    private String type;
    private String desc;
    private String example;

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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }
}
