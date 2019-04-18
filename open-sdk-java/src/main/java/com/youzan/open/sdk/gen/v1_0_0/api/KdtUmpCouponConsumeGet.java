package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtUmpCouponConsumeGetResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtUmpCouponConsumeGetParams;

public class KdtUmpCouponConsumeGet extends AbstractAPI {

    public KdtUmpCouponConsumeGet() {
    }

    public KdtUmpCouponConsumeGet(KdtUmpCouponConsumeGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.ump.coupon.consume.get";
    }

    public Class getResultModelClass() {
        return KdtUmpCouponConsumeGetResult.class;
    }

    public Class getParamModelClass() {
        return KdtUmpCouponConsumeGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}