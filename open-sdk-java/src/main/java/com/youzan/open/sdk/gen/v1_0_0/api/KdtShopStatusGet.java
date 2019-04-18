package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtShopStatusGetResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtShopStatusGetParams;

public class KdtShopStatusGet extends AbstractAPI {

    public KdtShopStatusGet() {
    }

    public KdtShopStatusGet(KdtShopStatusGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.shop.status.get";
    }

    public Class getResultModelClass() {
        return KdtShopStatusGetResult.class;
    }

    public Class getParamModelClass() {
        return KdtShopStatusGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}