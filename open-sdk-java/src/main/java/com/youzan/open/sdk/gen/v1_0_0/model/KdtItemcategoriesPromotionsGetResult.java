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

public class KdtItemcategoriesPromotionsGetResult implements APIResult {

        private GoodsPromotionCategory[] categories;
    
    
    public void setCategories(GoodsPromotionCategory[] categories) {
        this.categories = categories;
    }

    public GoodsPromotionCategory[] getCategories() {
        return this.categories;
    }

    
        public static class GoodsPromotionCategory {
                private Long id;
                private String name;
        
                public void setId(Long id) {
            this.id = id;
        }

        public Long getId() {
            return this.id;
        }
                public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }
        
    }
    
}