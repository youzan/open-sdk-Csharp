using System;
using open_sdk.common.constant;

namespace open_sdk.auth
{
    public class Token : IAuth
    {
        private readonly string accessToken;

        OAuthEnum IAuth.GetType()
        {
            return OAuthEnum.TOKEN;
        }

        public Token(string accessToken)
        {
            if (string.IsNullOrEmpty(accessToken))
            {
                throw new ArgumentException("Access token can't be null");
            }
            this.accessToken = accessToken;
        }

        public string GetToken() {

            return this.accessToken;
        }
       


        public override bool Equals(object obj)
        {
            if (obj == null)
            {
                return false;
            }
            if ((obj.GetType().Equals(this.GetType())) == false)
            {
                return false;
            }
            Token temp = null;
            temp = (Token)obj;
            return this.accessToken.Equals(temp.accessToken);

        }

        public override int GetHashCode()
        {
            return this.accessToken.GetHashCode();
        }

    }
}
