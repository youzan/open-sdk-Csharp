package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtShopBasicGetResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtShopBasicGetParams;

public class KdtShopBasicGet extends AbstractAPI {

    public KdtShopBasicGet() {
    }

    public KdtShopBasicGet(KdtShopBasicGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.shop.basic.get";
    }

    public Class getResultModelClass() {
        return KdtShopBasicGetResult.class;
    }

    public Class getParamModelClass() {
        return KdtShopBasicGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}