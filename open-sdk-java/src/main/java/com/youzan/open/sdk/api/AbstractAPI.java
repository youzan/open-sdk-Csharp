package com.youzan.open.sdk.api;

import com.youzan.open.sdk.model.APIParams;

/**
 * @author ph0ly
 * @time 2016-11-28
 */
public abstract class AbstractAPI implements API {

    protected APIParams params;

    public APIParams getAPIParams() {
        return this.params;
    }

    public void setAPIParams(APIParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpUrl() {
        return "http://open.koudaitong.com/api";
    }

    public String getVersion() {
        return "1.0.0";
    }
}
