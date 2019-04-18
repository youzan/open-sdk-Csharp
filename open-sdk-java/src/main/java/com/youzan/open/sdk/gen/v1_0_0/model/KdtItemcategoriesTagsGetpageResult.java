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

public class KdtItemcategoriesTagsGetpageResult implements APIResult {

        private GoodsTag[] tags;
        private Long totalResults;
    
    
    public void setTags(GoodsTag[] tags) {
        this.tags = tags;
    }

    public GoodsTag[] getTags() {
        return this.tags;
    }

    
    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

    
        public static class GoodsTag {
                private Long id;
                private String name;
                private Long type;
                private String created;
                private Long itemNum;
                private String tagUrl;
                private String shareUrl;
                private String desc;
        
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
                public void setType(Long type) {
            this.type = type;
        }

        public Long getType() {
            return this.type;
        }
                public void setCreated(String created) {
            this.created = created;
        }

        public String getCreated() {
            return this.created;
        }
                public void setItemNum(Long itemNum) {
            this.itemNum = itemNum;
        }

        public Long getItemNum() {
            return this.itemNum;
        }
                public void setTagUrl(String tagUrl) {
            this.tagUrl = tagUrl;
        }

        public String getTagUrl() {
            return this.tagUrl;
        }
                public void setShareUrl(String shareUrl) {
            this.shareUrl = shareUrl;
        }

        public String getShareUrl() {
            return this.shareUrl;
        }
                public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getDesc() {
            return this.desc;
        }
        
    }
    
}