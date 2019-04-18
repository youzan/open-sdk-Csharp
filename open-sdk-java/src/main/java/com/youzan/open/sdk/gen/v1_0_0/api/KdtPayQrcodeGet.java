package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtPayQrcodeGetResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtPayQrcodeGetParams;

public class KdtPayQrcodeGet extends AbstractAPI {

    public KdtPayQrcodeGet() {
    }

    public KdtPayQrcodeGet(KdtPayQrcodeGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.pay.qrcode.get";
    }

    public Class getResultModelClass() {
        return KdtPayQrcodeGetResult.class;
    }

    public Class getParamModelClass() {
        return KdtPayQrcodeGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}