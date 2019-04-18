package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtUsersWeixinFollowersGetResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtUsersWeixinFollowersGetParams;

public class KdtUsersWeixinFollowersGet extends AbstractAPI {

    public KdtUsersWeixinFollowersGet() {
    }

    public KdtUsersWeixinFollowersGet(KdtUsersWeixinFollowersGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.users.weixin.followers.get";
    }

    public Class getResultModelClass() {
        return KdtUsersWeixinFollowersGetResult.class;
    }

    public Class getParamModelClass() {
        return KdtUsersWeixinFollowersGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}