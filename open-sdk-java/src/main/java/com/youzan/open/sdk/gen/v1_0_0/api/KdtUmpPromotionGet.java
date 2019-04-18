package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtUmpPromotionGetResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtUmpPromotionGetParams;

public class KdtUmpPromotionGet extends AbstractAPI {

    public KdtUmpPromotionGet() {
    }

    public KdtUmpPromotionGet(KdtUmpPromotionGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.ump.promotion.get";
    }

    public Class getResultModelClass() {
        return KdtUmpPromotionGetResult.class;
    }

    public Class getParamModelClass() {
        return KdtUmpPromotionGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}