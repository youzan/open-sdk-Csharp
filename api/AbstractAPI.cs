using System;
using System.Collections.Generic;
using open_sdk.common.constant;

namespace open_sdk.api
{
    public abstract class AbstractAPI : IAPI
    {
        protected IApiParams apiParams;

        protected string gateway = "https://open.youzanyun.com";

        protected string version;

        protected Dictionary<string, string> headers = new Dictionary<string, string>();

        public void AddHeader(string headerName, string headerValue)
        {
            headers.Add(headerName, headerValue);
        }

        public IApiParams GetAPIParams()
        {
            return apiParams;
        }

        public void SetAPIParams(IApiParams apiParams)
        {
            this.apiParams = apiParams;
        }

        public void SetGateway(string gateway)
        {
            this.gateway = gateway;
        }

        public IDictionary<string, string> GetHeaders()
        {
            return headers;
        }

        public string GetVersion()
        {
            return version;
        }

       
        public abstract string GetGateway();
        public abstract OAuthEnum GetOAuthType();
        public abstract string GetHttpMethod();
        public abstract string GetName();

       
    }
}
