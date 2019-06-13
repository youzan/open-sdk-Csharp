using System;
using System.Collections.Generic;
using System.IO;
using System.Net.Http;
using Newtonsoft.Json;
using System.Text;
using System.Web;
using open_sdk.exception;

namespace open_sdk.http
{
    public class DefaultHttpClient : IHttpClient
    {

        private const string CONTENT_TYPE = "application/json";

        private const string CHART_SET = "utf-8";



        public DefaultHttpClient() { }


        public string Send(string url, IDictionary<string, string> apiParams, IDictionary<string, string> headers, List<KeyValuePair<string, string>> files)
        {

            using (var httpClient = new HttpClient())
            {
                if (headers != null)
                {
                    foreach (var header in headers)
                    {
                        httpClient.DefaultRequestHeaders.Add(header.Key, header.Value);
                    }
                }
                // User-Agent 值修改 TODO
                httpClient.DefaultRequestHeaders.Add("UserAgent", "YZY-Open-Client 1.0.0-CSharp");

                var builder = new UriBuilder(url);

                var json = JsonConvert.SerializeObject(apiParams);

                HttpContent httpContent = new StringContent(json, Encoding.UTF8, CONTENT_TYPE);
                //处理文件上传
                if (files != null)
                {
                    var requestForm = new MultipartFormDataContent();
                    foreach (var file in files)
                    {
                        var content = new StreamContent(new FileStream(file.Value, FileMode.Open));
                        var fileName = file.Value;
                        var idx = fileName.LastIndexOf("/", StringComparison.Ordinal) + 1;
                        requestForm.Add(content, file.Key, fileName.Substring(idx, fileName.Length - idx));
                    }
                    httpContent = requestForm;
                }

                httpContent.Headers.ContentType.MediaType = CONTENT_TYPE;
                httpContent.Headers.ContentType.CharSet = CHART_SET;
                Console.WriteLine("Request Result------>" + httpContent.ReadAsStringAsync().Result);
                //try 
                var response = httpClient.PostAsync(url, httpContent).Result;

                if (response.IsSuccessStatusCode)
                {
                    return response.Content.ReadAsStringAsync().Result;
                }
                //日志打印
                throw new SDKException(response.StatusCode, "Internal server error");
               
            }

        }
    }
}
