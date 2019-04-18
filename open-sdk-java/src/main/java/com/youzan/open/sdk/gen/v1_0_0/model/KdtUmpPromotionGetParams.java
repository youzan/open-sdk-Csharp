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

public class KdtUmpPromotionGetParams implements APIParams, FileParams  {

    private Long itemId;
    private String fansType;
    private String fansId;
    private String buyerId;


    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }


    public void setFansType(String fansType) {
        this.fansType = fansType;
    }

    public String getFansType() {
        return this.fansType;
    }


    public void setFansId(String fansId) {
        this.fansId = fansId;
    }

    public String getFansId() {
        return this.fansId;
    }


    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getBuyerId() {
        return this.buyerId;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (itemId != null) {
            params.put("item_id", itemId);
        }
        if (fansType != null) {
            params.put("fans_type", fansType);
        }
        if (fansId != null) {
            params.put("fans_id", fansId);
        }
        if (buyerId != null) {
            params.put("buyer_id", buyerId);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}