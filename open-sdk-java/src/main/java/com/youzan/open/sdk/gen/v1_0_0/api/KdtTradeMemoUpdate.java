package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtTradeMemoUpdateResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtTradeMemoUpdateParams;

public class KdtTradeMemoUpdate extends AbstractAPI {

    public KdtTradeMemoUpdate() {
    }

    public KdtTradeMemoUpdate(KdtTradeMemoUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.trade.memo.update";
    }

    public Class getResultModelClass() {
        return KdtTradeMemoUpdateResult.class;
    }

    public Class getParamModelClass() {
        return KdtTradeMemoUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}