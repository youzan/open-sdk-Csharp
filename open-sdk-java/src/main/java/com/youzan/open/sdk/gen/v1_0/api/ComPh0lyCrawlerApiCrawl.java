package com.youzan.open.sdk.gen.v1_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0.model.ComPh0lyCrawlerApiCrawlResult;
import com.youzan.open.sdk.gen.v1_0.model.ComPh0lyCrawlerApiCrawlParams;

public class ComPh0lyCrawlerApiCrawl extends AbstractAPI {

    public ComPh0lyCrawlerApiCrawl() {
    }

    public ComPh0lyCrawlerApiCrawl(ComPh0lyCrawlerApiCrawlParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0";
    }

    public String getName() {
        return "com.ph0ly.crawler.api.crawl";
    }

    public Class getResultModelClass() {
        return ComPh0lyCrawlerApiCrawlResult.class;
    }

    public Class getParamModelClass() {
        return ComPh0lyCrawlerApiCrawlParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}