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

public class KdtUmpTimelimiteddiscountFindResult implements APIResult {

        private UmpTimelimitedDiscountGoodsJoin[] list;
        private Long count;
    
    
    public void setList(UmpTimelimitedDiscountGoodsJoin[] list) {
        this.list = list;
    }

    public UmpTimelimitedDiscountGoodsJoin[] getList() {
        return this.list;
    }

    
    public void setCount(Long count) {
        this.count = count;
    }

    public Long getCount() {
        return this.count;
    }

    
        public static class UmpTimelimitedDiscountGoodsJoin {
                private Long itemId;
                private String title;
                private String alias;
                private Float price;
                private Date createdTime;
                private Date startTime;
                private Date endTime;
                private String imageUrl;
                private Long stockNum;
                private String itemUrl;
                private Float discountPrice;
                private Long discountType;
                private String discountValue;
                private Long earseType;
        
                public void setItemId(Long itemId) {
            this.itemId = itemId;
        }

        public Long getItemId() {
            return this.itemId;
        }
                public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return this.title;
        }
                public void setAlias(String alias) {
            this.alias = alias;
        }

        public String getAlias() {
            return this.alias;
        }
                public void setPrice(Float price) {
            this.price = price;
        }

        public Float getPrice() {
            return this.price;
        }
                public void setCreatedTime(Date createdTime) {
            this.createdTime = createdTime;
        }

        public Date getCreatedTime() {
            return this.createdTime;
        }
                public void setStartTime(Date startTime) {
            this.startTime = startTime;
        }

        public Date getStartTime() {
            return this.startTime;
        }
                public void setEndTime(Date endTime) {
            this.endTime = endTime;
        }

        public Date getEndTime() {
            return this.endTime;
        }
                public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public String getImageUrl() {
            return this.imageUrl;
        }
                public void setStockNum(Long stockNum) {
            this.stockNum = stockNum;
        }

        public Long getStockNum() {
            return this.stockNum;
        }
                public void setItemUrl(String itemUrl) {
            this.itemUrl = itemUrl;
        }

        public String getItemUrl() {
            return this.itemUrl;
        }
                public void setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
        }

        public Float getDiscountPrice() {
            return this.discountPrice;
        }
                public void setDiscountType(Long discountType) {
            this.discountType = discountType;
        }

        public Long getDiscountType() {
            return this.discountType;
        }
                public void setDiscountValue(String discountValue) {
            this.discountValue = discountValue;
        }

        public String getDiscountValue() {
            return this.discountValue;
        }
                public void setEarseType(Long earseType) {
            this.earseType = earseType;
        }

        public Long getEarseType() {
            return this.earseType;
        }
        
    }
    
}