package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtItemsCustomGetResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtItemsCustomGetParams;

public class KdtItemsCustomGet extends AbstractAPI {

    public KdtItemsCustomGet() {
    }

    public KdtItemsCustomGet(KdtItemsCustomGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.items.custom.get";
    }

    public Class getResultModelClass() {
        return KdtItemsCustomGetResult.class;
    }

    public Class getParamModelClass() {
        return KdtItemsCustomGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}