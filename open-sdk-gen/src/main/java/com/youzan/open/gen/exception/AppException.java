package com.youzan.open.gen.exception;

import com.youzan.open.gen.constant.AppCode;

/**
 * @author ph0ly
 * @time 2016-10-24
 */
public class AppException extends RuntimeException {

    private AppCode data;

    public AppException(AppCode data) {
        this.data = data;
    }

    public AppCode getData() {
        return this.data;
    }

}
