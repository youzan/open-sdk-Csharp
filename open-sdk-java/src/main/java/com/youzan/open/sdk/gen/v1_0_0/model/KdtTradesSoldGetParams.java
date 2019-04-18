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

public class KdtTradesSoldGetParams implements APIParams, FileParams  {

    private Long weixinUserType;
    private Long weixinUserId;
    private String version;
    private Boolean useHasNext;
    private String type;
    private Long storeId;
    private String status;
    private Date startUpdate;
    private Date startCreated;
    private Long senderid;
    private Long pageSize;
    private Long pageNo;
    private String keyword;
    private String fields;
    private Date endUpdate;
    private Date endCreated;
    private String buyerNick;
    private Long buyerId;
    private String buyWay;


    public void setWeixinUserType(Long weixinUserType) {
        this.weixinUserType = weixinUserType;
    }

    public Long getWeixinUserType() {
        return this.weixinUserType;
    }


    public void setWeixinUserId(Long weixinUserId) {
        this.weixinUserId = weixinUserId;
    }

    public Long getWeixinUserId() {
        return this.weixinUserId;
    }


    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return this.version;
    }


    public void setUseHasNext(Boolean useHasNext) {
        this.useHasNext = useHasNext;
    }

    public Boolean getUseHasNext() {
        return this.useHasNext;
    }


    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }


    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Long getStoreId() {
        return this.storeId;
    }


    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }


    public void setStartUpdate(Date startUpdate) {
        this.startUpdate = startUpdate;
    }

    public Date getStartUpdate() {
        return this.startUpdate;
    }


    public void setStartCreated(Date startCreated) {
        this.startCreated = startCreated;
    }

    public Date getStartCreated() {
        return this.startCreated;
    }


    public void setSenderid(Long senderid) {
        this.senderid = senderid;
    }

    public Long getSenderid() {
        return this.senderid;
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


    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getKeyword() {
        return this.keyword;
    }


    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }


    public void setEndUpdate(Date endUpdate) {
        this.endUpdate = endUpdate;
    }

    public Date getEndUpdate() {
        return this.endUpdate;
    }


    public void setEndCreated(Date endCreated) {
        this.endCreated = endCreated;
    }

    public Date getEndCreated() {
        return this.endCreated;
    }


    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public String getBuyerNick() {
        return this.buyerNick;
    }


    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    public Long getBuyerId() {
        return this.buyerId;
    }


    public void setBuyWay(String buyWay) {
        this.buyWay = buyWay;
    }

    public String getBuyWay() {
        return this.buyWay;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (weixinUserType != null) {
            params.put("weixin_user_type", weixinUserType);
        }
        if (weixinUserId != null) {
            params.put("weixin_user_id", weixinUserId);
        }
        if (version != null) {
            params.put("version", version);
        }
        if (useHasNext != null) {
            params.put("use_has_next", useHasNext);
        }
        if (type != null) {
            params.put("type", type);
        }
        if (storeId != null) {
            params.put("store_id", storeId);
        }
        if (status != null) {
            params.put("status", status);
        }
        if (startUpdate != null) {
            params.put("start_update", startUpdate);
        }
        if (startCreated != null) {
            params.put("start_created", startCreated);
        }
        if (senderid != null) {
            params.put("senderId", senderid);
        }
        if (pageSize != null) {
            params.put("page_size", pageSize);
        }
        if (pageNo != null) {
            params.put("page_no", pageNo);
        }
        if (keyword != null) {
            params.put("keyword", keyword);
        }
        if (fields != null) {
            params.put("fields", fields);
        }
        if (endUpdate != null) {
            params.put("end_update", endUpdate);
        }
        if (endCreated != null) {
            params.put("end_created", endCreated);
        }
        if (buyerNick != null) {
            params.put("buyer_nick", buyerNick);
        }
        if (buyerId != null) {
            params.put("buyer_id", buyerId);
        }
        if (buyWay != null) {
            params.put("buy_way", buyWay);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}