package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtTradesQrGetResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtTradesQrGetParams;

public class KdtTradesQrGet extends AbstractAPI {

    public KdtTradesQrGet() {
    }

    public KdtTradesQrGet(KdtTradesQrGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.trades.qr.get";
    }

    public Class getResultModelClass() {
        return KdtTradesQrGetResult.class;
    }

    public Class getParamModelClass() {
        return KdtTradesQrGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}