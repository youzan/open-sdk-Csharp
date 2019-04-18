package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtItemcategoriesGetResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtItemcategoriesGetParams;

public class KdtItemcategoriesGet extends AbstractAPI {

    public KdtItemcategoriesGet() {
    }

    public KdtItemcategoriesGet(KdtItemcategoriesGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.itemcategories.get";
    }

    public Class getResultModelClass() {
        return KdtItemcategoriesGetResult.class;
    }

    public Class getParamModelClass() {
        return KdtItemcategoriesGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}