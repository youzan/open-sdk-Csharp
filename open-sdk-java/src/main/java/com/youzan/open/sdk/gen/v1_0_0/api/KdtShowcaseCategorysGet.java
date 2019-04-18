package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtShowcaseCategorysGetResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtShowcaseCategorysGetParams;

public class KdtShowcaseCategorysGet extends AbstractAPI {

    public KdtShowcaseCategorysGet() {
    }

    public KdtShowcaseCategorysGet(KdtShowcaseCategorysGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.showcase.categorys.get";
    }

    public Class getResultModelClass() {
        return KdtShowcaseCategorysGetResult.class;
    }

    public Class getParamModelClass() {
        return KdtShowcaseCategorysGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}