package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtUmpTimelimiteddiscountFindResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtUmpTimelimiteddiscountFindParams;

public class KdtUmpTimelimiteddiscountFind extends AbstractAPI {

    public KdtUmpTimelimiteddiscountFind() {
    }

    public KdtUmpTimelimiteddiscountFind(KdtUmpTimelimiteddiscountFindParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.ump.timelimiteddiscount.find";
    }

    public Class getResultModelClass() {
        return KdtUmpTimelimiteddiscountFindResult.class;
    }

    public Class getParamModelClass() {
        return KdtUmpTimelimiteddiscountFindParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}