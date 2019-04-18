package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtTradeSelffetchcodeGetlistResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtTradeSelffetchcodeGetlistParams;

public class KdtTradeSelffetchcodeGetlist extends AbstractAPI {

    public KdtTradeSelffetchcodeGetlist() {
    }

    public KdtTradeSelffetchcodeGetlist(KdtTradeSelffetchcodeGetlistParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.trade.selffetchcode.getlist";
    }

    public Class getResultModelClass() {
        return KdtTradeSelffetchcodeGetlistResult.class;
    }

    public Class getParamModelClass() {
        return KdtTradeSelffetchcodeGetlistParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}