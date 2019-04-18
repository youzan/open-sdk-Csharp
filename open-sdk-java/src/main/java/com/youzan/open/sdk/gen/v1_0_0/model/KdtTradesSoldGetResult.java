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

public class KdtTradesSoldGetResult implements APIResult {

        private Long totalResults;
        private TradeDetail[] trades;
        private Boolean hasNext;
    
    
    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

    
    public void setTrades(TradeDetail[] trades) {
        this.trades = trades;
    }

    public TradeDetail[] getTrades() {
        return this.trades;
    }

    
    public void setHasNext(Boolean hasNext) {
        this.hasNext = hasNext;
    }

    public Boolean getHasNext() {
        return this.hasNext;
    }

    
        public static class HotelInfo {
                private String checkInTime;
                private String checkOutTime;
                private String[] accommodates;
        
                public void setCheckInTime(String checkInTime) {
            this.checkInTime = checkInTime;
        }

        public String getCheckInTime() {
            return this.checkInTime;
        }
                public void setCheckOutTime(String checkOutTime) {
            this.checkOutTime = checkOutTime;
        }

        public String getCheckOutTime() {
            return this.checkOutTime;
        }
                public void setAccommodates(String[] accommodates) {
            this.accommodates = accommodates;
        }

        public String[] getAccommodates() {
            return this.accommodates;
        }
        
    }
        public static class TradeOrder {
                private Long oid;
                private Long numIid;
                private Long skuId;
                private String skuUniqueCode;
                private Long num;
                private String outerSkuId;
                private String outerItemId;
                private String title;
                private String sellerNick;
                private Float fenxiaoPrice;
                private Float fenxiaoPayment;
                private Float price;
                private Float totalFee;
                private Float discountFee;
                private Float payment;
                private String skuPropertiesName;
                private String picPath;
                private String picThumbPath;
                private Long itemType;
                private TradeBuyerMessage[] buyerMessages;
                private TradeOrderPromotion[] orderPromotionDetails;
                private String stateStr;
                private String itemRefundState;
                private Long isVirtual;
                private Long isPresent;
                private Float refundedFee;
                private Long allowSend;
        
                public void setOid(Long oid) {
            this.oid = oid;
        }

        public Long getOid() {
            return this.oid;
        }
                public void setNumIid(Long numIid) {
            this.numIid = numIid;
        }

        public Long getNumIid() {
            return this.numIid;
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
                public void setNum(Long num) {
            this.num = num;
        }

        public Long getNum() {
            return this.num;
        }
                public void setOuterSkuId(String outerSkuId) {
            this.outerSkuId = outerSkuId;
        }

        public String getOuterSkuId() {
            return this.outerSkuId;
        }
                public void setOuterItemId(String outerItemId) {
            this.outerItemId = outerItemId;
        }

        public String getOuterItemId() {
            return this.outerItemId;
        }
                public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return this.title;
        }
                public void setSellerNick(String sellerNick) {
            this.sellerNick = sellerNick;
        }

        public String getSellerNick() {
            return this.sellerNick;
        }
                public void setFenxiaoPrice(Float fenxiaoPrice) {
            this.fenxiaoPrice = fenxiaoPrice;
        }

        public Float getFenxiaoPrice() {
            return this.fenxiaoPrice;
        }
                public void setFenxiaoPayment(Float fenxiaoPayment) {
            this.fenxiaoPayment = fenxiaoPayment;
        }

        public Float getFenxiaoPayment() {
            return this.fenxiaoPayment;
        }
                public void setPrice(Float price) {
            this.price = price;
        }

        public Float getPrice() {
            return this.price;
        }
                public void setTotalFee(Float totalFee) {
            this.totalFee = totalFee;
        }

        public Float getTotalFee() {
            return this.totalFee;
        }
                public void setDiscountFee(Float discountFee) {
            this.discountFee = discountFee;
        }

