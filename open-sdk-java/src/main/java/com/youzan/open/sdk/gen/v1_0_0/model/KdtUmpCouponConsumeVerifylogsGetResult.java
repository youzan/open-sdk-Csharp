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

public class KdtUmpCouponConsumeVerifylogsGetResult implements APIResult {

        private UmpPromotionVerifylog[] verifylogs;
    
    
    public void setVerifylogs(UmpPromotionVerifylog[] verifylogs) {
        this.verifylogs = verifylogs;
    }

    public UmpPromotionVerifylog[] getVerifylogs() {
        return this.verifylogs;
    }

    
        public static class UmpPromotionVerifylog {
                private String id;
                private String groupId;
                private String title;
                private String value;
                private String condition;
                private String description;
                private String verifyType;
                private String verifyCode;
                private String tradeNo;
                private String state;
                private String adminNickname;
                private Date createdAt;
        
                public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return this.id;
        }
                public void setGroupId(String groupId) {
            this.groupId = groupId;
        }

        public String getGroupId() {
            return this.groupId;
        }
                public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return this.title;
        }
                public void setValue(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }
                public void setCondition(String condition) {
            this.condition = condition;
        }

        public String getCondition() {
            return this.condition;
        }
                public void setDescription(String description) {
            this.description = description;
        }

        public String getDescription() {
            return this.description;
        }
                public void setVerifyType(String verifyType) {
            this.verifyType = verifyType;
        }

        public String getVerifyType() {
            return this.verifyType;
        }
                public void setVerifyCode(String verifyCode) {
            this.verifyCode = verifyCode;
        }

        public String getVerifyCode() {
            return this.verifyCode;
        }
                public void setTradeNo(String tradeNo) {
            this.tradeNo = tradeNo;
        }

        public String getTradeNo() {
            return this.tradeNo;
        }
                public void setState(String state) {
            this.state = state;
        }

        public String getState() {
            return this.state;
        }
                public void setAdminNickname(String adminNickname) {
            this.adminNickname = adminNickname;
        }

        public String getAdminNickname() {
            return this.adminNickname;
        }
                public void setCreatedAt(Date createdAt) {
            this.createdAt = createdAt;
        }

        public Date getCreatedAt() {
            return this.createdAt;
        }
        
    }
    
}