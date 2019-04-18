package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtItemSkuUpdateResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtItemSkuUpdateParams;

public class KdtItemSkuUpdate extends AbstractAPI {

    public KdtItemSkuUpdate() {
    }

    public KdtItemSkuUpdate(KdtItemSkuUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.item.sku.update";
    }

    public Class getResultModelClass() {
        return KdtItemSkuUpdateResult.class;
    }

    public Class getParamModelClass() {
        return KdtItemSkuUpdateParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}