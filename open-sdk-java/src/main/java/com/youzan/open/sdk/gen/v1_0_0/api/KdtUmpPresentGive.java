package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtUmpPresentGiveResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtUmpPresentGiveParams;

public class KdtUmpPresentGive extends AbstractAPI {

    public KdtUmpPresentGive() {
    }

    public KdtUmpPresentGive(KdtUmpPresentGiveParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.ump.present.give";
    }

    public Class getResultModelClass() {
        return KdtUmpPresentGiveResult.class;
    }

    public Class getParamModelClass() {
        return KdtUmpPresentGiveParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}