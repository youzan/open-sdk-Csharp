package com.youzan.open.sdk.client.core;

import com.fasterxml.jackson.core.type.TypeReference;
import com.youzan.open.sdk.api.API;
import com.youzan.open.sdk.client.auth.Auth;

import java.io.Closeable;

/**
 * @author ph0ly
 * @time 2016-11-28
 */
public interface KDTClient extends Closeable {

    /**
     * 设置client auth
     * @param auth
     */
    void setAuth(Auth auth);

    /**
     * 调用指定API，返回结果为API#getResultModelClass()指定的类型对象
     * @param api
     * @return
     */
    <T> T invoke(API api);

    /**
     * 获取SDK版本号
     * @return
     */
    String getVersion();
}
