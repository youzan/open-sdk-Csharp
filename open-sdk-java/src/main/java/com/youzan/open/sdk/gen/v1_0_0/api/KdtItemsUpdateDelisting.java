package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtItemsUpdateDelistingResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtItemsUpdateDelistingParams;

public class KdtItemsUpdateDelisting extends AbstractAPI {

    public KdtItemsUpdateDelisting() {
    }

    public KdtItemsUpdateDelisting(KdtItemsUpdateDelistingParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.items.update.delisting";
    }

    public Class getResultModelClass() {
        return KdtItemsUpdateDelistingResult.class;
    }

    public Class getParamModelClass() {
        return KdtItemsUpdateDelistingParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}