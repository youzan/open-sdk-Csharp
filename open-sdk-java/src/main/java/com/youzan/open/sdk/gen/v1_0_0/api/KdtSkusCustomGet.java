package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtSkusCustomGetResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtSkusCustomGetParams;

public class KdtSkusCustomGet extends AbstractAPI {

    public KdtSkusCustomGet() {
    }

    public KdtSkusCustomGet(KdtSkusCustomGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.skus.custom.get";
    }

    public Class getResultModelClass() {
        return KdtSkusCustomGetResult.class;
    }

    public Class getParamModelClass() {
        return KdtSkusCustomGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}