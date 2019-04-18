package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtUsersWeixinFollowerGetResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtUsersWeixinFollowerGetParams;

public class KdtUsersWeixinFollowerGet extends AbstractAPI {

    public KdtUsersWeixinFollowerGet() {
    }

    public KdtUsersWeixinFollowerGet(KdtUsersWeixinFollowerGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.users.weixin.follower.get";
    }

    public Class getResultModelClass() {
        return KdtUsersWeixinFollowerGetResult.class;
    }

    public Class getParamModelClass() {
        return KdtUsersWeixinFollowerGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}