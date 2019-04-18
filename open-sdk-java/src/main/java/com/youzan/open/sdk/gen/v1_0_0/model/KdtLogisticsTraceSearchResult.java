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

public class KdtLogisticsTraceSearchResult implements APIResult {

        private String outSid;
        private String companyName;
        private String tid;
        private String status;
        private TradeLogisticsTrack[] traceList;
    
    
    public void setOutSid(String outSid) {
        this.outSid = outSid;
    }

    public String getOutSid() {
        return this.outSid;
    }

    
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    
    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTid() {
        return this.tid;
    }

    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    
    public void setTraceList(TradeLogisticsTrack[] traceList) {
        this.traceList = traceList;
    }

    public TradeLogisticsTrack[] getTraceList() {
        return this.traceList;
    }

    
        public static class TradeLogisticsTrack {
                private String statusTime;
                private String statusDesc;
        
                public void setStatusTime(String statusTime) {
            this.statusTime = statusTime;
        }

        public String getStatusTime() {
            return this.statusTime;
        }
                public void setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
        }

        public String getStatusDesc() {
            return this.statusDesc;
        }
        
    }
    
}