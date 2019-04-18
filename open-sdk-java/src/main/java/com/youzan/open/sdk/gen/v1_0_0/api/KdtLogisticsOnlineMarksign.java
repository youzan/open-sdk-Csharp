package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtLogisticsOnlineMarksignResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtLogisticsOnlineMarksignParams;

public class KdtLogisticsOnlineMarksign extends AbstractAPI {

    public KdtLogisticsOnlineMarksign() {
    }

    public KdtLogisticsOnlineMarksign(KdtLogisticsOnlineMarksignParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.logistics.online.marksign";
    }

    public Class getResultModelClass() {
        return KdtLogisticsOnlineMarksignResult.class;
    }

    public Class getParamModelClass() {
        return KdtLogisticsOnlineMarksignParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}