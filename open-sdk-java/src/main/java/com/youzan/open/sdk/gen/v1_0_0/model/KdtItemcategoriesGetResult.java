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

public class KdtItemcategoriesGetResult implements APIResult {

        private GoodsCategory[] categories;
    
    
    public void setCategories(GoodsCategory[] categories) {
        this.categories = categories;
    }

    public GoodsCategory[] getCategories() {
        return this.categories;
    }

    
        public static class GoodsCategory {
                private Long cid;
                private Long parentCid;
                private String name;
                private Boolean isParent;
                private GoodsCategory[] subCategories;
        
                public void setCid(Long cid) {
            this.cid = cid;
        }

        public Long getCid() {
            return this.cid;
        }
                public void setParentCid(Long parentCid) {
            this.parentCid = parentCid;
        }

        public Long getParentCid() {
            return this.parentCid;
        }
                public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }
                public void setIsParent(Boolean isParent) {
            this.isParent = isParent;
        }

        public Boolean getIsParent() {
            return this.isParent;
        }
                public void setSubCategories(GoodsCategory[] subCategories) {
            this.subCategories = subCategories;
        }

        public GoodsCategory[] getSubCategories() {
            return this.subCategories;
        }
        
    }
    
}