        public Float getDiscountFee() {
            return this.discountFee;
        }
                public void setPayment(Float payment) {
            this.payment = payment;
        }

        public Float getPayment() {
            return this.payment;
        }
                public void setSkuPropertiesName(String skuPropertiesName) {
            this.skuPropertiesName = skuPropertiesName;
        }

        public String getSkuPropertiesName() {
            return this.skuPropertiesName;
        }
                public void setPicPath(String picPath) {
            this.picPath = picPath;
        }

        public String getPicPath() {
            return this.picPath;
        }
                public void setPicThumbPath(String picThumbPath) {
            this.picThumbPath = picThumbPath;
        }

        public String getPicThumbPath() {
            return this.picThumbPath;
        }
                public void setItemType(Long itemType) {
            this.itemType = itemType;
        }

        public Long getItemType() {
            return this.itemType;
        }
                public void setBuyerMessages(TradeBuyerMessage[] buyerMessages) {
            this.buyerMessages = buyerMessages;
        }

        public TradeBuyerMessage[] getBuyerMessages() {
            return this.buyerMessages;
        }
                public void setOrderPromotionDetails(TradeOrderPromotion[] orderPromotionDetails) {
            this.orderPromotionDetails = orderPromotionDetails;
        }

        public TradeOrderPromotion[] getOrderPromotionDetails() {
            return this.orderPromotionDetails;
        }
                public void setStateStr(String stateStr) {
            this.stateStr = stateStr;
        }

        public String getStateStr() {
            return this.stateStr;
        }
                public void setItemRefundState(String itemRefundState) {
            this.itemRefundState = itemRefundState;
        }

        public String getItemRefundState() {
            return this.itemRefundState;
        }
                public void setIsVirtual(Long isVirtual) {
            this.isVirtual = isVirtual;
        }

        public Long getIsVirtual() {
            return this.isVirtual;
        }
                public void setIsPresent(Long isPresent) {
            this.isPresent = isPresent;
        }

        public Long getIsPresent() {
            return this.isPresent;
        }
                public void setRefundedFee(Float refundedFee) {
            this.refundedFee = refundedFee;
        }

        public Float getRefundedFee() {
            return this.refundedFee;
        }
                public void setAllowSend(Long allowSend) {
            this.allowSend = allowSend;
        }

        public Long getAllowSend() {
            return this.allowSend;
        }
        
    }
        public static class TradeFetch {
                private String fetcherName;
                private String fetcherMobile;
                private Date fetchTime;
                private Long shopId;
                private String shopName;
                private String shopMobile;
                private String shopState;
                private String shopCity;
                private String shopDistrict;
                private String shopAddress;
        
                public void setFetcherName(String fetcherName) {
            this.fetcherName = fetcherName;
        }

        public String getFetcherName() {
            return this.fetcherName;
        }
                public void setFetcherMobile(String fetcherMobile) {
            this.fetcherMobile = fetcherMobile;
        }

        public String getFetcherMobile() {
            return this.fetcherMobile;
        }
                public void setFetchTime(Date fetchTime) {
            this.fetchTime = fetchTime;
        }

        public Date getFetchTime() {
            return this.fetchTime;
        }
                public void setShopId(Long shopId) {
            this.shopId = shopId;
        }

        public Long getShopId() {
            return this.shopId;
        }
                public void setShopName(String shopName) {
            this.shopName = shopName;
        }

        public String getShopName() {
            return this.shopName;
        }
                public void setShopMobile(String shopMobile) {
            this.shopMobile = shopMobile;
        }

        public String getShopMobile() {
            return this.shopMobile;
        }
                public void setShopState(String shopState) {
            this.shopState = shopState;
        }

        public String getShopState() {
            return this.shopState;
        }
                public void setShopCity(String shopCity) {
            this.shopCity = shopCity;
        }

        public String getShopCity() {
            return this.shopCity;
        }
                public void setShopDistrict(String shopDistrict) {
            this.shopDistrict = shopDistrict;
        }

