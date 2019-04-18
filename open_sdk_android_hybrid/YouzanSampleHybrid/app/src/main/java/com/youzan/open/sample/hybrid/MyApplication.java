/*
 * author: lachang@youzan.com
 * Copyright (C) 2016 Youzan, Inc. All Rights Reserved.
 */
package com.youzan.open.sample.hybrid;

import android.app.Application;

import com.youzan.sdk.YouzanSDK;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        /**
         * 初始化SDK.
         *
         * @param Context  application Context
         * @param clientId 需向有赞申请获取.
         */
        YouzanSDK.init(getApplicationContext(), "XXXX");
    }
}
