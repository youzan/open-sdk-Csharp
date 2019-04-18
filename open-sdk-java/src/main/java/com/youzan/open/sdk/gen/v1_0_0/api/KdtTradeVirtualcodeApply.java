package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtTradeVirtualcodeApplyResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtTradeVirtualcodeApplyParams;

public class KdtTradeVirtualcodeApply extends AbstractAPI {

    public KdtTradeVirtualcodeApply() {
    }

    public KdtTradeVirtualcodeApply(KdtTradeVirtualcodeApplyParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.trade.virtualcode.apply";
    }

    public Class getResultModelClass() {
        return KdtTradeVirtualcodeApplyResult.class;
    }

    public Class getParamModelClass() {
        return KdtTradeVirtualcodeApplyParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}