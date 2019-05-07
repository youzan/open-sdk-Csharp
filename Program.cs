using System;
using System.Collections.Generic;
using Newtonsoft.Json;
using open_sdk.api;
using open_sdk.auth;
using open_sdk.core;
using open_sdk.token;
using open_sdk.token.type;
using RestSharp;
using static open_sdk.token.OauthToken;
namespace open_sdk
{
    class Program
    {
        static void Main(string[] args)
        {


            //AuthorizationCode authorization = new AuthorizationCode("bifrost-console", "bifrost-console")
            //{
            //    Code = "ad43719a9b612347af08ac8b5e43acb8"
            //};
            //OauthToken.TokenData  tokenData=  authorization.GetToken();
            //string token = tokenData.Token;
            //GeneralApi generalApi = new GeneralApi();
            //GeneralApiParams apiParams = new GeneralApiParams();
            //generalApi.SetName("dubboDemo");
            //generalApi.SetVersion("1.0.0");
            //generalApi.SetOAuthType(common.constant.OAuthEnum.TOKEN);
            //apiParams.AddParam("id", "2003777768");
            //generalApi.SetAPIParams(apiParams);

            //IYouZanClient defaultYZClient = new DefaultYZClient();

            //string result  =  defaultYZClient.Invoke(generalApi,new Token(token));


            //Console.WriteLine("request result *******************"+result);


            //Console.WriteLine("Hello World!");
            //Console.WriteLine("获取Token"+token);
            //string content = "{\n    \"client_id\": \"bifrost-console\",\n    \"client_secret\": \"bifrost-console\",\n    \"authorize_type\": \"authorization_code\",\n    \"code\": \"ad43719a9b612347af08ac8b5e43acb8\"\n}";
            //var client = new RestClient("http://open.youzanyun.com");
            //var request = new RestRequest("/auth/token",Method.POST);
            //List<Parameter> parameter = request.Parameters;
            //string jsonStr = JsonConvert.SerializeObject(parameter);
            //request.AddParameter("application/json", content, ParameterType.RequestBody); 
            //IRestResponse response = client.Execute(request);
            //var conterent = response.Content; 
            //Console.WriteLine("request result *******************"+ conterent);

            RefreshToken refresh = new RefreshToken("db9fe36d892719e921", "be58f76bbd80ee4af32c4f4655d20e9e")
            {
                FreshToken = ""
            };
            OauthToken.TokenData tokenData = refresh.GetToken();

            Silent silent = new Silent("bifrost-console", "bifrost-console", 2003777768);
            OauthToken.TokenData silenToken  =silent.GetToken();
            string token = tokenData.Token;
        }
    }
}
