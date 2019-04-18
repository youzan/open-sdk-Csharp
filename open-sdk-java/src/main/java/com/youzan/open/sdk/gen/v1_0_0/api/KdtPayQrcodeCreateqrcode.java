package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtPayQrcodeCreateqrcodeResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtPayQrcodeCreateqrcodeParams;

public class KdtPayQrcodeCreateqrcode extends AbstractAPI {

    public KdtPayQrcodeCreateqrcode() {
    }

    public KdtPayQrcodeCreateqrcode(KdtPayQrcodeCreateqrcodeParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.pay.qrcode.createqrcode";
    }

    public Class getResultModelClass() {
        return KdtPayQrcodeCreateqrcodeResult.class;
    }

    public Class getParamModelClass() {
        return KdtPayQrcodeCreateqrcodeParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}