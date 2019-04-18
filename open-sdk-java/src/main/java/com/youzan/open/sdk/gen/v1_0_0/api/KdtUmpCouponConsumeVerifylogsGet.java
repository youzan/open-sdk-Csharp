package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtUmpCouponConsumeVerifylogsGetResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtUmpCouponConsumeVerifylogsGetParams;

public class KdtUmpCouponConsumeVerifylogsGet extends AbstractAPI {

    public KdtUmpCouponConsumeVerifylogsGet() {
    }

    public KdtUmpCouponConsumeVerifylogsGet(KdtUmpCouponConsumeVerifylogsGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.ump.coupon.consume.verifylogs.get";
    }

    public Class getResultModelClass() {
        return KdtUmpCouponConsumeVerifylogsGetResult.class;
    }

    public Class getParamModelClass() {
        return KdtUmpCouponConsumeVerifylogsGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}