package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtPayQrcodesGetResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtPayQrcodesGetParams;

public class KdtPayQrcodesGet extends AbstractAPI {

    public KdtPayQrcodesGet() {
    }

    public KdtPayQrcodesGet(KdtPayQrcodesGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.pay.qrcodes.get";
    }

    public Class getResultModelClass() {
        return KdtPayQrcodesGetResult.class;
    }

    public Class getParamModelClass() {
        return KdtPayQrcodesGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}