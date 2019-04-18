package com.youzan.open.gen.web.service;

import com.google.common.collect.Multimap;
import com.youzan.open.gen.model.OpenAPI;

import java.util.List;

/**
 * @author ph0ly
 * @time 2016-11-30
 */
public interface CarmenAPIService {

    Multimap<String, OpenAPI> getOpenAPIs();

}
