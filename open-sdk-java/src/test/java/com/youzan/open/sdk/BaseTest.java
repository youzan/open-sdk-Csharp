package com.youzan.open.sdk;

import com.youzan.open.sdk.client.core.DefaultKDTClient;
import com.youzan.open.sdk.client.core.KDTClient;

/**
 * @author ph0ly
 * @time 2016-12-06
 */
public class BaseTest {

    public static KDTClient client = new DefaultKDTClient(new com.youzan.open.sdk.client.auth.Sign("dfca05368d5597a010", "3337b712d7343b2b21fc996e4a4b2722"));

}
