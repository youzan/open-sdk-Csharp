package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtTradeQrlabelGetlistResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtTradeQrlabelGetlistParams;

public class KdtTradeQrlabelGetlist extends AbstractAPI {

    public KdtTradeQrlabelGetlist() {
    }

    public KdtTradeQrlabelGetlist(KdtTradeQrlabelGetlistParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.trade.qrlabel.getlist";
    }

    public Class getResultModelClass() {
        return KdtTradeQrlabelGetlistResult.class;
    }

    public Class getParamModelClass() {
        return KdtTradeQrlabelGetlistParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}