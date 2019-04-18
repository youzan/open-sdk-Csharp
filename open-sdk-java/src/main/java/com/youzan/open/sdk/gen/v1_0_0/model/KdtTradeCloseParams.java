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

public class KdtTradeCloseParams implements APIParams, FileParams  {

    private String tid;
    private String fields;
    private String closeReasonId;
    private String closeReason;


    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTid() {
        return this.tid;
    }


    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }


    public void setCloseReasonId(String closeReasonId) {
        this.closeReasonId = closeReasonId;
    }

    public String getCloseReasonId() {
        return this.closeReasonId;
    }


    public void setCloseReason(String closeReason) {
        this.closeReason = closeReason;
    }

    public String getCloseReason() {
        return this.closeReason;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (tid != null) {
            params.put("tid", tid);
        }
        if (fields != null) {
            params.put("fields", fields);
        }
        if (closeReasonId != null) {
            params.put("close_reason_id", closeReasonId);
        }
        if (closeReason != null) {
            params.put("close_reason", closeReason);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}