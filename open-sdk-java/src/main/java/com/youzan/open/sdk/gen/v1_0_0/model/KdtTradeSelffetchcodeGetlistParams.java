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

public class KdtTradeSelffetchcodeGetlistParams implements APIParams, FileParams  {

    private Long state;
    private Long page;
    private Long adminId;


    public void setState(Long state) {
        this.state = state;
    }

    public Long getState() {
        return this.state;
    }


    public void setPage(Long page) {
        this.page = page;
    }

    public Long getPage() {
        return this.page;
    }


    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public Long getAdminId() {
        return this.adminId;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (state != null) {
            params.put("state", state);
        }
        if (page != null) {
            params.put("page", page);
        }
        if (adminId != null) {
            params.put("admin_id", adminId);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}