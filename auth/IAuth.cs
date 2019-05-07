using System;
using open_sdk.common.constant;

namespace open_sdk.auth
{
    public interface IAuth
    {
        OAuthEnum GetType();
    }
}
