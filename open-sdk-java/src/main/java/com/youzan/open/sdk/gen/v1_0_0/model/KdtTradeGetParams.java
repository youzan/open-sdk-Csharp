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

public class KdtTradeGetParams implements APIParams, FileParams  {

    private String tid;
    private Long subTradePageSize;
    private Long subTradePageNo;
    private String fields;


    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTid() {
        return this.tid;
    }


    public void setSubTradePageSize(Long subTradePageSize) {
        this.subTradePageSize = subTradePageSize;
    }

    public Long getSubTradePageSize() {
        return this.subTradePageSize;
    }


    public void setSubTradePageNo(Long subTradePageNo) {
        this.subTradePageNo = subTradePageNo;
    }

    public Long getSubTradePageNo() {
        return this.subTradePageNo;
    }


    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (tid != null) {
            params.put("tid", tid);
        }
        if (subTradePageSize != null) {
            params.put("sub_trade_page_size", subTradePageSize);
        }
        if (subTradePageNo != null) {
            params.put("sub_trade_page_no", subTradePageNo);
        }
        if (fields != null) {
            params.put("fields", fields);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}