package com.youzan.open.sdk.client.executor;

import com.google.common.collect.Multimap;
import com.youzan.open.sdk.api.API;
import com.youzan.open.sdk.model.ByteWrapper;

import java.util.Map;

/**
 * @author ph0ly
 * @time 2016-11-28
 */
public class ExecutionContext {

    private API api;
    private String url;
    private Map<String, String> params;
    private Multimap<String, ByteWrapper> fileParams;

    public API getApi() {
        return api;
    }

    public void setApi(API api) {
        this.api = api;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Map<String, String> getParams() {
        return params;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }

    public Multimap<String, ByteWrapper> getFileParams() {
        return fileParams;
    }

    public void setFileParams(Multimap<String, ByteWrapper> fileParams) {
        this.fileParams = fileParams;
    }
}
