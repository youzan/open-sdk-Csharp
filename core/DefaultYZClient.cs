using System;
using System.Collections.Generic;
using open_sdk.api;
using open_sdk.auth;
using open_sdk.common.constant;
using open_sdk.http;
using open_sdk.token;

namespace open_sdk.core
{
    public class DefaultYZClient : IYouZanClient
    {
        private readonly DefaultHttpClient defaultHttpClient;

        public DefaultYZClient()
        {
            this.defaultHttpClient = new DefaultHttpClient();
        }
       

        string IYouZanClient.Invoke(IAPI api, IAuth auth)
        {
            {
                string url = null;
                if (api != null)
                {
                    OAuthEnum oAuth = api.GetOAuthType();
                    switch (oAuth)
                    {
                        case OAuthEnum.TOKEN:
                            url = BuildUrl(api, auth);
                            break;
                        case OAuthEnum.SIGN:
                            break;
                        case OAuthEnum.DIRECT:
                            url = BuildUrl(api, auth);
                            break;

                    }
                    var method = api.GetHttpMethod();
                    IApiParams apiParams = api.GetAPIParams();
                    IDictionary<string, string> requestParams = apiParams.ToParams();
                    IDictionary<string, string> header = api.GetHeaders();
                    string result = defaultHttpClient.Send(url, requestParams, header, null);
                    return result;
                }
                return null;
            }
        }

        /**
         * 构建请求URL
         * 
         */
        private string BuildUrl(IAPI api, IAuth auth)
        {
            string url = null;
            if (auth == null)
            {
                throw new ArgumentNullException(nameof(auth));
            }

            var method = api.GetHttpMethod();
            var gatway = api.GetGateway();
            var apiName = api.GetName();
            var version = api.GetVersion();
            IApiParams apiParams = api.GetAPIParams();
            IDictionary<string, string> requestParams = apiParams.ToParams();
            IDictionary<string, string> header = api.GetHeaders();

            if (auth is Token)
            { 
                var authToken = auth as Token;

             url = String.Format("{0}{1}{2}/{3}{4}{5}", gatway, "/api/", apiName, version, "?access_token=", authToken.GetToken());
            }

            if (auth is Direct)
            {
                var authToken = auth as Direct;

                url = String.Format("{0}{1}{2}{3}/{4}", gatway, "/api/","auth_exempt/",apiName, version);
            }
            return url;
        }


    }
}

