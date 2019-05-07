using System;
using open_sdk.exception;
using open_sdk.token;
using static open_sdk.token.OauthToken;

namespace open_sdk.utils
{
    public static class CheckUtils
    {
        public static void CheckArgument(Boolean expression, int code, string message)
        {
        if (!expression) {
            throw new SDKException(code, message);
    }
}

        internal static void CheckArgument(bool v1, Func<TypeCode> getTypeCode, string v2)
        {

        }
        public static void CheckParams(string clientId, string clientSecret) {
            if (string.IsNullOrEmpty(clientId)|| string.IsNullOrEmpty(clientSecret)) {
                throw new Exception("clientId or clientSecret cannot be null");
            }

        }
    }
}
