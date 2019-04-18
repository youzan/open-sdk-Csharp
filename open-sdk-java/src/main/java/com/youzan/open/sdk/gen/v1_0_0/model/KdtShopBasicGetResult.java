package com.youzan.open.sdk.gen.v1_0_0.model;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.model.FileParams;
import com.youzan.open.sdk.model.APIResult;
import java.util.List;
import java.util.Map;
import java.util.Date;

public class KdtShopBasicGetResult implements APIResult {

        private Long sid;
        private String name;
        private String logo;
        private String url;
        private String physicalUrl;
        private Long certType;
    
    
    public void setSid(Long sid) {
        this.sid = sid;
    }

    public Long getSid() {
        return this.sid;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    
    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getLogo() {
        return this.logo;
    }

    
    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }

    
    public void setPhysicalUrl(String physicalUrl) {
        this.physicalUrl = physicalUrl;
    }

    public String getPhysicalUrl() {
        return this.physicalUrl;
    }

    
    public void setCertType(Long certType) {
        this.certType = certType;
    }

    public Long getCertType() {
        return this.certType;
    }

    
    
}