        public String getShopDistrict() {
            return this.shopDistrict;
        }
                public void setShopAddress(String shopAddress) {
            this.shopAddress = shopAddress;
        }

        public String getShopAddress() {
            return this.shopAddress;
        }
        
    }
        public static class TradePromotion {
                private Long promotionId;
                private String promotionName;
                private String promotionType;
                private String promotionCondition;
                private Date usedAt;
                private Float discountFee;
        
                public void setPromotionId(Long promotionId) {
            this.promotionId = promotionId;
        }

        public Long getPromotionId() {
            return this.promotionId;
        }
                public void setPromotionName(String promotionName) {
            this.promotionName = promotionName;
        }

        public String getPromotionName() {
            return this.promotionName;
        }
                public void setPromotionType(String promotionType) {
            this.promotionType = promotionType;
        }

        public String getPromotionType() {
            return this.promotionType;
        }
                public void setPromotionCondition(String promotionCondition) {
            this.promotionCondition = promotionCondition;
        }

        public String getPromotionCondition() {
            return this.promotionCondition;
        }
                public void setUsedAt(Date usedAt) {
            this.usedAt = usedAt;
        }

        public Date getUsedAt() {
            return this.usedAt;
        }
                public void setDiscountFee(Float discountFee) {
            this.discountFee = discountFee;
        }

        public Float getDiscountFee() {
            return this.discountFee;
        }
        
    }
        public static class TradeDetail {
                private String tid;
                private Long num;
                private Long numIid;
                private Float price;
                private String picPath;
                private String picThumbPath;
                private String title;
                private String type;
                private Long weixinUserId;
                private Long buyerType;
                private Long buyerId;
                private String buyerNick;
                private String buyerMessage;
                private Long sellerFlag;
                private String tradeMemo;
                private String receiverCity;
                private String receiverDistrict;
                private String receiverName;
                private String receiverState;
                private String receiverAddress;
                private String receiverZip;
                private String receiverMobile;
                private Long feedback;
                private String refundState;
                private String outerTid;
                private String status;
                private String shippingType;
                private Float postFee;
                private Float totalFee;
                private Float refundedFee;
                private Float discountFee;
                private Float payment;
                private Date created;
                private Date updateTime;
                private Date payTime;
                private String payType;
                private Date consignTime;
                private Date signTime;
                private String buyerArea;
                private TradeOrder[] orders;
                private TradeFetch fetchDetail;
                private UmpTradeCoupon[] couponDetails;
                private FansInfo fansInfo;
                private HotelInfo hotelInfo;
                private TradePromotion[] promotionDetails;
                private AdjustFee[] adjustFee;
                private TradeDetail[] subTrades;
                private String relationType;
                private String[] relations;
                private String[] outTradeNo;
                private Float profit;
                private Long handled;
                private String outerUserId;
                private Long shopId;
                private Long pointsPrice;
                private String tuanNo;
                private String deliveryTimeDisplay;
        
                public void setTid(String tid) {
            this.tid = tid;
        }

        public String getTid() {
            return this.tid;
        }
                public void setNum(Long num) {
            this.num = num;
        }

        public Long getNum() {
            return this.num;
        }
                public void setNumIid(Long numIid) {
            this.numIid = numIid;
        }

        public Long getNumIid() {
            return this.numIid;
        }
                public void setPrice(Float price) {
            this.price = price;
        }

        public Float getPrice() {
            return this.price;
        }
                public void setPicPath(String picPath) {
            this.picPath = picPath;
        }

        public String getPicPath() {
            return this.picPath;
        }
                public void setPicThumbPath(String picThumbPath) {
            this.picThumbPath = picThumbPath;
        }

        public String getPicThumbPath() {
            return this.picThumbPath;
        }
                public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return this.title;
        }
                public void setType(String type) {
            this.type = type;
        }

