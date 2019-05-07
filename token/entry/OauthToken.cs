using System;
using Newtonsoft.Json;

namespace open_sdk.token
{
    public class OauthToken
    {

        [JsonProperty("code")]
        public string Code { get; set; }

        [JsonProperty("success")]
        public string Success { get; set; }

        [JsonProperty("data")]
        public Object Data { get; set; }

        [JsonProperty("message")]
        public string Message { get; set; }

        //message 
        // Object--->TokenData

        public class TokenData
        {


            [JsonProperty("expires")]
            public string Expires { get; set; }

            [JsonProperty("access_token")]
            public string Token { get; set; }

            [JsonProperty("authority_id")]
            public string Authority { get; set; }

            [JsonProperty("refresh_token")]
            public string RefRefreshToken { get; set; }

            public string Message { get; set; }
        }
    }




}
