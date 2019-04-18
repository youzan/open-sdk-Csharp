package com.youzan.open.sdk.client.core;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.google.common.base.Preconditions;
import com.youzan.open.sdk.api.API;
import com.youzan.open.sdk.client.auth.Auth;
import com.youzan.open.sdk.client.auth.Sign;
import com.youzan.open.sdk.client.auth.Token;
import com.youzan.open.sdk.client.executor.ExecutionContext;
import com.youzan.open.sdk.client.executor.Executor;
import com.youzan.open.sdk.client.executor.SignExecutor;
import com.youzan.open.sdk.client.executor.TokenExecutor;
import com.youzan.open.sdk.exception.KDTException;
import com.youzan.open.sdk.model.ErrorResponse;
import com.youzan.open.sdk.model.Response;
import com.youzan.open.sdk.util.json.JsonUtils;
import com.youzan.open.sdk.util.http.HttpClient;
import com.youzan.open.sdk.util.http.DefaultHttpClient;

import java.io.IOException;

/**
 * @author ph0ly
 * @time 2016-11-28
 */
public class DefaultKDTClient implements KDTClient {

    private HttpClient httpClient;

    private Auth auth;

    public DefaultKDTClient() {
        this.httpClient = new DefaultHttpClient();
    }

    public DefaultKDTClient(Auth auth) {
        this.httpClient = new DefaultHttpClient();
        this.auth = auth;
    }

    public void setAuth(Auth auth) {
        this.auth = auth;
    }

    public String execute(API api) {
        Preconditions.checkArgument(auth != null, "Auth can't be null");
        Preconditions.checkArgument(api != null, "API can't be null");

        return execute(auth, api);
    }

    public String execute(Auth auth, API api) {
        Preconditions.checkArgument(auth != null, "Auth can't be null");
        Preconditions.checkArgument(api != null, "API can't be null");

        Executor executor = null;
        switch (auth.getType()) {
            case SIGN:
                if (!(auth instanceof Sign)) {
                    throw new KDTException("Auth type not match, expected sign");
                }
                executor = new SignExecutor(httpClient, (Sign) auth);
                break;
            case TOKEN:
                if (!(auth instanceof Token)) {
                    throw new KDTException("Auth type not match, expected token");
                }
                executor = new TokenExecutor(httpClient, (Token) auth);
                break;
            default:
                throw new KDTException("Unknown auth type");
        }

        ExecutionContext context = new ExecutionContext();
        context.setApi(api);
        context.setUrl(api.getHttpUrl());
        return executor.execute(context);
    }

    public <T> T invoke(API api) {
        Preconditions.checkArgument(api != null, "API不能为空");
        Preconditions.checkArgument(api.getAPIParams() != null, "API参数不能为空");

        String result = execute(auth, api);
        handleError(result);

        Response<T> response = JsonUtils.toClassBean(result, api.getResultModelClass());
        return response.getResponse();
    }

    public String getVersion() {
        return "2.0.0";
    }

    public void close() throws IOException {
        httpClient.close();
    }

    private void handleError(String result) {
        Response response = JsonUtils.toBean(result, new TypeReference<Response<ErrorResponse>>() {
        });
        if (response != null && response.getErrorResponse() != null) {
            ErrorResponse errorResponse = (ErrorResponse) response.getErrorResponse();
            throw new KDTException(errorResponse.toString());
        }
    }
}
