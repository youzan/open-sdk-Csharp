//package com.youzan.open.sdk;
//
//import com.fasterxml.jackson.core.type.TypeReference;
//import com.youzan.open.sdk.api.API;
//import com.youzan.open.sdk.client.auth.Token;
//import com.youzan.open.sdk.client.core.DefaultKDTClient;
//import com.youzan.open.sdk.client.core.KDTClient;
//import com.youzan.open.sdk.gen.v1_0_0.api.KdtItemsOnSaleGet;
//import com.youzan.open.sdk.gen.v1_0_0.model.KdtItemsOnSaleGetParams;
//import com.youzan.open.sdk.gen.v1_0_0.model.KdtItemsOnSaleGetResult;
//
///**
// * @author ph0ly
// * @time 2016-11-28
// */
//public class Main {
//
//    public static void main(String[] args) {
//
//        //KDTClient client = new DefaultKDTClient(new Sign("dfca05368d5597a010", "3337b712d7343b2b21fc996e4a4b2722"));
//        KDTClient client = new DefaultKDTClient(new Token("047a900c5ad83cc9b17631cd30ce60e2"));
//
//        // 创建一个API并设置好参数
//        API api = new KdtItemsOnSaleGet();
//        api.setAPIParams(new KdtItemsOnSaleGetParams());
//        // 不处理返回值调用
//        String result = client.execute(api);
//        System.out.println(result);
//
//        KdtItemsOnSaleGetResult kdtItemsOnSaleGetResult = client.invoke(api, new TypeReference<KdtItemsOnSaleGetResult>() {
//        });
//        KdtItemsOnSaleGetResult.Response response = kdtItemsOnSaleGetResult.getResponse();
//        for (KdtItemsOnSaleGetResult.GoodsDetail goodsDetail : response.getItems()) {
//            System.out.println(goodsDetail.getTitle());
//        }
//
//        // 返回指定格式调用
////        KdtItemsOnSaleGetResult kdtItemsOnSaleGetResult = client.invoke(api, new TypeReference<KdtItemsOnSaleGetResult>() {
////        });
////        KdtItemsOnSaleGetResult.Response response = kdtItemsOnSaleGetResult.getResponse();
////        for (KdtItemsOnSaleGetResult.GoodsDetail goodsDetail : response.getItems()) {
////            System.out.println(goodsDetail.getTitle());
////        }
//
//    }
//
//}
