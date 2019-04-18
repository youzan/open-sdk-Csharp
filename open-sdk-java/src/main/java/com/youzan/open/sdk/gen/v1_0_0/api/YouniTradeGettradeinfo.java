package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.YouniTradeGettradeinfoResult;
import com.youzan.open.sdk.gen.v1_0_0.model.YouniTradeGettradeinfoParams;

public class YouniTradeGettradeinfo extends AbstractAPI {

    public YouniTradeGettradeinfo() {
    }

    public YouniTradeGettradeinfo(YouniTradeGettradeinfoParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "youni.trade.getTradeInfo";
    }

    public Class getResultModelClass() {
        return YouniTradeGettradeinfoResult.class;
    }

    public Class getParamModelClass() {
        return YouniTradeGettradeinfoParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}