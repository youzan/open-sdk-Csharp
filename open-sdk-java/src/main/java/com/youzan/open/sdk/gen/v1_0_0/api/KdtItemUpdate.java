package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtItemUpdateResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtItemUpdateParams;

public class KdtItemUpdate extends AbstractAPI {

    public KdtItemUpdate() {
    }

    public KdtItemUpdate(KdtItemUpdateParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.item.update";
    }

    public Class getResultModelClass() {
        return KdtItemUpdateResult.class;
    }

    public Class getParamModelClass() {
        return KdtItemUpdateParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}