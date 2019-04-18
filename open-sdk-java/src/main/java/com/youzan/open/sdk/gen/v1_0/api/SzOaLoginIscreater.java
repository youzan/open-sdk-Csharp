package com.youzan.open.sdk.gen.v1_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0.model.SzOaLoginIscreaterResult;
import com.youzan.open.sdk.gen.v1_0.model.SzOaLoginIscreaterParams;

public class SzOaLoginIscreater extends AbstractAPI {

    public SzOaLoginIscreater() {
    }

    public SzOaLoginIscreater(SzOaLoginIscreaterParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0";
    }

    public String getName() {
        return "sz.oa.login.iscreater";
    }

    public Class getResultModelClass() {
        return SzOaLoginIscreaterResult.class;
    }

    public Class getParamModelClass() {
        return SzOaLoginIscreaterParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}