using System;
using System.Collections.Generic;

namespace open_sdk.api
{
    public interface IApiParams
    {
        IDictionary<string, string> ToParams();
    }
}
