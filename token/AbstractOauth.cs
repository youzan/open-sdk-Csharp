using System;
using open_sdk.utils;
using static open_sdk.token.OauthToken;

namespace open_sdk.token
{
    public abstract class AbstractOauth : IOauth
    {
        private  string tokenUrl = "http://open.youzanyun.com/auth/token";

        protected string clientId;

        protected string clientSecret;

        protected AbstractOauth(string clientId, string clientSecret)
        {
            CheckUtils.CheckParams(clientId, clientSecret);
            this.clientId = clientId;
            this.clientSecret = clientSecret;
        }

        public void SetTokenUrl(string tokenUrl) {

            this.tokenUrl = tokenUrl;
        }


        public string GetTokenUrl()
        {

            return tokenUrl;
        }

        public abstract TokenData GetToken();
    }
}
