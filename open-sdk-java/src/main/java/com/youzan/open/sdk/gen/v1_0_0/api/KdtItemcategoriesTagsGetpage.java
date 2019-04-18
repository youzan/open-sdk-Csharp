package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtItemcategoriesTagsGetpageResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtItemcategoriesTagsGetpageParams;

public class KdtItemcategoriesTagsGetpage extends AbstractAPI {

    public KdtItemcategoriesTagsGetpage() {
    }

    public KdtItemcategoriesTagsGetpage(KdtItemcategoriesTagsGetpageParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.itemcategories.tags.getpage";
    }

    public Class getResultModelClass() {
        return KdtItemcategoriesTagsGetpageResult.class;
    }

    public Class getParamModelClass() {
        return KdtItemcategoriesTagsGetpageParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}