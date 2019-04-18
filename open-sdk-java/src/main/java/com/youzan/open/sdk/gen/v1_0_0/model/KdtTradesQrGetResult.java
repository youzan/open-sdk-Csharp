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

public class KdtTradesQrGetResult implements APIResult {

        private TradePayQrcode[] qrTrades;
        private Long totalResults;
    
    
    public void setQrTrades(TradePayQrcode[] qrTrades) {
        this.qrTrades = qrTrades;
    }

    public TradePayQrcode[] getQrTrades() {
        return this.qrTrades;
    }

    
    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

    
        public static class TradePayQrcode {
                private String tid;
                private String qrId;
                private String qrUrl;
                private String qrName;
                private Float qrPrice;
                private Float realPrice;
                private String payerNick;
                private String outerTid;
                private String status;
                private String payType;
                private Date bookDate;
                private Date payDate;
                private Date createdDate;
        
                public void setTid(String tid) {
            this.tid = tid;
        }

        public String getTid() {
            return this.tid;
        }
                public void setQrId(String qrId) {
            this.qrId = qrId;
        }

        public String getQrId() {
            return this.qrId;
        }
                public void setQrUrl(String qrUrl) {
            this.qrUrl = qrUrl;
        }

        public String getQrUrl() {
            return this.qrUrl;
        }
                public void setQrName(String qrName) {
            this.qrName = qrName;
        }

        public String getQrName() {
            return this.qrName;
        }
                public void setQrPrice(Float qrPrice) {
            this.qrPrice = qrPrice;
        }

        public Float getQrPrice() {
            return this.qrPrice;
        }
                public void setRealPrice(Float realPrice) {
            this.realPrice = realPrice;
        }

        public Float getRealPrice() {
            return this.realPrice;
        }
                public void setPayerNick(String payerNick) {
            this.payerNick = payerNick;
        }

        public String getPayerNick() {
            return this.payerNick;
        }
                public void setOuterTid(String outerTid) {
            this.outerTid = outerTid;
        }

        public String getOuterTid() {
            return this.outerTid;
        }
                public void setStatus(String status) {
            this.status = status;
        }

        public String getStatus() {
            return this.status;
        }
                public void setPayType(String payType) {
            this.payType = payType;
        }

        public String getPayType() {
            return this.payType;
        }
                public void setBookDate(Date bookDate) {
            this.bookDate = bookDate;
        }

        public Date getBookDate() {
            return this.bookDate;
        }
                public void setPayDate(Date payDate) {
            this.payDate = payDate;
        }

        public Date getPayDate() {
            return this.payDate;
        }
                public void setCreatedDate(Date createdDate) {
            this.createdDate = createdDate;
        }

        public Date getCreatedDate() {
            return this.createdDate;
        }
        
    }
    
}