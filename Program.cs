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
            //Dictionary<String, String> pList = new Dictionary<String, String>();
            //List<KeyValuePair<string, string>> list = new List<KeyValuePair<string, string>>();


            //GeneralApi generalApi = new GeneralApi();
            //GeneralApiParams apiParams = new GeneralApiParams();
            //generalApi.SetName("youzan.retail.open.online.spu.release");
            //generalApi.SetVersion("3.0.0");
            //generalApi.SetOAuthType(common.constant.OAuthEnum.TOKEN);
            //apiParams.AddParam("retail_source", "DAOYAN");
            //apiParams.AddParam("content", "<p>432<imgdata-origin-width=\\\"1224\\\"data-origin-height=\\\"924\\\"src=\\\"//img.yzcdn.cn/upload_files/2019/09/19/FtjyJv_Gr_Ti9H7rYiNn7s0OqbxW.png!730x0.jpg\\\"/></p>");
            //apiParams.AddParam("pre_sale", "False");
            //apiParams.AddParam("delivery_template_id", "782231");
            //apiParams.AddParam("is_virtual", "0");
            //apiParams.AddParam("components_extra_id", "64848302");
            //apiParams.AddParam("sold_time", "0");
            //apiParams.AddParam("purchase_right", "False");
            //apiParams.AddParam("spu_code", "BM49570907669");
            //apiParams.AddParam("price", "11.00");
            //apiParams.AddParam("title", "艾斯测试网店");
            //apiParams.AddParam("goods_no", "123");
            //apiParams.AddParam("total_stock", "1");
            //apiParams.AddParam("is_display", "0");
            //apiParams.AddParam("picture", "[{'url':'https://img.yzcdn.cn/upload_files/2017/06/19/Fme9JZz7T1rB8sSLnsnCk2gILNp_.png'}]");
            //generalApi.SetAPIParams(apiParams);
            //IYouZanClient defaultYZClient = new DefaultYZClient();
            //string result  =  defaultYZClient.Invoke(generalApi,new Token("f9650e560c2ec67fd5941f91df1db7a"), null, null,true);
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

            //RefreshToken refresh = new RefreshToken("db9fe36d892719e921", "be58f76bbd80ee4af32c4f4655d20e9e")
            //{
            //    FreshToken = ""
            //};
            //OauthToken.TokenData tokenData = refresh.GetToken();

            //Silent silent = new Silent("8d47c12fa8d4914c5e", "57df61dc21c391bfc6cb6a6d3b540dfb", 43005315);
            //OauthToken.TokenData silenToken  =silent.GetToken();
            //string token = silenToken.Token;
            //Console.WriteLine("request result *******************" + token);

            GeneralApi generalApi = new GeneralApi();
            GeneralApiParams apiParams = new GeneralApiParams();
            generalApi.SetName("youzan.shop.get");
            generalApi.SetVersion("3.0.0");
            generalApi.SetOAuthType(common.constant.OAuthEnum.TOKEN);
            generalApi.SetAPIParams(apiParams);
            IYouZanClient defaultYZClient = new DefaultYZClient();
            //升级前
            string result  =  defaultYZClient.Invoke(generalApi,new Token("f9650e560c2ec67fd5941f91df1db7a"), null, null);
            //升级后
            string result2 = defaultYZClient.Invoke(generalApi, new Token("f9650e560c2ec67fd5941f91df1db7a"), null, null,true);

            Console.WriteLine("request result *******************"+result);




            //Silent silent = new Silent("bifrost-console", "bifrost-console", 2003777768);
            //OauthToken.TokenData silenToken = silent.GetToken();
            //string token = silenToken.Token;
        }
    }
}
