package com.youzan.open.sdk.gen.v1_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0.model.SzOaLoginIsstaffResult;
import com.youzan.open.sdk.gen.v1_0.model.SzOaLoginIsstaffParams;

public class SzOaLoginIsstaff extends AbstractAPI {

    public SzOaLoginIsstaff() {
    }

    public SzOaLoginIsstaff(SzOaLoginIsstaffParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0";
    }

    public String getName() {
        return "sz.oa.login.isstaff";
    }

    public Class getResultModelClass() {
        return SzOaLoginIsstaffResult.class;
    }

    public Class getParamModelClass() {
        return SzOaLoginIsstaffParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}