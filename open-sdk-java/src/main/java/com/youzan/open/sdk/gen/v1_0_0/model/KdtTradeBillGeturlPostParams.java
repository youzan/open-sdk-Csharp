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

public class KdtTradeBillGeturlPostParams implements APIParams, FileParams  {

    private Long useWxpay;
    private String source;
    private Long skuId;
    private Long price;
    private Long orderType;
    private String orderFrom;
    private Long num;
    private String message;
    private Long kdtId;
    private Long goodsId;
    private Long activityType;
    private Long activityId;
    private String activityAlias;


    public void setUseWxpay(Long useWxpay) {
        this.useWxpay = useWxpay;
    }

    public Long getUseWxpay() {
        return this.useWxpay;
    }


    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return this.source;
    }


    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSkuId() {
        return this.skuId;
    }


    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getPrice() {
        return this.price;
    }


    public void setOrderType(Long orderType) {
        this.orderType = orderType;
    }

    public Long getOrderType() {
        return this.orderType;
    }


    public void setOrderFrom(String orderFrom) {
        this.orderFrom = orderFrom;
    }

    public String getOrderFrom() {
        return this.orderFrom;
    }


    public void setNum(Long num) {
        this.num = num;
    }

    public Long getNum() {
        return this.num;
    }


    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }


    public void setKdtId(Long kdtId) {
        this.kdtId = kdtId;
    }

    public Long getKdtId() {
        return this.kdtId;
    }


    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getGoodsId() {
        return this.goodsId;
    }


    public void setActivityType(Long activityType) {
        this.activityType = activityType;
    }

    public Long getActivityType() {
        return this.activityType;
    }


    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public Long getActivityId() {
        return this.activityId;
    }


    public void setActivityAlias(String activityAlias) {
        this.activityAlias = activityAlias;
    }

    public String getActivityAlias() {
        return this.activityAlias;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (useWxpay != null) {
            params.put("use_wxpay", useWxpay);
        }
        if (source != null) {
            params.put("source", source);
        }
        if (skuId != null) {
            params.put("sku_id", skuId);
        }
        if (price != null) {
            params.put("price", price);
        }
        if (orderType != null) {
            params.put("order_type", orderType);
        }
        if (orderFrom != null) {
            params.put("order_from", orderFrom);
        }
        if (num != null) {
            params.put("num", num);
        }
        if (message != null) {
            params.put("message", message);
        }
        if (kdtId != null) {
            params.put("kdt_id", kdtId);
        }
        if (goodsId != null) {
            params.put("goods_id", goodsId);
        }
        if (activityType != null) {
            params.put("activity_type", activityType);
        }
        if (activityId != null) {
            params.put("activity_id", activityId);
        }
        if (activityAlias != null) {
            params.put("activity_alias", activityAlias);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}