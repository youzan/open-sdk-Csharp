package com.youzan.open.gen.model;

import com.youzan.open.gen.constant.AppCode;

/**
 * @author ph0ly
 * @time 2016-06-20
 */
public class ResultModel<T> {

    private String message = AppCode.SUCCESS.getMessage();
    private String code = AppCode.SUCCESS.getCode();
    private T data;

    public ResultModel() {

    }

    public ResultModel(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
