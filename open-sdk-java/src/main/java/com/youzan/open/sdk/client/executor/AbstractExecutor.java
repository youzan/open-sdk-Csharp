package com.youzan.open.sdk.client.executor;

import com.google.common.base.Preconditions;
import com.google.common.collect.Multimap;
import com.youzan.open.sdk.api.API;
import com.youzan.open.sdk.exception.KDTException;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.model.ByteWrapper;
import com.youzan.open.sdk.model.FileParams;
import com.youzan.open.sdk.util.http.HttpClient;
import org.apache.http.entity.ContentType;

import java.util.Collection;
import java.util.Map;

/**
 * @author ph0ly
 * @time 2016-11-28
 */
public abstract class AbstractExecutor implements Executor {

    protected HttpClient httpClient;

    protected abstract void prepare(ExecutionContext context);

    public String execute(ExecutionContext context) {
        prepare(context);
        return doExecuteInternal(context);
    }

    protected String doExecuteInternal(ExecutionContext context) {
        Preconditions.checkArgument(httpClient != null, "Http client can't be null");

        API api = context.getApi();
        String method = api.getHttpMethod();

        // 处理普通数据
        HttpClient.Params.Builder builder = new HttpClient.Params.Builder();
        Map<String, String> plainParams = context.getParams();
        for (String key : plainParams.keySet()) {
            Object value = plainParams.get(key);
            builder.add(key, value.toString());
        }

        // 处理文件数据
        APIParams apiParams = api.getAPIParams();
        if (apiParams != null) {
            if (apiParams instanceof FileParams) {
                Multimap<String, ByteWrapper> fileItemMultimap = ((FileParams) apiParams).toFileParams();
                context.setFileParams(fileItemMultimap);
            }
        }

        Multimap<String, ByteWrapper> val = context.getFileParams();
        if (val != null) {
            Map<String, Collection<ByteWrapper>> fileParams = val.asMap();
            for (String key : fileParams.keySet()) {
                Collection<ByteWrapper> byteWrappers = fileParams.get(key);
                for (ByteWrapper byteWrapper : byteWrappers) {
                    builder.add(key, byteWrapper.getData());
                }
            }
        }

        String apiName = api.getName();
        String service = apiName.substring(0, apiName.lastIndexOf("."));
        String action = apiName.substring(apiName.lastIndexOf(".") + 1, apiName.length());
        String version = api.getVersion();

        String url = String.format("%s/%s/%s/%s", context.getUrl(), service, version, action);

        HttpClient.Params params = builder.build();
        if (api.hasFiles() && val != null && val.size() > 0) {
            params.setContentType(ContentType.MULTIPART_FORM_DATA);
        }
        if ("GET".equalsIgnoreCase(method)) {
            return httpClient.get(url, params);
        } else if ("POST".equalsIgnoreCase(method)) {
            return httpClient.post(url, params);
        } else if ("PUT".equalsIgnoreCase(method)) {
            return httpClient.put(url, params);
        } else if ("DELETE".equalsIgnoreCase(method)) {
            return httpClient.delete(url, params);
        }
        throw new KDTException("Unknown http method, known(GET, POST, PUT, DELETE)");
    }

}
