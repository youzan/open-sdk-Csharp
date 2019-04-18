package com.youzan.open.sdk;

import com.youzan.open.sdk.gen.v1_0_0.api.KdtItemAdd;
import com.youzan.open.sdk.gen.v1_0_0.api.KdtMultistoreOfflineGoodsSettingGet;
import com.youzan.open.sdk.gen.v1_0_0.api.KdtShopBasicGet;
import com.youzan.open.sdk.gen.v1_0_0.api.KdtShopStatusGet;
import com.youzan.open.sdk.gen.v1_0_0.model.*;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author ph0ly
 * @time 2016-12-07
 */
public class KdtShopTest extends BaseTest {

    @Test
    public void testKdtShopStatusGet() {
        KdtShopStatusGetParams kdtShopStatusGetParams = new KdtShopStatusGetParams();
        KdtShopStatusGet kdtShopStatusGet = new KdtShopStatusGet(kdtShopStatusGetParams);
        KdtShopStatusGetResult kdtShopStatusGetResult = client.invoke(kdtShopStatusGet);
        System.out.println(kdtShopStatusGetResult.getStatus().getIsBindWeixin());
    }

    @Test
    public void testKdtShopBasicGet() {
        KdtShopBasicGetParams kdtShopBasicGetParams = new KdtShopBasicGetParams();
        KdtShopBasicGet kdtShopBasicGet = new KdtShopBasicGet(kdtShopBasicGetParams);
        KdtShopBasicGetResult kdtShopBasicGetResult = client.invoke(kdtShopBasicGet);
        assertEquals(kdtShopBasicGetResult.getName(), "jyp.io");
    }

    @Test
    public void testKdtOfflineUpdate() {

    }

    @Test
    public void testKdtMultistoreOfflineGoodsSettingGet() {
        KdtItemAddResult kdtItemAddResult = KdtItemTest.createItem();

        KdtMultistoreOfflineGoodsSettingGetParams kdtMultistoreOfflineGoodsSettingGetParams = new KdtMultistoreOfflineGoodsSettingGetParams();
        KdtMultistoreOfflineGoodsSettingGet kdtMultistoreOfflineGoodsSettingGet = new KdtMultistoreOfflineGoodsSettingGet(kdtMultistoreOfflineGoodsSettingGetParams);
        kdtMultistoreOfflineGoodsSettingGetParams.setNumIid(kdtItemAddResult.getItem().getNumIid());
        kdtMultistoreOfflineGoodsSettingGetParams.setShopId(1000L);

        KdtMultistoreOfflineGoodsSettingGetResult kdtMultistoreOfflineGoodsSettingGetResult = client.invoke(kdtMultistoreOfflineGoodsSettingGet);

        KdtItemTest.deleteItem(kdtItemAddResult.getItem().getNumIid());
    }

}