        public String getType() {
            return this.type;
        }
                public void setWeixinUserId(Long weixinUserId) {
            this.weixinUserId = weixinUserId;
        }

        public Long getWeixinUserId() {
            return this.weixinUserId;
        }
                public void setBuyerType(Long buyerType) {
            this.buyerType = buyerType;
        }

        public Long getBuyerType() {
            return this.buyerType;
        }
                public void setBuyerId(Long buyerId) {
            this.buyerId = buyerId;
        }

        public Long getBuyerId() {
            return this.buyerId;
        }
                public void setBuyerNick(String buyerNick) {
            this.buyerNick = buyerNick;
        }

        public String getBuyerNick() {
            return this.buyerNick;
        }
                public void setBuyerMessage(String buyerMessage) {
            this.buyerMessage = buyerMessage;
        }

        public String getBuyerMessage() {
            return this.buyerMessage;
        }
                public void setSellerFlag(Long sellerFlag) {
            this.sellerFlag = sellerFlag;
        }

        public Long getSellerFlag() {
            return this.sellerFlag;
        }
                public void setTradeMemo(String tradeMemo) {
            this.tradeMemo = tradeMemo;
        }

        public String getTradeMemo() {
            return this.tradeMemo;
        }
                public void setReceiverCity(String receiverCity) {
            this.receiverCity = receiverCity;
        }

        public String getReceiverCity() {
            return this.receiverCity;
        }
                public void setReceiverDistrict(String receiverDistrict) {
            this.receiverDistrict = receiverDistrict;
        }

        public String getReceiverDistrict() {
            return this.receiverDistrict;
        }
                public void setReceiverName(String receiverName) {
            this.receiverName = receiverName;
        }

        public String getReceiverName() {
            return this.receiverName;
        }
                public void setReceiverState(String receiverState) {
            this.receiverState = receiverState;
        }

        public String getReceiverState() {
            return this.receiverState;
        }
                public void setReceiverAddress(String receiverAddress) {
            this.receiverAddress = receiverAddress;
        }

        public String getReceiverAddress() {
            return this.receiverAddress;
        }
                public void setReceiverZip(String receiverZip) {
            this.receiverZip = receiverZip;
        }

        public String getReceiverZip() {
            return this.receiverZip;
        }
                public void setReceiverMobile(String receiverMobile) {
            this.receiverMobile = receiverMobile;
        }

        public String getReceiverMobile() {
            return this.receiverMobile;
        }
                public void setFeedback(Long feedback) {
            this.feedback = feedback;
        }

        public Long getFeedback() {
            return this.feedback;
        }
                public void setRefundState(String refundState) {
            this.refundState = refundState;
        }

        public String getRefundState() {
            return this.refundState;
        }
                public void setOuterTid(String outerTid) {
            this.outerTid = outerTid;
        }

        public String getOuterTid() {
            return this.outerTid;
        }
                public void setStatus(String status) {
            this.status = status;
        }

        public String getStatus() {
            return this.status;
        }
                public void setShippingType(String shippingType) {
            this.shippingType = shippingType;
        }

        public String getShippingType() {
            return this.shippingType;
        }
                public void setPostFee(Float postFee) {
            this.postFee = postFee;
        }

        public Float getPostFee() {
            return this.postFee;
        }
                public void setTotalFee(Float totalFee) {
            this.totalFee = totalFee;
        }

        public Float getTotalFee() {
            return this.totalFee;
        }
                public void setRefundedFee(Float refundedFee) {
            this.refundedFee = refundedFee;
        }

        public Float getRefundedFee() {
            return this.refundedFee;
        }
                public void setDiscountFee(Float discountFee) {
            this.discountFee = discountFee;
        }

        public Float getDiscountFee() {
            return this.discountFee;
        }
                public void setPayment(Float payment) {
            this.payment = payment;
        }

        public Float getPayment() {
            return this.payment;
        }
                public void setCreated(Date created) {
            this.created = created;
        }

