using System;
using System.Collections.Generic;
using Newtonsoft.Json;
using open_sdk.exception;
using open_sdk.http;
using static open_sdk.token.OauthToken;

namespace open_sdk.token.type
{
    public class AuthorizationCode : AbstractOauth
    {
        public string RedirectUrl { get; set; }

        public string State { get; set; }

        public string Code { get; set; }

        public AuthorizationCode(string clientId, string clientSecret) : base(clientId, clientSecret){}

        public override OauthToken.TokenData GetToken()
        {
            IDictionary<string, string> tokenParams = new Dictionary<string, string>
            {
                { "client_id", clientId },
                { "client_secret", clientSecret },
                { "authorize_type", "authorization_code" },
                { "code", Code }
            };
            DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
            string result = defaultHttpClient.Send(this.GetTokenUrl(), tokenParams, null, null);
            Console.WriteLine("t result *******************"+result);

            OauthToken oAuthToken = JsonConvert.DeserializeObject<OauthToken>(result);
            if (oAuthToken.Data == null) {
                TokenData tokenData = new TokenData
                {
                    Message = result
                };
                return tokenData;
            }
            string data = oAuthToken.Data.ToString();
            TokenData toKenData = JsonConvert.DeserializeObject<TokenData>(data);
            return toKenData;
        }
    }
}
