package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtLogisticsOnlineConfirmResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtLogisticsOnlineConfirmParams;

public class KdtLogisticsOnlineConfirm extends AbstractAPI {

    public KdtLogisticsOnlineConfirm() {
    }

    public KdtLogisticsOnlineConfirm(KdtLogisticsOnlineConfirmParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.logistics.online.confirm";
    }

    public Class getResultModelClass() {
        return KdtLogisticsOnlineConfirmResult.class;
    }

    public Class getParamModelClass() {
        return KdtLogisticsOnlineConfirmParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}