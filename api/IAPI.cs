using System;
using System.Collections.Generic;
using open_sdk.common.constant;

namespace open_sdk.api
{
    public interface IAPI
    {

        /**
          * 获取网关域名
          */
        string GetGateway();

        /**
         * 自定义网关域名
         */
        void SetGateway(string gateway);

        /**
         * 获取授权类型
         */
        OAuthEnum GetOAuthType();

        /**
         * 添加请求头
         */
        void AddHeader(string headerName, string headerValue);

        /**
         * 获取API对应的请求方法，GET、POST、PUT、DELETE
         */
        string GetHttpMethod();

        /**
         * 获取API版本号
         */
        string GetVersion();

        /**
         * 获取API名称
         */
        string GetName();

        /**
         * 获取API参数
         */
        IApiParams GetAPIParams();

        /**
         * 设置API参数
         */
        void SetAPIParams(IApiParams apiParams);

        /**
         * 获取API携带头部信息
         */
        IDictionary<string, string> GetHeaders();



    }
}
