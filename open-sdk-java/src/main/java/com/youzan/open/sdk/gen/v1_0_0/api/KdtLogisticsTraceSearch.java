package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtLogisticsTraceSearchResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtLogisticsTraceSearchParams;

public class KdtLogisticsTraceSearch extends AbstractAPI {

    public KdtLogisticsTraceSearch() {
    }

    public KdtLogisticsTraceSearch(KdtLogisticsTraceSearchParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.logistics.trace.search";
    }

    public Class getResultModelClass() {
        return KdtLogisticsTraceSearchResult.class;
    }

    public Class getParamModelClass() {
        return KdtLogisticsTraceSearchParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}