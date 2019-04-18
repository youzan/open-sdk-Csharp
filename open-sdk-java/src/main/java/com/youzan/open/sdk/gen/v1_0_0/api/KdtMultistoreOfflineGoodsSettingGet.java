package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtMultistoreOfflineGoodsSettingGetResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtMultistoreOfflineGoodsSettingGetParams;

public class KdtMultistoreOfflineGoodsSettingGet extends AbstractAPI {

    public KdtMultistoreOfflineGoodsSettingGet() {
    }

    public KdtMultistoreOfflineGoodsSettingGet(KdtMultistoreOfflineGoodsSettingGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.multistore.offline.goods.setting.get";
    }

    public Class getResultModelClass() {
        return KdtMultistoreOfflineGoodsSettingGetResult.class;
    }

    public Class getParamModelClass() {
        return KdtMultistoreOfflineGoodsSettingGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}