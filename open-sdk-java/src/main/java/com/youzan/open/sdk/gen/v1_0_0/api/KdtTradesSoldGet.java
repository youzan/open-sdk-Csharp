package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtTradesSoldGetResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtTradesSoldGetParams;

public class KdtTradesSoldGet extends AbstractAPI {

    public KdtTradesSoldGet() {
    }

    public KdtTradesSoldGet(KdtTradesSoldGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.trades.sold.get";
    }

    public Class getResultModelClass() {
        return KdtTradesSoldGetResult.class;
    }

    public Class getParamModelClass() {
        return KdtTradesSoldGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}