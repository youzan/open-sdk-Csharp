package com.youzan.open.sdk.gen.v1_0_0.model;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.model.ByteWrapper;
import com.youzan.open.sdk.model.FileParams;
import java.util.List;
import java.util.Map;
import java.util.Date;

public class KdtItemUpdateParams implements APIParams, FileParams  {

    private String umpTags;
    private String umpLevel;
    private String title;
    private String templateId;
    private String tagIds;
    private String skusWithJson;
    private String skuQuantities;
    private String skuProperties;
    private String skuPrices;
    private String skuOuterIds;
    private String quantity;
    private Long purchaseRight;
    private Long promotionCid;
    private Float price;
    private Float postFee;
    private String outerId;
    private String originPrice;
    private Long numIid;
    private String messages;
    private String keepItemImgIds;
    private Long joinLevelDiscount;
    private Boolean isUsed;
    private ByteWrapper[] images;
    private String imageIds;
    private Long hideQuantity;
    private String fields;
    private String desc;
    private Long deliveryTemplateId;
    private Long cid;
    private String buyUrl;
    private Long buyQuota;
    private Long autoListingTime;


    public void setUmpTags(String umpTags) {
        this.umpTags = umpTags;
    }

    public String getUmpTags() {
        return this.umpTags;
    }


    public void setUmpLevel(String umpLevel) {
        this.umpLevel = umpLevel;
    }

    public String getUmpLevel() {
        return this.umpLevel;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }


    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getTemplateId() {
        return this.templateId;
    }


    public void setTagIds(String tagIds) {
        this.tagIds = tagIds;
    }

    public String getTagIds() {
        return this.tagIds;
    }


    public void setSkusWithJson(String skusWithJson) {
        this.skusWithJson = skusWithJson;
    }

    public String getSkusWithJson() {
        return this.skusWithJson;
    }


    public void setSkuQuantities(String skuQuantities) {
        this.skuQuantities = skuQuantities;
    }

    public String getSkuQuantities() {
        return this.skuQuantities;
    }


    public void setSkuProperties(String skuProperties) {
        this.skuProperties = skuProperties;
    }

    public String getSkuProperties() {
        return this.skuProperties;
    }


    public void setSkuPrices(String skuPrices) {
        this.skuPrices = skuPrices;
    }

    public String getSkuPrices() {
        return this.skuPrices;
    }


    public void setSkuOuterIds(String skuOuterIds) {
        this.skuOuterIds = skuOuterIds;
    }

    public String getSkuOuterIds() {
        return this.skuOuterIds;
    }


    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getQuantity() {
        return this.quantity;
    }


    public void setPurchaseRight(Long purchaseRight) {
        this.purchaseRight = purchaseRight;
    }

    public Long getPurchaseRight() {
        return this.purchaseRight;
    }


    public void setPromotionCid(Long promotionCid) {
        this.promotionCid = promotionCid;
    }

    public Long getPromotionCid() {
        return this.promotionCid;
    }


    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getPrice() {
        return this.price;
    }


    public void setPostFee(Float postFee) {
        this.postFee = postFee;
    }

    public Float getPostFee() {
        return this.postFee;
    }


    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public String getOuterId() {
        return this.outerId;
    }


    public void setOriginPrice(String originPrice) {
        this.originPrice = originPrice;
    }

    public String getOriginPrice() {
        return this.originPrice;
    }


    public void setNumIid(Long numIid) {
        this.numIid = numIid;
    }

    public Long getNumIid() {
        return this.numIid;
    }


    public void setMessages(String messages) {
        this.messages = messages;
    }

    public String getMessages() {
        return this.messages;
    }


    public void setKeepItemImgIds(String keepItemImgIds) {
        this.keepItemImgIds = keepItemImgIds;
    }

    public String getKeepItemImgIds() {
        return this.keepItemImgIds;
    }


    public void setJoinLevelDiscount(Long joinLevelDiscount) {
        this.joinLevelDiscount = joinLevelDiscount;
    }

    public Long getJoinLevelDiscount() {
        return this.joinLevelDiscount;
    }


