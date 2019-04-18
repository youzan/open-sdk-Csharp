package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtItemUpdateDelistingResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtItemUpdateDelistingParams;

public class KdtItemUpdateDelisting extends AbstractAPI {

    public KdtItemUpdateDelisting() {
    }

    public KdtItemUpdateDelisting(KdtItemUpdateDelistingParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.item.update.delisting";
    }

    public Class getResultModelClass() {
        return KdtItemUpdateDelistingResult.class;
    }

    public Class getParamModelClass() {
        return KdtItemUpdateDelistingParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}