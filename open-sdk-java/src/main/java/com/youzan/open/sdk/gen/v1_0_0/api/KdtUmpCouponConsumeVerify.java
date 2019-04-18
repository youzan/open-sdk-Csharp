package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtUmpCouponConsumeVerifyResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtUmpCouponConsumeVerifyParams;

public class KdtUmpCouponConsumeVerify extends AbstractAPI {

    public KdtUmpCouponConsumeVerify() {
    }

    public KdtUmpCouponConsumeVerify(KdtUmpCouponConsumeVerifyParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.ump.coupon.consume.verify";
    }

    public Class getResultModelClass() {
        return KdtUmpCouponConsumeVerifyResult.class;
    }

    public Class getParamModelClass() {
        return KdtUmpCouponConsumeVerifyParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}