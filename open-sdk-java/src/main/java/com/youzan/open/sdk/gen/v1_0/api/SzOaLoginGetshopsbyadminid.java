package com.youzan.open.sdk.gen.v1_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0.model.SzOaLoginGetshopsbyadminidResult;
import com.youzan.open.sdk.gen.v1_0.model.SzOaLoginGetshopsbyadminidParams;

public class SzOaLoginGetshopsbyadminid extends AbstractAPI {

    public SzOaLoginGetshopsbyadminid() {
    }

    public SzOaLoginGetshopsbyadminid(SzOaLoginGetshopsbyadminidParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0";
    }

    public String getName() {
        return "sz.oa.login.getshopsbyadminid";
    }

    public Class getResultModelClass() {
        return SzOaLoginGetshopsbyadminidResult.class;
    }

    public Class getParamModelClass() {
        return SzOaLoginGetshopsbyadminidParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}