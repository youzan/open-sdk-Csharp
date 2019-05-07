using System;
using System.Collections.Generic;

namespace open_sdk.api
{
    public class GeneralApiParams : IApiParams
    {
        private Dictionary<string, string> apiParams = new Dictionary<string, string>();

        IDictionary<string, string> IApiParams.ToParams()
        {
            return apiParams;
        }

        public void AddParam(string name, string value)
        {
            apiParams.Add(name,value);
        }
    }
}
