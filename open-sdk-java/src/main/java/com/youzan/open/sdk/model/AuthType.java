package com.youzan.open.sdk.model;

/**
 * @author ph0ly
 * @time 2016-11-28
 */
public enum AuthType {

    SIGN("sign"),
    TOKEN("token");

    private String value;

    AuthType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
