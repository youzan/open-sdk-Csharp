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

public class KdtUmpPresentGiveResult implements APIResult {

        private Boolean isSuccess;
        private Long presentId;
        private String presentName;
        private String receiveAddress;
    
    
    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    
    public void setPresentId(Long presentId) {
        this.presentId = presentId;
    }

    public Long getPresentId() {
        return this.presentId;
    }

    
    public void setPresentName(String presentName) {
        this.presentName = presentName;
    }

    public String getPresentName() {
        return this.presentName;
    }

    
    public void setReceiveAddress(String receiveAddress) {
        this.receiveAddress = receiveAddress;
    }

    public String getReceiveAddress() {
        return this.receiveAddress;
    }

    
    
}