/*
 * author: lachang@youzan.com
 * Copyright (C) 2016 Youzan, Inc. All Rights Reserved.
 */
package com.youzan.open.sample.hybrid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.youzan.sdk.YouzanSDK;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_youzan_test).setOnClickListener(this);
        findViewById(R.id.btn_youzan_lougout).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_youzan_test:
                Intent intent = new Intent(this, YouzanActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_youzan_lougout:
                YouzanSDK.userLogout(this);
                break;
            default:
                break;
        }
    }
}
