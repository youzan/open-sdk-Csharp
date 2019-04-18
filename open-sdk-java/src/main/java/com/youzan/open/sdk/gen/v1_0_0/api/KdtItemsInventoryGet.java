package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtItemsInventoryGetResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtItemsInventoryGetParams;

public class KdtItemsInventoryGet extends AbstractAPI {

    public KdtItemsInventoryGet() {
    }

    public KdtItemsInventoryGet(KdtItemsInventoryGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.items.inventory.get";
    }

    public Class getResultModelClass() {
        return KdtItemsInventoryGetResult.class;
    }

    public Class getParamModelClass() {
        return KdtItemsInventoryGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}