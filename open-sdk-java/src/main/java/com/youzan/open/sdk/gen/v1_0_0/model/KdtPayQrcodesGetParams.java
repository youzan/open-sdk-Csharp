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

public class KdtPayQrcodesGetParams implements APIParams, FileParams  {

    private String shopType;
    private String shopId;
    private String qrType;
    private Long pageSize;
    private Long pageNo;
    private String labelIds;
    private String ignoreQrcode;


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


    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }


    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public Long getPageNo() {
        return this.pageNo;
    }


    public void setLabelIds(String labelIds) {
        this.labelIds = labelIds;
    }

    public String getLabelIds() {
        return this.labelIds;
    }


    public void setIgnoreQrcode(String ignoreQrcode) {
        this.ignoreQrcode = ignoreQrcode;
    }

    public String getIgnoreQrcode() {
        return this.ignoreQrcode;
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
        if (pageSize != null) {
            params.put("page_size", pageSize);
        }
        if (pageNo != null) {
            params.put("page_no", pageNo);
        }
        if (labelIds != null) {
            params.put("label_ids", labelIds);
        }
        if (ignoreQrcode != null) {
            params.put("ignore_qrcode", ignoreQrcode);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}