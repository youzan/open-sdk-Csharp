package com.youzan.open.sdk;

import com.youzan.open.sdk.gen.v1_0_0.api.KdtItemcategoriesGet;
import com.youzan.open.sdk.gen.v1_0_0.api.KdtItemcategoriesTagsGet;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtItemcategoriesGetParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtItemcategoriesGetResult;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtItemcategoriesTagsGetParams;
import com.youzan.open.sdk.gen.v1_0_0.model.KdtItemcategoriesTagsGetResult;
import org.junit.Test;

/**
 * @author ph0ly
 * @time 2016-12-07
 */
public class KdtNeiCeTest extends BaseTest {

    @Test
    public void testKdtItemCategoriesGet() {
        KdtItemcategoriesGetParams kdtItemcategoriesGetParams = new KdtItemcategoriesGetParams();
        KdtItemcategoriesGet kdtItemcategoriesGet = new KdtItemcategoriesGet(kdtItemcategoriesGetParams);
        KdtItemcategoriesGetResult kdtItemcategoriesGetResult = client.invoke(kdtItemcategoriesGet);

        KdtItemcategoriesGetResult.GoodsCategory[] goodsCategories = kdtItemcategoriesGetResult.getCategories();
        for (KdtItemcategoriesGetResult.GoodsCategory goodsCategory : goodsCategories) {
            System.out.println(goodsCategory.getName());
        }
    }

    @Test
    public void testKdtItemsCategoriesTagsGet() {
        KdtItemcategoriesTagsGetParams kdtItemcategoriesTagsGetParams = new KdtItemcategoriesTagsGetParams();
        KdtItemcategoriesTagsGet kdtItemcategoriesTagsGet = new KdtItemcategoriesTagsGet(kdtItemcategoriesTagsGetParams);
        KdtItemcategoriesTagsGetResult kdtItemcategoriesTagsGetResult = client.invoke(kdtItemcategoriesTagsGet);

        KdtItemcategoriesTagsGetResult.GoodsTag[] goodsTags = kdtItemcategoriesTagsGetResult.getTags();
        for (KdtItemcategoriesTagsGetResult.GoodsTag goodsTag : goodsTags) {
            System.out.println(goodsTag.getName());
        }
    }

    @Test
    public void testKdtItemCategoriesTagAdd() {

    }

}
