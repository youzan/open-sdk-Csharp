using System;
using System.Collections.Generic;
using System.Net.Http;
using open_sdk.api;
using open_sdk.auth;

namespace open_sdk.http
{
    public interface IHttpClient
    {

        /**
         * 发送请求接口
         */
        string Send(string url,IDictionary<string, string> apiParams, IDictionary<string, string> headers, List<KeyValuePair<string, string>> files,bool isRichText=false);
    }
}
