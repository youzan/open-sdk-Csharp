package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtItemDeleteResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtItemDeleteParams;

public class KdtItemDelete extends AbstractAPI {

    public KdtItemDelete() {
    }

    public KdtItemDelete(KdtItemDeleteParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.item.delete";
    }

    public Class getResultModelClass() {
        return KdtItemDeleteResult.class;
    }

    public Class getParamModelClass() {
        return KdtItemDeleteParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}