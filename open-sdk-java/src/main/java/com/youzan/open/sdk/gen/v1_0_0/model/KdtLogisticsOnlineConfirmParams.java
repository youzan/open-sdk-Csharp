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

public class KdtLogisticsOnlineConfirmParams implements APIParams, FileParams  {

    private String tid;
    private String outerTid;
    private String outStype;
    private String outSid;
    private String oids;
    private Long isNoExpress;


    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTid() {
        return this.tid;
    }


    public void setOuterTid(String outerTid) {
        this.outerTid = outerTid;
    }

    public String getOuterTid() {
        return this.outerTid;
    }


    public void setOutStype(String outStype) {
        this.outStype = outStype;
    }

    public String getOutStype() {
        return this.outStype;
    }


    public void setOutSid(String outSid) {
        this.outSid = outSid;
    }

    public String getOutSid() {
        return this.outSid;
    }


    public void setOids(String oids) {
        this.oids = oids;
    }

    public String getOids() {
        return this.oids;
    }


    public void setIsNoExpress(Long isNoExpress) {
        this.isNoExpress = isNoExpress;
    }

    public Long getIsNoExpress() {
        return this.isNoExpress;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (tid != null) {
            params.put("tid", tid);
        }
        if (outerTid != null) {
            params.put("outer_tid", outerTid);
        }
        if (outStype != null) {
            params.put("out_stype", outStype);
        }
        if (outSid != null) {
            params.put("out_sid", outSid);
        }
        if (oids != null) {
            params.put("oids", oids);
        }
        if (isNoExpress != null) {
            params.put("is_no_express", isNoExpress);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}