        public Date getCreated() {
            return this.created;
        }
                public void setUpdateTime(Date updateTime) {
            this.updateTime = updateTime;
        }

        public Date getUpdateTime() {
            return this.updateTime;
        }
                public void setPayTime(Date payTime) {
            this.payTime = payTime;
        }

        public Date getPayTime() {
            return this.payTime;
        }
                public void setPayType(String payType) {
            this.payType = payType;
        }

        public String getPayType() {
            return this.payType;
        }
                public void setConsignTime(Date consignTime) {
            this.consignTime = consignTime;
        }

        public Date getConsignTime() {
            return this.consignTime;
        }
                public void setSignTime(Date signTime) {
            this.signTime = signTime;
        }

        public Date getSignTime() {
            return this.signTime;
        }
                public void setBuyerArea(String buyerArea) {
            this.buyerArea = buyerArea;
        }

        public String getBuyerArea() {
            return this.buyerArea;
        }
                public void setOrders(TradeOrder[] orders) {
            this.orders = orders;
        }

        public TradeOrder[] getOrders() {
            return this.orders;
        }
                public void setFetchDetail(TradeFetch fetchDetail) {
            this.fetchDetail = fetchDetail;
        }

        public TradeFetch getFetchDetail() {
            return this.fetchDetail;
        }
                public void setCouponDetails(UmpTradeCoupon[] couponDetails) {
            this.couponDetails = couponDetails;
        }

        public UmpTradeCoupon[] getCouponDetails() {
            return this.couponDetails;
        }
                public void setFansInfo(FansInfo fansInfo) {
            this.fansInfo = fansInfo;
        }

        public FansInfo getFansInfo() {
            return this.fansInfo;
        }
                public void setHotelInfo(HotelInfo hotelInfo) {
            this.hotelInfo = hotelInfo;
        }

        public HotelInfo getHotelInfo() {
            return this.hotelInfo;
        }
                public void setPromotionDetails(TradePromotion[] promotionDetails) {
            this.promotionDetails = promotionDetails;
        }

        public TradePromotion[] getPromotionDetails() {
            return this.promotionDetails;
        }
                public void setAdjustFee(AdjustFee[] adjustFee) {
            this.adjustFee = adjustFee;
        }

        public AdjustFee[] getAdjustFee() {
            return this.adjustFee;
        }
                public void setSubTrades(TradeDetail[] subTrades) {
            this.subTrades = subTrades;
        }

        public TradeDetail[] getSubTrades() {
            return this.subTrades;
        }
                public void setRelationType(String relationType) {
            this.relationType = relationType;
        }

        public String getRelationType() {
            return this.relationType;
        }
                public void setRelations(String[] relations) {
            this.relations = relations;
        }

        public String[] getRelations() {
            return this.relations;
        }
                public void setOutTradeNo(String[] outTradeNo) {
            this.outTradeNo = outTradeNo;
        }

        public String[] getOutTradeNo() {
            return this.outTradeNo;
        }
                public void setProfit(Float profit) {
            this.profit = profit;
        }

        public Float getProfit() {
            return this.profit;
        }
                public void setHandled(Long handled) {
            this.handled = handled;
        }

        public Long getHandled() {
            return this.handled;
        }
                public void setOuterUserId(String outerUserId) {
            this.outerUserId = outerUserId;
        }

        public String getOuterUserId() {
            return this.outerUserId;
        }
                public void setShopId(Long shopId) {
            this.shopId = shopId;
        }

        public Long getShopId() {
            return this.shopId;
        }
                public void setPointsPrice(Long pointsPrice) {
            this.pointsPrice = pointsPrice;
        }

        public Long getPointsPrice() {
            return this.pointsPrice;
        }
                public void setTuanNo(String tuanNo) {
            this.tuanNo = tuanNo;
        }

        public String getTuanNo() {
            return this.tuanNo;
        }
                public void setDeliveryTimeDisplay(String deliveryTimeDisplay) {
            this.deliveryTimeDisplay = deliveryTimeDisplay;
        }

