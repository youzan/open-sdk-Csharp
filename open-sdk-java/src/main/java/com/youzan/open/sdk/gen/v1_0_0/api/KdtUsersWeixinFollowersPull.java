package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtUsersWeixinFollowersPullResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtUsersWeixinFollowersPullParams;

public class KdtUsersWeixinFollowersPull extends AbstractAPI {

    public KdtUsersWeixinFollowersPull() {
    }

    public KdtUsersWeixinFollowersPull(KdtUsersWeixinFollowersPullParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.users.weixin.followers.pull";
    }

    public Class getResultModelClass() {
        return KdtUsersWeixinFollowersPullResult.class;
    }

    public Class getParamModelClass() {
        return KdtUsersWeixinFollowersPullParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}