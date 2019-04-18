package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtMultistoreOfflineGoodsSettingsGetResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtMultistoreOfflineGoodsSettingsGetParams;

public class KdtMultistoreOfflineGoodsSettingsGet extends AbstractAPI {

    public KdtMultistoreOfflineGoodsSettingsGet() {
    }

    public KdtMultistoreOfflineGoodsSettingsGet(KdtMultistoreOfflineGoodsSettingsGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.multistore.offline.goods.settings.get";
    }

    public Class getResultModelClass() {
        return KdtMultistoreOfflineGoodsSettingsGetResult.class;
    }

    public Class getParamModelClass() {
        return KdtMultistoreOfflineGoodsSettingsGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}