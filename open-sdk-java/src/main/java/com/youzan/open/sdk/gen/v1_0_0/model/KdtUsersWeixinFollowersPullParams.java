package com.youzan.open.sdk.gen.v1_0_0.model;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.model.ByteWrapper;
import com.youzan.open.sdk.model.FileParams;
import java.util.List;
import java.util.Map;
import java.util.Date;

public class KdtUsersWeixinFollowersPullParams implements APIParams, FileParams  {

    private Long pageSize;
    private String fields;
    private Long afterFansId;


    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }


    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }


    public void setAfterFansId(Long afterFansId) {
        this.afterFansId = afterFansId;
    }

    public Long getAfterFansId() {
        return this.afterFansId;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (pageSize != null) {
            params.put("page_size", pageSize);
        }
        if (fields != null) {
            params.put("fields", fields);
        }
        if (afterFansId != null) {
            params.put("after_fans_id", afterFansId);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}