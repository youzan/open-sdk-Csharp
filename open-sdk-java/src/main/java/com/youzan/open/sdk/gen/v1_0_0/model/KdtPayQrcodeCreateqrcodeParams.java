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

public class KdtPayQrcodeCreateqrcodeParams implements APIParams, FileParams  {

    private String shopType;
    private String shopId;
    private String qrType;
    private String qrSource;
    private String qrPrice;
    private String qrName;
    private String labelIds;


    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    public String getShopType() {
        return this.shopType;
    }


    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopId() {
        return this.shopId;
    }


    public void setQrType(String qrType) {
        this.qrType = qrType;
    }

    public String getQrType() {
        return this.qrType;
    }


    public void setQrSource(String qrSource) {
        this.qrSource = qrSource;
    }

    public String getQrSource() {
        return this.qrSource;
    }


    public void setQrPrice(String qrPrice) {
        this.qrPrice = qrPrice;
    }

    public String getQrPrice() {
        return this.qrPrice;
    }


    public void setQrName(String qrName) {
        this.qrName = qrName;
    }

    public String getQrName() {
        return this.qrName;
    }


    public void setLabelIds(String labelIds) {
        this.labelIds = labelIds;
    }

    public String getLabelIds() {
        return this.labelIds;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (shopType != null) {
            params.put("shop_type", shopType);
        }
        if (shopId != null) {
            params.put("shop_id", shopId);
        }
        if (qrType != null) {
            params.put("qr_type", qrType);
        }
        if (qrSource != null) {
            params.put("qr_source", qrSource);
        }
        if (qrPrice != null) {
            params.put("qr_price", qrPrice);
        }
        if (qrName != null) {
            params.put("qr_name", qrName);
        }
        if (labelIds != null) {
            params.put("label_ids", labelIds);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}