    public void setIsUsed(Boolean isUsed) {
        this.isUsed = isUsed;
    }

    public Boolean getIsUsed() {
        return this.isUsed;
    }


    public void setImages(ByteWrapper[] images) {
        this.images = images;
    }

    public ByteWrapper[] getImages() {
        return this.images;
    }


    public void setImageIds(String imageIds) {
        this.imageIds = imageIds;
    }

    public String getImageIds() {
        return this.imageIds;
    }


    public void setHideQuantity(Long hideQuantity) {
        this.hideQuantity = hideQuantity;
    }

    public Long getHideQuantity() {
        return this.hideQuantity;
    }


    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }


    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
    }


    public void setDeliveryTemplateId(Long deliveryTemplateId) {
        this.deliveryTemplateId = deliveryTemplateId;
    }

    public Long getDeliveryTemplateId() {
        return this.deliveryTemplateId;
    }


    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Long getCid() {
        return this.cid;
    }


    public void setBuyUrl(String buyUrl) {
        this.buyUrl = buyUrl;
    }

    public String getBuyUrl() {
        return this.buyUrl;
    }


    public void setBuyQuota(Long buyQuota) {
        this.buyQuota = buyQuota;
    }

    public Long getBuyQuota() {
        return this.buyQuota;
    }


    public void setAutoListingTime(Long autoListingTime) {
        this.autoListingTime = autoListingTime;
    }

    public Long getAutoListingTime() {
        return this.autoListingTime;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (umpTags != null) {
            params.put("ump_tags", umpTags);
        }
        if (umpLevel != null) {
            params.put("ump_level", umpLevel);
        }
        if (title != null) {
            params.put("title", title);
        }
        if (templateId != null) {
            params.put("template_id", templateId);
        }
        if (tagIds != null) {
            params.put("tag_ids", tagIds);
        }
        if (skusWithJson != null) {
            params.put("skus_with_json", skusWithJson);
        }
        if (skuQuantities != null) {
            params.put("sku_quantities", skuQuantities);
        }
        if (skuProperties != null) {
            params.put("sku_properties", skuProperties);
        }
        if (skuPrices != null) {
            params.put("sku_prices", skuPrices);
        }
        if (skuOuterIds != null) {
            params.put("sku_outer_ids", skuOuterIds);
        }
        if (quantity != null) {
            params.put("quantity", quantity);
        }
        if (purchaseRight != null) {
            params.put("purchase_right", purchaseRight);
        }
        if (promotionCid != null) {
            params.put("promotion_cid", promotionCid);
        }
        if (price != null) {
            params.put("price", price);
        }
        if (postFee != null) {
            params.put("post_fee", postFee);
        }
        if (outerId != null) {
            params.put("outer_id", outerId);
        }
        if (originPrice != null) {
            params.put("origin_price", originPrice);
        }
        if (numIid != null) {
            params.put("num_iid", numIid);
        }
        if (messages != null) {
            params.put("messages", messages);
        }
        if (keepItemImgIds != null) {
            params.put("keep_item_img_ids", keepItemImgIds);
        }
        if (joinLevelDiscount != null) {
            params.put("join_level_discount", joinLevelDiscount);
        }
        if (isUsed != null) {
            params.put("is_used", isUsed);
        }
        if (imageIds != null) {
            params.put("image_ids", imageIds);
        }
        if (hideQuantity != null) {
            params.put("hide_quantity", hideQuantity);
        }
        if (fields != null) {
            params.put("fields", fields);
        }
        if (desc != null) {
            params.put("desc", desc);
        }
        if (deliveryTemplateId != null) {
            params.put("delivery_template_id", deliveryTemplateId);
        }
        if (cid != null) {
            params.put("cid", cid);
        }
        if (buyUrl != null) {
            params.put("buy_url", buyUrl);
        }
        if (buyQuota != null) {
            params.put("buy_quota", buyQuota);
        }
        if (autoListingTime != null) {
            params.put("auto_listing_time", autoListingTime);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            if (images != null) {
            for (ByteWrapper wrapper : images) {
                params.put("images[]", wrapper);
            }
        }
            return params;
    }


}