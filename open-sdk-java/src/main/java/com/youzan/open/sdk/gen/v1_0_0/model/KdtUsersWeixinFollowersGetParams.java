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

public class KdtUsersWeixinFollowersGetParams implements APIParams, FileParams  {

    private Date startFollow;
    private Long pageSize;
    private Long pageNo;
    private String fields;
    private Date endFollow;


    public void setStartFollow(Date startFollow) {
        this.startFollow = startFollow;
    }

    public Date getStartFollow() {
        return this.startFollow;
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


    public void setEndFollow(Date endFollow) {
        this.endFollow = endFollow;
    }

    public Date getEndFollow() {
        return this.endFollow;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (startFollow != null) {
            params.put("start_follow", startFollow);
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
        if (endFollow != null) {
            params.put("end_follow", endFollow);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}