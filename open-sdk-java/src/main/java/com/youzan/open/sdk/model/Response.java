package com.youzan.open.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author ph0ly
 * @time 2016-11-29
 */
public class Response<T> {

    private T response;

    @JsonProperty("error_response")
    private T errorResponse;

    @JsonCreator
    public Response(@JsonProperty("response") T response) {
        this.response = response;
    }

    public T getResponse() {
        return response;
    }

    public void setResponse(T response) {
        this.response = response;
    }

    public T getErrorResponse() {
        return errorResponse;
    }

    public void setErrorResponse(T errorResponse) {
        this.errorResponse = errorResponse;
    }
}
