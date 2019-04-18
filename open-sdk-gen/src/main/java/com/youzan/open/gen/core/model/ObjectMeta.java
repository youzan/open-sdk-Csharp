package com.youzan.open.gen.core.model;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author ph0ly
 * @time 2016-12-01
 */
public class ObjectMeta extends Meta {

    private List<Meta> metas = Lists.newArrayList();

    public List<Meta> getMetas() {
        return metas;
    }

    public void setMetas(List<Meta> metas) {
        this.metas = metas;
    }
}
