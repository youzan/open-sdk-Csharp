package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtTradeVirtualcodeGetResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtTradeVirtualcodeGetParams;

public class KdtTradeVirtualcodeGet extends AbstractAPI {

    public KdtTradeVirtualcodeGet() {
    }

    public KdtTradeVirtualcodeGet(KdtTradeVirtualcodeGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.trade.virtualcode.get";
    }

    public Class getResultModelClass() {
        return KdtTradeVirtualcodeGetResult.class;
    }

    public Class getParamModelClass() {
        return KdtTradeVirtualcodeGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}