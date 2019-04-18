package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtItemsOnsaleGetResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtItemsOnsaleGetParams;

public class KdtItemsOnsaleGet extends AbstractAPI {

    public KdtItemsOnsaleGet() {
    }

    public KdtItemsOnsaleGet(KdtItemsOnsaleGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.items.onsale.get";
    }

    public Class getResultModelClass() {
        return KdtItemsOnsaleGetResult.class;
    }

    public Class getParamModelClass() {
        return KdtItemsOnsaleGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}