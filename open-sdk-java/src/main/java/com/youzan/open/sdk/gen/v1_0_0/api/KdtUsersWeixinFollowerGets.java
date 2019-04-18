package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtUsersWeixinFollowerGetsResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtUsersWeixinFollowerGetsParams;

public class KdtUsersWeixinFollowerGets extends AbstractAPI {

    public KdtUsersWeixinFollowerGets() {
    }

    public KdtUsersWeixinFollowerGets(KdtUsersWeixinFollowerGetsParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.users.weixin.follower.gets";
    }

    public Class getResultModelClass() {
        return KdtUsersWeixinFollowerGetsResult.class;
    }

    public Class getParamModelClass() {
        return KdtUsersWeixinFollowerGetsParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}