        public String getDeliveryTimeDisplay() {
            return this.deliveryTimeDisplay;
        }
        
    }
        public static class TradeBuyerMessage {
                private String title;
                private String content;
        
                public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return this.title;
        }
                public void setContent(String content) {
            this.content = content;
        }

        public String getContent() {
            return this.content;
        }
        
    }
        public static class FansInfo {
                private String fansNickname;
                private Long fansId;
                private Long buyerId;
                private Long fansType;
        
                public void setFansNickname(String fansNickname) {
            this.fansNickname = fansNickname;
        }

        public String getFansNickname() {
            return this.fansNickname;
        }
                public void setFansId(Long fansId) {
            this.fansId = fansId;
        }

        public Long getFansId() {
            return this.fansId;
        }
                public void setBuyerId(Long buyerId) {
            this.buyerId = buyerId;
        }

        public Long getBuyerId() {
            return this.buyerId;
        }
                public void setFansType(Long fansType) {
            this.fansType = fansType;
        }

        public Long getFansType() {
            return this.fansType;
        }
        
    }
        public static class UmpTradeCoupon {
                private Long couponId;
                private String couponName;
                private String couponType;
                private String couponContent;
                private String couponDescription;
                private String couponCondition;
                private Date usedAt;
                private Float discountFee;
        
                public void setCouponId(Long couponId) {
            this.couponId = couponId;
        }

        public Long getCouponId() {
            return this.couponId;
        }
                public void setCouponName(String couponName) {
            this.couponName = couponName;
        }

        public String getCouponName() {
            return this.couponName;
        }
                public void setCouponType(String couponType) {
            this.couponType = couponType;
        }

        public String getCouponType() {
            return this.couponType;
        }
                public void setCouponContent(String couponContent) {
            this.couponContent = couponContent;
        }

        public String getCouponContent() {
            return this.couponContent;
        }
                public void setCouponDescription(String couponDescription) {
            this.couponDescription = couponDescription;
        }

        public String getCouponDescription() {
            return this.couponDescription;
        }
                public void setCouponCondition(String couponCondition) {
            this.couponCondition = couponCondition;
        }

        public String getCouponCondition() {
            return this.couponCondition;
        }
                public void setUsedAt(Date usedAt) {
            this.usedAt = usedAt;
        }

        public Date getUsedAt() {
            return this.usedAt;
        }
                public void setDiscountFee(Float discountFee) {
            this.discountFee = discountFee;
        }

        public Float getDiscountFee() {
            return this.discountFee;
        }
        
    }
        public static class AdjustFee {
                private Float change;
                private Float payChange;
                private Float postChange;
        
                public void setChange(Float change) {
            this.change = change;
        }

        public Float getChange() {
            return this.change;
        }
                public void setPayChange(Float payChange) {
            this.payChange = payChange;
        }

        public Float getPayChange() {
            return this.payChange;
        }
                public void setPostChange(Float postChange) {
            this.postChange = postChange;
        }

        public Float getPostChange() {
            return this.postChange;
        }
        
    }
        public static class TradeOrderPromotion {
                private String promotionName;
                private String promotionType;
                private Date applyAt;
                private Float discountFee;
        
                public void setPromotionName(String promotionName) {
            this.promotionName = promotionName;
        }

        public String getPromotionName() {
            return this.promotionName;
        }
                public void setPromotionType(String promotionType) {
            this.promotionType = promotionType;
        }

        public String getPromotionType() {
            return this.promotionType;
        }
                public void setApplyAt(Date applyAt) {
            this.applyAt = applyAt;
        }

        public Date getApplyAt() {
            return this.applyAt;
        }
                public void setDiscountFee(Float discountFee) {
            this.discountFee = discountFee;
        }

        public Float getDiscountFee() {
            return this.discountFee;
        }
        
    }
    
}