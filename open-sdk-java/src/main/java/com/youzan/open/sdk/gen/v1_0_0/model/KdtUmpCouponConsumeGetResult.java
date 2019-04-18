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

public class KdtUmpCouponConsumeGetResult implements APIResult {

        private String code;
        private Long status;
        private Date consumeAt;
        private String consumeId;
        private UmpCoupon coupon;
    
    
    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

    
    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getStatus() {
        return this.status;
    }

    
    public void setConsumeAt(Date consumeAt) {
        this.consumeAt = consumeAt;
    }

    public Date getConsumeAt() {
        return this.consumeAt;
    }

    
    public void setConsumeId(String consumeId) {
        this.consumeId = consumeId;
    }

    public String getConsumeId() {
        return this.consumeId;
    }

    
    public void setCoupon(UmpCoupon coupon) {
        this.coupon = coupon;
    }

    public UmpCoupon getCoupon() {
        return this.coupon;
    }

    
        public static class UmpCoupon {
                private Long groupId;
                private String couponType;
                private String rangeType;
                private String title;
                private Float value;
                private Long isRandom;
                private Float valueRandomTo;
                private Long needUserLevel;
                private String userLevelName;
                private Long quota;
                private Long isAtLeast;
                private Float atLeast;
                private Long total;
                private Long stock;
                private Date startAt;
                private Date endAt;
                private Long expireNotice;
                private String description;
                private Long isForbidPreference;
                private Long isSyncWeixin;
                private String weixinCardId;
                private Long status;
                private Long isShare;
                private String fetchUrl;
                private Long statFetchUserNum;
                private Long statFetchNum;
                private Long statUseNum;
                private Date created;
        
                public void setGroupId(Long groupId) {
            this.groupId = groupId;
        }

        public Long getGroupId() {
            return this.groupId;
        }
                public void setCouponType(String couponType) {
            this.couponType = couponType;
        }

        public String getCouponType() {
            return this.couponType;
        }
                public void setRangeType(String rangeType) {
            this.rangeType = rangeType;
        }

        public String getRangeType() {
            return this.rangeType;
        }
                public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return this.title;
        }
                public void setValue(Float value) {
            this.value = value;
        }

        public Float getValue() {
            return this.value;
        }
                public void setIsRandom(Long isRandom) {
            this.isRandom = isRandom;
        }

        public Long getIsRandom() {
            return this.isRandom;
        }
                public void setValueRandomTo(Float valueRandomTo) {
            this.valueRandomTo = valueRandomTo;
        }

        public Float getValueRandomTo() {
            return this.valueRandomTo;
        }
                public void setNeedUserLevel(Long needUserLevel) {
            this.needUserLevel = needUserLevel;
        }

        public Long getNeedUserLevel() {
            return this.needUserLevel;
        }
                public void setUserLevelName(String userLevelName) {
            this.userLevelName = userLevelName;
        }

        public String getUserLevelName() {
            return this.userLevelName;
        }
                public void setQuota(Long quota) {
            this.quota = quota;
        }

        public Long getQuota() {
            return this.quota;
        }
                public void setIsAtLeast(Long isAtLeast) {
            this.isAtLeast = isAtLeast;
        }

        public Long getIsAtLeast() {
            return this.isAtLeast;
        }
                public void setAtLeast(Float atLeast) {
            this.atLeast = atLeast;
        }

        public Float getAtLeast() {
            return this.atLeast;
        }
                public void setTotal(Long total) {
            this.total = total;
        }

        public Long getTotal() {
            return this.total;
        }
                public void setStock(Long stock) {
            this.stock = stock;
        }

        public Long getStock() {
            return this.stock;
        }
                public void setStartAt(Date startAt) {
            this.startAt = startAt;
        }

        public Date getStartAt() {
            return this.startAt;
        }
                public void setEndAt(Date endAt) {
            this.endAt = endAt;
        }

        public Date getEndAt() {
            return this.endAt;
        }
                public void setExpireNotice(Long expireNotice) {
            this.expireNotice = expireNotice;
        }

        public Long getExpireNotice() {
            return this.expireNotice;
        }
                public void setDescription(String description) {
            this.description = description;
        }

        public String getDescription() {
            return this.description;
        }
                public void setIsForbidPreference(Long isForbidPreference) {
            this.isForbidPreference = isForbidPreference;
        }

        public Long getIsForbidPreference() {
            return this.isForbidPreference;
        }
                public void setIsSyncWeixin(Long isSyncWeixin) {
            this.isSyncWeixin = isSyncWeixin;
        }

        public Long getIsSyncWeixin() {
            return this.isSyncWeixin;
        }
                public void setWeixinCardId(String weixinCardId) {
            this.weixinCardId = weixinCardId;
        }

        public String getWeixinCardId() {
            return this.weixinCardId;
        }
                public void setStatus(Long status) {
            this.status = status;
        }

        public Long getStatus() {
            return this.status;
        }
                public void setIsShare(Long isShare) {
            this.isShare = isShare;
        }

        public Long getIsShare() {
            return this.isShare;
        }
                public void setFetchUrl(String fetchUrl) {
            this.fetchUrl = fetchUrl;
        }

        public String getFetchUrl() {
            return this.fetchUrl;
        }
                public void setStatFetchUserNum(Long statFetchUserNum) {
            this.statFetchUserNum = statFetchUserNum;
        }

        public Long getStatFetchUserNum() {
            return this.statFetchUserNum;
        }
                public void setStatFetchNum(Long statFetchNum) {
            this.statFetchNum = statFetchNum;
        }

        public Long getStatFetchNum() {
            return this.statFetchNum;
        }
                public void setStatUseNum(Long statUseNum) {
            this.statUseNum = statUseNum;
        }

        public Long getStatUseNum() {
            return this.statUseNum;
        }
                public void setCreated(Date created) {
            this.created = created;
        }

        public Date getCreated() {
            return this.created;
        }
        
    }
    
}