package com.youzan.open.sdk.gen.v1_0_0.api;

import com.youzan.open.sdk.api.AbstractAPI;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtUmpPointsstoreSettingsGetResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtUmpPointsstoreSettingsGetParams;

public class KdtUmpPointsstoreSettingsGet extends AbstractAPI {

    public KdtUmpPointsstoreSettingsGet() {
    }

    public KdtUmpPointsstoreSettingsGet(KdtUmpPointsstoreSettingsGetParams apiParams) {
        this.params = apiParams;
    }

    public String getHttpMethod() {
        return "GET";
    }

    public String getVersion() {
        return "1.0.0";
    }

    public String getName() {
        return "kdt.ump.pointsstore.settings.get";
    }

    public Class getResultModelClass() {
        return KdtUmpPointsstoreSettingsGetResult.class;
    }

    public Class getParamModelClass() {
        return KdtUmpPointsstoreSettingsGetParams.class;
    }

    public boolean hasFiles() {
        return  false ;
    }

}