package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtItemGetResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtItemGetParams;

public class KdtItemGet extends AbstractAPI {

    public KdtItemGet() {
    }

    public KdtItemGet(KdtItemGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.item.get";
    }

    public Class getResultModelClass() {
        return KdtItemGetResult.class;
    }

    public Class getParamModelClass() {
        return KdtItemGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}