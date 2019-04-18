package com.youzan.open.sdk.model;

import com.google.common.collect.Multimap;

/**
 * @author ph0ly
 * @time 2016-11-29
 */
public interface FileParams extends APIParams {

    Multimap<String, ByteWrapper> toFileParams();

}
