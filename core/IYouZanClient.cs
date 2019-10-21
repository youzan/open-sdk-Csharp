using System;
using System.Collections.Generic;
using open_sdk.api;
using open_sdk.auth;
using open_sdk.common.constant;
using open_sdk.token;

namespace open_sdk.core
{
    public interface IYouZanClient
    {
        string Invoke(IAPI api, IAuth auth,IDictionary<string, string> headers, List<KeyValuePair<string, string>> files, bool isRichText = false);

    }
}
