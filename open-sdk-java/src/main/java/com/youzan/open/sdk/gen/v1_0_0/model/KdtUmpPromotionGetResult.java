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

public class KdtUmpPromotionGetResult implements APIResult {

        private Long itemPromotion;
        private Long orderPromotions;
        private Long goodsPoints;
        private Long packageBuy;
    
    
    public void setItemPromotion(Long itemPromotion) {
        this.itemPromotion = itemPromotion;
    }

    public Long getItemPromotion() {
        return this.itemPromotion;
    }

    
    public void setOrderPromotions(Long orderPromotions) {
        this.orderPromotions = orderPromotions;
    }

    public Long getOrderPromotions() {
        return this.orderPromotions;
    }

    
    public void setGoodsPoints(Long goodsPoints) {
        this.goodsPoints = goodsPoints;
    }

    public Long getGoodsPoints() {
        return this.goodsPoints;
    }

    
    public void setPackageBuy(Long packageBuy) {
        this.packageBuy = packageBuy;
    }

    public Long getPackageBuy() {
        return this.packageBuy;
    }

    
    
}