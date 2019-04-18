package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtUserBasicGetResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtUserBasicGetParams;

public class KdtUserBasicGet extends AbstractAPI {

    public KdtUserBasicGet() {
    }

    public KdtUserBasicGet(KdtUserBasicGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.user.basic.get";
    }

    public Class getResultModelClass() {
        return KdtUserBasicGetResult.class;
    }

    public Class getParamModelClass() {
        return KdtUserBasicGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}