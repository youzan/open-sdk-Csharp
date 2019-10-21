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
       

        string IYouZanClient.Invoke(IAPI api, IAuth auth, IDictionary<string, string> headers, List<KeyValuePair<string, string>> files, bool isRichText = false)
        {
            {
                string url = null;
                if (api != null)
                {
                    OAuthEnum oAuth = api.GetOAuthType();
                    switch (oAuth)
                    {
                        case OAuthEnum.TOKEN:
                            url = BuildUrl(api, auth,isRichText);
                            break;
                        case OAuthEnum.SIGN:
                            break;
                        case OAuthEnum.DIRECT:
                            url = BuildUrl(api, auth,isRichText);
                            break;

                    }
                    var method = api.GetHttpMethod();
                    IApiParams apiParams = api.GetAPIParams();
                    IDictionary<string, string> requestParams = apiParams.ToParams();
                    IDictionary<string, string> header = api.GetHeaders();
                    string result = defaultHttpClient.Send(url, requestParams, header, files,isRichText);
                    return result;
                }
                return null;
            }
        }

        /**
         * 构建请求UR
         * 
         */
        private string BuildUrl(IAPI api, IAuth auth, Boolean isRichText)
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
                if (isRichText) {
                    url = String.Format("{0}{1}{2}/{3}{4}{5}", gatway, "/api/_textarea_/", apiName, version, "?access_token=", authToken.GetToken());
                }
                else {
                    url = String.Format("{0}{1}{2}/{3}{4}{5}", gatway, "/api/", apiName, version, "?access_token=", authToken.GetToken());
                }
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

