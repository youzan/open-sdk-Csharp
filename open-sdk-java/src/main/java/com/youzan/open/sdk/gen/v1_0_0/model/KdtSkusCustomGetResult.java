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

public class KdtSkusCustomGetResult implements APIResult {

        private GoodsSku[] skus;
    
    
    public void setSkus(GoodsSku[] skus) {
        this.skus = skus;
    }

    public GoodsSku[] getSkus() {
        return this.skus;
    }

    
        public static class GoodsSku {
                private String outerId;
                private Long skuId;
                private String skuUniqueCode;
                private Long numIid;
                private Long quantity;
                private String propertiesName;
                private String propertiesNameJson;
                private Long withHoldQuantity;
                private Float price;
                private Date created;
                private Date modified;
        
                public void setOuterId(String outerId) {
            this.outerId = outerId;
        }

        public String getOuterId() {
            return this.outerId;
        }
                public void setSkuId(Long skuId) {
            this.skuId = skuId;
        }

        public Long getSkuId() {
            return this.skuId;
        }
                public void setSkuUniqueCode(String skuUniqueCode) {
            this.skuUniqueCode = skuUniqueCode;
        }

        public String getSkuUniqueCode() {
            return this.skuUniqueCode;
        }
                public void setNumIid(Long numIid) {
            this.numIid = numIid;
        }

        public Long getNumIid() {
            return this.numIid;
        }
                public void setQuantity(Long quantity) {
            this.quantity = quantity;
        }

        public Long getQuantity() {
            return this.quantity;
        }
                public void setPropertiesName(String propertiesName) {
            this.propertiesName = propertiesName;
        }

        public String getPropertiesName() {
            return this.propertiesName;
        }
                public void setPropertiesNameJson(String propertiesNameJson) {
            this.propertiesNameJson = propertiesNameJson;
        }

        public String getPropertiesNameJson() {
            return this.propertiesNameJson;
        }
                public void setWithHoldQuantity(Long withHoldQuantity) {
            this.withHoldQuantity = withHoldQuantity;
        }

        public Long getWithHoldQuantity() {
            return this.withHoldQuantity;
        }
                public void setPrice(Float price) {
            this.price = price;
        }

        public Float getPrice() {
            return this.price;
        }
                public void setCreated(Date created) {
            this.created = created;
        }

        public Date getCreated() {
            return this.created;
        }
                public void setModified(Date modified) {
            this.modified = modified;
        }

        public Date getModified() {
            return this.modified;
        }
        
    }
    
}