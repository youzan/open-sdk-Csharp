package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtItemsUpdateListingResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtItemsUpdateListingParams;

public class KdtItemsUpdateListing extends AbstractAPI {

    public KdtItemsUpdateListing() {
    }

    public KdtItemsUpdateListing(KdtItemsUpdateListingParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "POST";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.items.update.listing";
    }

    public Class getResultModelClass() {
        return KdtItemsUpdateListingResult.class;
    }

    public Class getParamModelClass() {
        return KdtItemsUpdateListingParams.class;
    }

    public boolean hasFiles() {
        return  true ;
    }

}