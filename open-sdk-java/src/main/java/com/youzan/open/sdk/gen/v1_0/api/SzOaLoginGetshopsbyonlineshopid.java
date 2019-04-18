package com.youzan.open.sdk.gen.v1_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0.model.SzOaLoginGetshopsbyonlineshopidResult;
import com.youzan.open.sdk.gen.v1_0.model.SzOaLoginGetshopsbyonlineshopidParams;

public class SzOaLoginGetshopsbyonlineshopid extends AbstractAPI {

    public SzOaLoginGetshopsbyonlineshopid() {
    }

    public SzOaLoginGetshopsbyonlineshopid(SzOaLoginGetshopsbyonlineshopidParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0";
    }

    public String getName() {
        return "sz.oa.login.getshopsbyonlineshopid";
    }

    public Class getResultModelClass() {
        return SzOaLoginGetshopsbyonlineshopidResult.class;
    }

    public Class getParamModelClass() {
        return SzOaLoginGetshopsbyonlineshopidParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}