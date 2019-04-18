package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtItemUpdateListingResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtItemUpdateListingParams;

public class KdtItemUpdateListing extends AbstractAPI {

    public KdtItemUpdateListing() {
    }

    public KdtItemUpdateListing(KdtItemUpdateListingParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.item.update.listing";
    }

    public Class getResultModelClass() {
        return KdtItemUpdateListingResult.class;
    }

    public Class getParamModelClass() {
        return KdtItemUpdateListingParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}