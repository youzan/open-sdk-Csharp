package com.youzan.open.sdk.client.executor;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.youzan.open.sdk.api.API;
import com.youzan.open.sdk.client.auth.Sign;
import com.youzan.open.sdk.util.hash.MD5Utils;
import com.youzan.open.sdk.util.http.HttpClient;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author ph0ly
 * @time 2016-11-28
 */
public class SignExecutor extends AbstractExecutor implements Executor {

    private Sign sign;

    public SignExecutor(HttpClient httpClient, Sign sign) {
        this.sign = sign;
        this.httpClient = httpClient;
    }

    protected void prepare(ExecutionContext context) {
        String appId = sign.getAppId();

        API api = context.getApi();
        Map<String, Object> params = api.getAPIParams().toParams();

        Map<String, String> newParams = Maps.newHashMap();
        for (String key : params.keySet()) {
            newParams.put(key, params.get(key).toString());
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timeStr = sdf.format(new Date());

        newParams.put("method", api.getName());
        newParams.put("timestamp", timeStr);
        newParams.put("format", "json");
        newParams.put("app_id", appId);
        newParams.put("v", "1.0");
        newParams.put("sign_method", "md5");

        String paramSign = getSign(newParams);
        newParams.put("sign", paramSign);

        context.setUrl(api.getHttpUrl() + "/entry");

        context.setParams(newParams);
    }

    private String getSign(Map<String, String> params) {
        String appSecret = sign.getAppSecret();

        List<String> keys = Lists.newArrayList(params.keySet());

        Collections.sort(keys, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        StringBuilder sb = new StringBuilder();
        sb.append(appSecret);
        for (String k : keys) {
            sb.append(String.format("%s%s", k, params.get(k)));
        }
        sb.append(appSecret);
        String text = sb.toString();
        return MD5Utils.MD5(text);
    }
}
