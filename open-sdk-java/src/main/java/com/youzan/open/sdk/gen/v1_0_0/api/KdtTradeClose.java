package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtTradeCloseResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtTradeCloseParams;

public class KdtTradeClose extends AbstractAPI {

    public KdtTradeClose() {
    }

    public KdtTradeClose(KdtTradeCloseParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.trade.close";
    }

    public Class getResultModelClass() {
        return KdtTradeCloseResult.class;
    }

    public Class getParamModelClass() {
        return KdtTradeCloseParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}