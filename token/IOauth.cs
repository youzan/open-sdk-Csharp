using System;
using static open_sdk.token.OauthToken;

namespace open_sdk.token
{
    public interface IOauth
    {
        TokenData GetToken();
    }
}
