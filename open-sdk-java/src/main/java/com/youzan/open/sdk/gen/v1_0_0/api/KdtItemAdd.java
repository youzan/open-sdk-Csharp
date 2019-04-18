package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtItemAddResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtItemAddParams;

public class KdtItemAdd extends AbstractAPI {

    public KdtItemAdd() {
    }

    public KdtItemAdd(KdtItemAddParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.item.add";
    }

    public Class getResultModelClass() {
        return KdtItemAddResult.class;
    }

    public Class getParamModelClass() {
        return KdtItemAddParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}