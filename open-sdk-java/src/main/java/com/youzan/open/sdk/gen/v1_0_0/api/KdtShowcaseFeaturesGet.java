package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtShowcaseFeaturesGetResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtShowcaseFeaturesGetParams;

public class KdtShowcaseFeaturesGet extends AbstractAPI {

    public KdtShowcaseFeaturesGet() {
    }

    public KdtShowcaseFeaturesGet(KdtShowcaseFeaturesGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.showcase.features.get";
    }

    public Class getResultModelClass() {
        return KdtShowcaseFeaturesGetResult.class;
    }

    public Class getParamModelClass() {
        return KdtShowcaseFeaturesGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}