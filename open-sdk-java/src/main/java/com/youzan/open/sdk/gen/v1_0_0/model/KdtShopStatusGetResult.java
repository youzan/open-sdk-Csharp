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

public class KdtShopStatusGetResult implements APIResult {

        private AccountShopStatus status;
    
    
    public void setStatus(AccountShopStatus status) {
        this.status = status;
    }

    public AccountShopStatus getStatus() {
        return this.status;
    }

    
        public static class AccountShopStatus {
                private Boolean isBindWeixin;
                private Boolean isWeixinService;
                private Boolean isWeixinUnauthorizedService;
                private Boolean isWeixinPublisher;
                private Boolean isWeixinUnauthorizedPublisher;
                private Boolean isSecuredTransactions;
                private Boolean isSetShoppingCart;
                private Boolean isSetBuyRecord;
                private Boolean isSetCustomerReviews;
                private Boolean isSetFansOnly;
        
                public void setIsBindWeixin(Boolean isBindWeixin) {
            this.isBindWeixin = isBindWeixin;
        }

        public Boolean getIsBindWeixin() {
            return this.isBindWeixin;
        }
                public void setIsWeixinService(Boolean isWeixinService) {
            this.isWeixinService = isWeixinService;
        }

        public Boolean getIsWeixinService() {
            return this.isWeixinService;
        }
                public void setIsWeixinUnauthorizedService(Boolean isWeixinUnauthorizedService) {
            this.isWeixinUnauthorizedService = isWeixinUnauthorizedService;
        }

        public Boolean getIsWeixinUnauthorizedService() {
            return this.isWeixinUnauthorizedService;
        }
                public void setIsWeixinPublisher(Boolean isWeixinPublisher) {
            this.isWeixinPublisher = isWeixinPublisher;
        }

        public Boolean getIsWeixinPublisher() {
            return this.isWeixinPublisher;
        }
                public void setIsWeixinUnauthorizedPublisher(Boolean isWeixinUnauthorizedPublisher) {
            this.isWeixinUnauthorizedPublisher = isWeixinUnauthorizedPublisher;
        }

        public Boolean getIsWeixinUnauthorizedPublisher() {
            return this.isWeixinUnauthorizedPublisher;
        }
                public void setIsSecuredTransactions(Boolean isSecuredTransactions) {
            this.isSecuredTransactions = isSecuredTransactions;
        }

        public Boolean getIsSecuredTransactions() {
            return this.isSecuredTransactions;
        }
                public void setIsSetShoppingCart(Boolean isSetShoppingCart) {
            this.isSetShoppingCart = isSetShoppingCart;
        }

        public Boolean getIsSetShoppingCart() {
            return this.isSetShoppingCart;
        }
                public void setIsSetBuyRecord(Boolean isSetBuyRecord) {
            this.isSetBuyRecord = isSetBuyRecord;
        }

        public Boolean getIsSetBuyRecord() {
            return this.isSetBuyRecord;
        }
                public void setIsSetCustomerReviews(Boolean isSetCustomerReviews) {
            this.isSetCustomerReviews = isSetCustomerReviews;
        }

        public Boolean getIsSetCustomerReviews() {
            return this.isSetCustomerReviews;
        }
                public void setIsSetFansOnly(Boolean isSetFansOnly) {
            this.isSetFansOnly = isSetFansOnly;
        }

        public Boolean getIsSetFansOnly() {
            return this.isSetFansOnly;
        }
        
    }
    
}