package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtUmpPresentsOngoingAllResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtUmpPresentsOngoingAllParams;

public class KdtUmpPresentsOngoingAll extends AbstractAPI {

    public KdtUmpPresentsOngoingAll() {
    }

    public KdtUmpPresentsOngoingAll(KdtUmpPresentsOngoingAllParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.ump.presents.ongoing.all";
    }

    public Class getResultModelClass() {
        return KdtUmpPresentsOngoingAllResult.class;
    }

    public Class getParamModelClass() {
        return KdtUmpPresentsOngoingAllParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}