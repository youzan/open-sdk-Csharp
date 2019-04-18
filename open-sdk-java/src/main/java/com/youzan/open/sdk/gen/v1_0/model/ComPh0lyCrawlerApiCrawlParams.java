package com.youzan.open.sdk.gen.v1_0.model;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.model.ByteWrapper;
import com.youzan.open.sdk.model.FileParams;
import java.util.List;
import java.util.Map;
import java.util.Date;

public class ComPh0lyCrawlerApiCrawlParams implements APIParams, FileParams  {

    private String url;
    private String component;


    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }


    public void setComponent(String component) {
        this.component = component;
    }

    public String getComponent() {
        return this.component;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (url != null) {
            params.put("url", url);
        }
        if (component != null) {
            params.put("component", component);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}