package com.youzan.open.sdk.gen.v1_0.model;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.model.ByteWrapper;
import com.youzan.open.sdk.model.FileParams;
import java.util.List;
import java.util.Map;
import java.util.Date;

public class SzOaLoginGetshopsbyonlineshopidParams implements APIParams, FileParams  {

    private Long onlineshopid;


    public void setOnlineshopid(Long onlineshopid) {
        this.onlineshopid = onlineshopid;
    }

    public Long getOnlineshopid() {
        return this.onlineshopid;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (onlineshopid != null) {
            params.put("onlineShopId", onlineshopid);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}