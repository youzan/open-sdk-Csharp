using System;
using open_sdk.common.constant;

namespace open_sdk.api
{
    public class GeneralApi : AbstractAPI
    {
        /**
         * 请求方法
         */
        private string httpMethod;
        /**
         * 请求接口名
         * 
         */        
        private string serviceName;

        /***
         * 
         * 鉴权类型
         */         
        private OAuthEnum oAuthType;


        public override string GetGateway()
        {
            return this.gateway;
        }

        public override string GetHttpMethod()
        {
            return this.httpMethod;
        }

        public override string GetName()
        {
            return this.serviceName;
        }

        public override OAuthEnum GetOAuthType()
        {
            return this.oAuthType;
        }

        public OAuthEnum SetOAuthType(OAuthEnum oAuthType)
        {
            return this.oAuthType = oAuthType;
        }

        public void SetHttpMethod(string httpMethod)
        {
            this.httpMethod = httpMethod;
        }

        public void SetName(string serviceName)
        {
            this.serviceName = serviceName;
        }

        public void SetVersion(string serviceVersion)
        {
            this.version = serviceVersion;
        }

        public override string ToString()
        {
            return "GeneralApi{" +
                    "httpMethod='" + httpMethod + '\'' +
                    ", serviceName='" + serviceName + '\'' +
                    ", serviceVersion='" + version + '\'' +
                    ", oAuthType=" + oAuthType +
                    ", apiParams=" + apiParams +
                    ", gateway='" + gateway + '\'' +
                    ", headers=" + headers +
                    '}';
        }
    }
}
