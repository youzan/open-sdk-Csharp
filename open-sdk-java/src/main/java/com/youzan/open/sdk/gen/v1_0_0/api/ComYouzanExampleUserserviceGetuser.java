package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.ComYouzanExampleUserserviceGetuserResult;
import com.youzan.open.sdk.gen.v1_0_0.model.ComYouzanExampleUserserviceGetuserParams;

public class ComYouzanExampleUserserviceGetuser extends AbstractAPI {

    public ComYouzanExampleUserserviceGetuser() {
    }

    public ComYouzanExampleUserserviceGetuser(ComYouzanExampleUserserviceGetuserParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "com.youzan.example.UserService.getUser";
    }

    public Class getResultModelClass() {
        return ComYouzanExampleUserserviceGetuserResult.class;
    }

    public Class getParamModelClass() {
        return ComYouzanExampleUserserviceGetuserParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}