package com.youzan.open.sdk.api;

import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.model.APIResult;

import java.util.Map;

/**
 * @author ph0ly
 * @time 2016-11-28
 */
public interface API {

    /**
     * 获取API对应的请求方法，GET、POST、PUT、DELETE
     * @return
     */
    String getHttpMethod();

    /**
     * 获取http请求的url
     * @return
     */
    String getHttpUrl();

    /**
     * 获取API版本号
     * @return
     */
    String getVersion();

    /**
     * 获取API名称
     * @return
     */
    String getName();

    /**
     * 获取API参数
     * @return
     */
    APIParams getAPIParams();

    /**
     * 设置API参数
     * @param apiParams
     */
    void setAPIParams(APIParams apiParams);

    /**
     * 获取API返回模型类
     * @return
     */
    Class getResultModelClass();

    /**
     * 获取API参数模型类
     * @return
     */
    Class getParamModelClass();

    /**
     * 获取该API是否带附件
     * @return
     */
    boolean hasFiles();
}
