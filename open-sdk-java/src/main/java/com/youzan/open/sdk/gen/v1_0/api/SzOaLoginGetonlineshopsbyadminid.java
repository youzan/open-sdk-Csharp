package com.youzan.open.sdk.gen.v1_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0.model.SzOaLoginGetonlineshopsbyadminidResult;
import com.youzan.open.sdk.gen.v1_0.model.SzOaLoginGetonlineshopsbyadminidParams;

public class SzOaLoginGetonlineshopsbyadminid extends AbstractAPI {

    public SzOaLoginGetonlineshopsbyadminid() {
    }

    public SzOaLoginGetonlineshopsbyadminid(SzOaLoginGetonlineshopsbyadminidParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0";
    }

    public String getName() {
        return "sz.oa.login.getonlineshopsbyadminid";
    }

    public Class getResultModelClass() {
        return SzOaLoginGetonlineshopsbyadminidResult.class;
    }

    public Class getParamModelClass() {
        return SzOaLoginGetonlineshopsbyadminidParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}