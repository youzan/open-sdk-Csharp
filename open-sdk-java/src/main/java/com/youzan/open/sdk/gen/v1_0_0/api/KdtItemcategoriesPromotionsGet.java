package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtItemcategoriesPromotionsGetResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtItemcategoriesPromotionsGetParams;

public class KdtItemcategoriesPromotionsGet extends AbstractAPI {

    public KdtItemcategoriesPromotionsGet() {
    }

    public KdtItemcategoriesPromotionsGet(KdtItemcategoriesPromotionsGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.itemcategories.promotions.get";
    }

    public Class getResultModelClass() {
        return KdtItemcategoriesPromotionsGetResult.class;
    }

    public Class getParamModelClass() {
        return KdtItemcategoriesPromotionsGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}