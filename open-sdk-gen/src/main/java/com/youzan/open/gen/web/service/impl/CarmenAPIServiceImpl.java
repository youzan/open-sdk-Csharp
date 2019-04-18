package com.youzan.open.gen.web.service.impl;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.youzan.carmen.open.api.OpenApiParamRemoteService;
import com.youzan.carmen.open.api.OpenApiRemoteService;
import com.youzan.carmen.open.entity.OpenApiParam;
import com.youzan.carmen.open.entity.OpenCarmenApi;
import com.youzan.carmen.open.entity.OpenCarmenApiAll;
import com.youzan.carmen.open.entity.OpenCarmenApiExtend;
import com.youzan.open.gen.model.OpenAPI;
import com.youzan.open.gen.model.OpenAPIParam;
import com.youzan.open.gen.model.OpenAPIResult;
import com.youzan.open.gen.web.service.CarmenAPIService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ph0ly
 * @time 2016-11-30
 */
@Service
public class CarmenAPIServiceImpl implements CarmenAPIService {

    @Autowired
    private OpenApiRemoteService openApiRemoteService;

    @Autowired
    private OpenApiParamRemoteService openApiParamRemoteService;

    @Value("${carmen.env:1}")
    private Byte env;

    @Override
    public Multimap<String, OpenAPI> getOpenAPIs() {
        List<OpenCarmenApi> openCarmenApis = openApiRemoteService.getByOuterApi();
        Multimap<String, OpenAPI> openAPIMap = ArrayListMultimap.create();
        for (OpenCarmenApi openCarmenApi : openCarmenApis) {
            OpenAPI openAPI = processApi(openCarmenApi, env);
            openAPIMap.put(openCarmenApi.getVersion(), openAPI);
        }

        return openAPIMap;
    }

    private OpenAPI processApi(OpenCarmenApi openCarmenApi, Byte env) {
        Long apiId = openCarmenApi.getId();
        OpenCarmenApiExtend carmenApiExtend = openApiRemoteService.getCarmenApiExtend(Long.valueOf(apiId));
        List<OpenApiParam> openApiParams = openApiParamRemoteService.getOpenApiParam(apiId.intValue(), env);

        String extendedParamStr = carmenApiExtend.getExtendField2();
        OpenAPI openAPI = new OpenAPI();
        openAPI.setId(apiId);
        openAPI.setName(openCarmenApi.getNamespace() + "." + openCarmenApi.getName());
        openAPI.setMethod(openCarmenApi.getRequestType().equals("0") ? "GET" : "POST");
        openAPI.setVersion(openCarmenApi.getVersion());

        List<OpenAPIParam> openAPIParams = Lists.newArrayList();
        for (OpenApiParam apiParam : openApiParams) {
            OpenAPIParam openAPIParam = new OpenAPIParam();
            BeanUtils.copyProperties(apiParam, openAPIParam);
            openAPIParams.add(openAPIParam);
        }

        if (!StringUtils.isEmpty(extendedParamStr)) {
            String[] params = extendedParamStr.split("&");
            int len = params.length / 4;

            List<OpenAPIResult> openAPIResults = Lists.newArrayList();
            for (int i = 0; i < len; i++) {
                OpenAPIResult result = new OpenAPIResult();
                String name = (params[i * 4].split("=").length == 2) ? params[i * 4].split("=")[1] : "";
                String type = (params[i * 4 + 1].split("=").length == 2) ? params[i * 4 + 1].split("=")[1] : "";
                String isNeed = (params[i * 4 + 2].split("=").length == 2) ? params[i * 4 + 2].split("=")[1] : "";
                String desc = (params[i * 4 + 3].split("=").length == 2) ? params[i * 4 + 3].split("=")[1] : "";

                result.setName(name);
                result.setIsNeed(isNeed);
                result.setType(type);
                result.setDesc(desc);

                openAPIResults.add(result);
            }

            openAPI.setResults(openAPIResults);
        }

        openAPI.setParams(openAPIParams);

        return openAPI;
    }

}
