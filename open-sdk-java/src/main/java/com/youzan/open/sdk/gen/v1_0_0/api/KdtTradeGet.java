package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtTradeGetResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtTradeGetParams;

public class KdtTradeGet extends AbstractAPI {

    public KdtTradeGet() {
    }

    public KdtTradeGet(KdtTradeGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.trade.get";
    }

    public Class getResultModelClass() {
        return KdtTradeGetResult.class;
    }

    public Class getParamModelClass() {
        return KdtTradeGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}