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

public class KdtItemsCustomGetResult implements APIResult {

        private GoodsDetail[] items;
    
    
    public void setItems(GoodsDetail[] items) {
        this.items = items;
    }

    public GoodsDetail[] getItems() {
        return this.items;
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
        public static class GoodsImage {
                private Long id;
                private Date created;
                private String url;
                private String thumbnail;
                private String medium;
                private String combine;
        
                public void setId(Long id) {
            this.id = id;
        }

        public Long getId() {
            return this.id;
        }
                public void setCreated(Date created) {
            this.created = created;
        }

        public Date getCreated() {
            return this.created;
        }
                public void setUrl(String url) {
            this.url = url;
        }

        public String getUrl() {
            return this.url;
        }
                public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        public String getThumbnail() {
            return this.thumbnail;
        }
                public void setMedium(String medium) {
            this.medium = medium;
        }

        public String getMedium() {
            return this.medium;
        }
                public void setCombine(String combine) {
            this.combine = combine;
        }

        public String getCombine() {
            return this.combine;
        }
        
    }
        public static class GoodsQrcode {
                private Long id;
                private String name;
                private String desc;
                private Date created;
                private String type;
                private String discount;
                private Float decrease;
                private String linkUrl;
                private String weixinQrcodeUrl;
        
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
                public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getDesc() {
            return this.desc;
        }
                public void setCreated(Date created) {
            this.created = created;
        }

        public Date getCreated() {
            return this.created;
        }
                public void setType(String type) {
            this.type = type;
        }

        public String getType() {
            return this.type;
        }
                public void setDiscount(String discount) {
            this.discount = discount;
        }

        public String getDiscount() {
            return this.discount;
        }
                public void setDecrease(Float decrease) {
            this.decrease = decrease;
        }

        public Float getDecrease() {
            return this.decrease;
        }
                public void setLinkUrl(String linkUrl) {
            this.linkUrl = linkUrl;
        }

        public String getLinkUrl() {
            return this.linkUrl;
        }
                public void setWeixinQrcodeUrl(String weixinQrcodeUrl) {
            this.weixinQrcodeUrl = weixinQrcodeUrl;
        }

        public String getWeixinQrcodeUrl() {
            return this.weixinQrcodeUrl;
        }
        
    }
        public static class GoodsDetail {
                private Long numIid;
                private String alias;
                private String title;
                private Long cid;
                private Long promotionCid;
                private String tagIds;
                private String desc;
                private String originPrice;
                private String outerId;
                private String outerBuyUrl;
                private Long buyQuota;
                private Date created;
                private Boolean isVirtual;
                private Long virtualType;
                private Long itemValidityStart;
                private Long itemValidityEnd;
                private Long effectiveType;
                private Long effectiveDelayHours;
                private Long holidaysAvailable;
                private Boolean isListing;
                private Boolean isLock;
                private Boolean isUsed;
                private String productType;
                private Date autoListingTime;
                private String detailUrl;
                private String shareUrl;
                private String picUrl;
                private String picThumbUrl;
                private Long num;
                private Long soldNum;
                private Float price;
                private Long postType;
                private Float postFee;
                private String deliveryTemplateFee;
                private Long deliveryTemplateId;
                private String deliveryTemplateName;
                private GoodsSku[] skus;
                private GoodsImage[] itemImgs;
                private GoodsQrcode[] itemQrcodes;
                private GoodsTag[] itemTags;
                private Long itemType;
                private Boolean isSupplierItem;
                private Long likeCount;
                private Long templateId;
                private String templateTitle;
                private Boolean joinLevelDiscount;
                private Object messages;
                private Long order;
                private Long purchaseRight;
                private Object umpTags;
                private Object umpLevel;
                private Object umpTagsText;
                private Object umpLevelText;
        
                public void setNumIid(Long numIid) {
            this.numIid = numIid;
        }

        public Long getNumIid() {
            return this.numIid;
        }
                public void setAlias(String alias) {
            this.alias = alias;
        }

        public String getAlias() {
            return this.alias;
        }
                public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return this.title;
        }
                public void setCid(Long cid) {
            this.cid = cid;
        }

        public Long getCid() {
            return this.cid;
        }
                public void setPromotionCid(Long promotionCid) {
            this.promotionCid = promotionCid;
        }

        public Long getPromotionCid() {
            return this.promotionCid;
        }
                public void setTagIds(String tagIds) {
            this.tagIds = tagIds;
        }

        public String getTagIds() {
            return this.tagIds;
        }
                public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getDesc() {
            return this.desc;
        }
                public void setOriginPrice(String originPrice) {
            this.originPrice = originPrice;
        }

        public String getOriginPrice() {
            return this.originPrice;
        }
                public void setOuterId(String outerId) {
            this.outerId = outerId;
        }

        public String getOuterId() {
            return this.outerId;
        }
                public void setOuterBuyUrl(String outerBuyUrl) {
            this.outerBuyUrl = outerBuyUrl;
        }

        public String getOuterBuyUrl() {
            return this.outerBuyUrl;
        }
                public void setBuyQuota(Long buyQuota) {
            this.buyQuota = buyQuota;
        }

        public Long getBuyQuota() {
            return this.buyQuota;
        }
                public void setCreated(Date created) {
            this.created = created;
        }

        public Date getCreated() {
            return this.created;
        }
                public void setIsVirtual(Boolean isVirtual) {
            this.isVirtual = isVirtual;
        }

        public Boolean getIsVirtual() {
            return this.isVirtual;
        }
                public void setVirtualType(Long virtualType) {
            this.virtualType = virtualType;
        }

        public Long getVirtualType() {
            return this.virtualType;
        }
                public void setItemValidityStart(Long itemValidityStart) {
            this.itemValidityStart = itemValidityStart;
        }

        public Long getItemValidityStart() {
            return this.itemValidityStart;
        }
                public void setItemValidityEnd(Long itemValidityEnd) {
            this.itemValidityEnd = itemValidityEnd;
        }

        public Long getItemValidityEnd() {
            return this.itemValidityEnd;
        }
                public void setEffectiveType(Long effectiveType) {
            this.effectiveType = effectiveType;
        }

        public Long getEffectiveType() {
            return this.effectiveType;
        }
                public void setEffectiveDelayHours(Long effectiveDelayHours) {
            this.effectiveDelayHours = effectiveDelayHours;
        }

        public Long getEffectiveDelayHours() {
            return this.effectiveDelayHours;
        }
                public void setHolidaysAvailable(Long holidaysAvailable) {
            this.holidaysAvailable = holidaysAvailable;
        }

        public Long getHolidaysAvailable() {
            return this.holidaysAvailable;
        }
                public void setIsListing(Boolean isListing) {
            this.isListing = isListing;
        }

        public Boolean getIsListing() {
            return this.isListing;
        }
                public void setIsLock(Boolean isLock) {
            this.isLock = isLock;
        }

        public Boolean getIsLock() {
            return this.isLock;
        }
                public void setIsUsed(Boolean isUsed) {
            this.isUsed = isUsed;
        }

        public Boolean getIsUsed() {
            return this.isUsed;
        }
                public void setProductType(String productType) {
            this.productType = productType;
        }

        public String getProductType() {
            return this.productType;
        }
                public void setAutoListingTime(Date autoListingTime) {
            this.autoListingTime = autoListingTime;
        }

        public Date getAutoListingTime() {
            return this.autoListingTime;
        }
                public void setDetailUrl(String detailUrl) {
            this.detailUrl = detailUrl;
        }

        public String getDetailUrl() {
            return this.detailUrl;
        }
                public void setShareUrl(String shareUrl) {
            this.shareUrl = shareUrl;
        }

        public String getShareUrl() {
            return this.shareUrl;
        }
                public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public String getPicUrl() {
            return this.picUrl;
        }
                public void setPicThumbUrl(String picThumbUrl) {
            this.picThumbUrl = picThumbUrl;
        }

        public String getPicThumbUrl() {
            return this.picThumbUrl;
        }
                public void setNum(Long num) {
            this.num = num;
        }

        public Long getNum() {
            return this.num;
        }
                public void setSoldNum(Long soldNum) {
            this.soldNum = soldNum;
        }

        public Long getSoldNum() {
            return this.soldNum;
        }
                public void setPrice(Float price) {
            this.price = price;
        }

        public Float getPrice() {
            return this.price;
        }
                public void setPostType(Long postType) {
            this.postType = postType;
        }

        public Long getPostType() {
            return this.postType;
        }
                public void setPostFee(Float postFee) {
            this.postFee = postFee;
        }

        public Float getPostFee() {
            return this.postFee;
        }
                public void setDeliveryTemplateFee(String deliveryTemplateFee) {
            this.deliveryTemplateFee = deliveryTemplateFee;
        }

        public String getDeliveryTemplateFee() {
            return this.deliveryTemplateFee;
        }
                public void setDeliveryTemplateId(Long deliveryTemplateId) {
            this.deliveryTemplateId = deliveryTemplateId;
        }

        public Long getDeliveryTemplateId() {
            return this.deliveryTemplateId;
        }
                public void setDeliveryTemplateName(String deliveryTemplateName) {
            this.deliveryTemplateName = deliveryTemplateName;
        }

        public String getDeliveryTemplateName() {
            return this.deliveryTemplateName;
        }
                public void setSkus(GoodsSku[] skus) {
            this.skus = skus;
        }

        public GoodsSku[] getSkus() {
            return this.skus;
        }
                public void setItemImgs(GoodsImage[] itemImgs) {
            this.itemImgs = itemImgs;
        }

        public GoodsImage[] getItemImgs() {
            return this.itemImgs;
        }
                public void setItemQrcodes(GoodsQrcode[] itemQrcodes) {
            this.itemQrcodes = itemQrcodes;
        }

        public GoodsQrcode[] getItemQrcodes() {
            return this.itemQrcodes;
        }
                public void setItemTags(GoodsTag[] itemTags) {
            this.itemTags = itemTags;
        }

        public GoodsTag[] getItemTags() {
            return this.itemTags;
        }
                public void setItemType(Long itemType) {
            this.itemType = itemType;
        }

        public Long getItemType() {
            return this.itemType;
        }
                public void setIsSupplierItem(Boolean isSupplierItem) {
            this.isSupplierItem = isSupplierItem;
        }

        public Boolean getIsSupplierItem() {
            return this.isSupplierItem;
        }
                public void setLikeCount(Long likeCount) {
            this.likeCount = likeCount;
        }

        public Long getLikeCount() {
            return this.likeCount;
        }
                public void setTemplateId(Long templateId) {
            this.templateId = templateId;
        }

        public Long getTemplateId() {
            return this.templateId;
        }
                public void setTemplateTitle(String templateTitle) {
            this.templateTitle = templateTitle;
        }

        public String getTemplateTitle() {
            return this.templateTitle;
        }
                public void setJoinLevelDiscount(Boolean joinLevelDiscount) {
            this.joinLevelDiscount = joinLevelDiscount;
        }

        public Boolean getJoinLevelDiscount() {
            return this.joinLevelDiscount;
        }
                public void setMessages(Object messages) {
            this.messages = messages;
        }

        public Object getMessages() {
            return this.messages;
        }
                public void setOrder(Long order) {
            this.order = order;
        }

        public Long getOrder() {
            return this.order;
        }
                public void setPurchaseRight(Long purchaseRight) {
            this.purchaseRight = purchaseRight;
        }

        public Long getPurchaseRight() {
            return this.purchaseRight;
        }
                public void setUmpTags(Object umpTags) {
            this.umpTags = umpTags;
        }

        public Object getUmpTags() {
            return this.umpTags;
        }
                public void setUmpLevel(Object umpLevel) {
            this.umpLevel = umpLevel;
        }

        public Object getUmpLevel() {
            return this.umpLevel;
        }
                public void setUmpTagsText(Object umpTagsText) {
            this.umpTagsText = umpTagsText;
        }

        public Object getUmpTagsText() {
            return this.umpTagsText;
        }
                public void setUmpLevelText(Object umpLevelText) {
            this.umpLevelText = umpLevelText;
        }

        public Object getUmpLevelText() {
            return this.umpLevelText;
        }
        
    }
    
}