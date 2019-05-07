using System;
using open_sdk.common.constant;

namespace open_sdk.auth
{
    public class Direct : IAuth
    {
        public Direct() { }

        OAuthEnum IAuth.GetType()
        {
            return OAuthEnum.DIRECT;
        }
    }
}
