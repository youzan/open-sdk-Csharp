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

public class KdtUsersWeixinFollowerGetsParams implements APIParams, FileParams  {

    private String weixinOpenids;
    private String userIds;
    private Long pageSize;
    private Long pageNo;
    private String fields;


    public void setWeixinOpenids(String weixinOpenids) {
        this.weixinOpenids = weixinOpenids;
    }

    public String getWeixinOpenids() {
        return this.weixinOpenids;
    }


    public void setUserIds(String userIds) {
        this.userIds = userIds;
    }

    public String getUserIds() {
        return this.userIds;
    }


    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }


    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public Long getPageNo() {
        return this.pageNo;
    }


    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (weixinOpenids != null) {
            params.put("weixin_openids", weixinOpenids);
        }
        if (userIds != null) {
            params.put("user_ids", userIds);
        }
        if (pageSize != null) {
            params.put("page_size", pageSize);
        }
        if (pageNo != null) {
            params.put("page_no", pageNo);
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