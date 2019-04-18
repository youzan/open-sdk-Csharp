package com.youzan.open.sdk;

import com.google.common.collect.Lists;
import com.youzan.open.sdk.gen.v1_0_0.api.*;
import com.youzan.open.sdk.gen.v1_0_0.model.*;
import com.youzan.open.sdk.model.ByteWrapper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import static org.junit.Assert.*;

/**
 * @author ph0ly
 * @time 2016-12-06
 */
public class KdtItemTest extends BaseTest {

    private KdtItemAddResult kdtItemAddResult = null;

    @Before
    public void before() {
        kdtItemAddResult = createItem();
    }

    @After
    public void destroy() {
        deleteItem(kdtItemAddResult.getItem().getNumIid());
    }

    @Test
    public void testKdtItemsOnSaleGet() {

        KdtItemsOnsaleGet kdtItemsOnSaleGet = new KdtItemsOnsaleGet();
        kdtItemsOnSaleGet.setAPIParams(new KdtItemsOnsaleGetParams());

        KdtItemsOnsaleGetResult kdtItemsOnSaleGetResult = client.invoke(kdtItemsOnSaleGet);

        for (KdtItemsOnsaleGetResult.GoodsDetail goodsDetail : kdtItemsOnSaleGetResult.getItems()) {
            System.out.println(goodsDetail.getTitle());
        }

        assertTrue(kdtItemsOnSaleGetResult.getItems().length > 0);
    }

    @Test
    public void testKdtItemAdd() {
        KdtItemAddParams kdtItemAddParams = new KdtItemAddParams();
        kdtItemAddParams.setTitle("单测商品-增加");
        kdtItemAddParams.setDesc("<table border=\"0\" width=\"750px\" style=\"text-align:center;\" class=\"ke-zeroborder\">\t<tbody>\t\t<tr>\t\t\t<td>\t\t\t\t<img width=\"750\" height=\"490\" src=\"http://img.st.iblimg.com/photo-1/1000/2016/11/1460142577.jpg\"> \t\t\t</td>\t\t</tr>\t</tbody></table><table border=\"0\" width=\"750px\" style=\"text-align:center;\" class=\"ke-zeroborder\">\t<tbody>\t\t<tr>\t\t\t<td>\t\t\t\t<img width=\"750\" height=\"60\" src=\"http://img.st.iblimg.com/photo-1/1000/2016/11/1967632009.jpg\"> \t\t\t</td>\t\t\t<td>\t\t\t\t<img width=\"750\" height=\"60\" src=\"http://img.st.iblimg.com/photo-1/1000/2016/11/1460142577.jpg\"> \t\t\t</td>\t\t\t<td>\t\t\t\t<img width=\"750\" height=\"60\" src=\"http://img.st.iblimg.com/photo-1/1000/2016/11/820642106.jpg\"> \t\t\t</td>                        <td>\t\t\t\t<img width=\"750\" height=\"60\" src=\"http://img.st.iblimg.com/photo-1/1000/2016/11/870526283.jpg\"> \t\t\t</td>                       <td>\t\t\t\t<img width=\"750\" height=\"60\" src=\"http://img.st.iblimg.com/photo-1/1000/2016/11/703655858.jpg\"> \t\t\t</td>                       <td>\t\t\t\t<img width=\"750\" height=\"60\" src=\"http://img.st.iblimg.com/photo-1/1000/2016/11/1850046577.jpg\"> \t\t\t</td>                        <td>\t\t\t\t<img width=\"750\" height=\"60\" src=\"http://img.st.iblimg.com/photo-1/1000/2016/11/264065081.jpg\"> \t\t\t</td>                       <td>\t\t\t\t<img width=\"750\" height=\"60\" src=\"http://img.st.iblimg.com/photo-1/1000/2016/11/1627450393.jpg\"> \t\t\t</td>                       <td>\t\t\t\t<img width=\"750\" height=\"60\" src=\"http://img.st.iblimg.com/photo-1/1000/2016/11/1862483376.jpg\"> \t\t\t</td>                       <td>\t\t\t\t<img width=\"750\" height=\"60\" src=\"http://img.st.iblimg.com/photo-1/1000/2016/11/916595689.jpg\"> \t\t\t</td>\t\t</tr>\t</tbody></table><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"750\" style=\"font-family:Microsoft Yahei;font-size:16px;\" class=\"ke-zeroborder\">\t<tbody>\t\t<tr>\t\t\t<td width=\"350\">\t\t\t\t<div>\t\t\t\t\t<img height=\"350\" width=\"350\" src=\"http://img.st.iblimg.com/photo-1/1000/2016/11/1627450393.jpg\"> \t\t\t\t</div>\t\t\t</td>\t\t\t<td width=\"412\">\t\t\t\t<table width=\"100%\" style=\"font-family:Microsoft Yahei;\" class=\"table-a\">\t\t\t\t\t<tbody>\t\t\t\t\t\t<tr>\t\t\t\t\t\t\t<td width=\"23%\" style=\"text-align:left;vertical-align:top;font-family:Microsoft Yahei;font-size:14px;font-weight:bold;color:#000;\">\t\t\t\t\t\t\t\t<p>\t\t\t\t\t\t\t\t\t【产品名称】\t\t\t\t\t\t\t\t</p>\t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t<td width=\"77%\" style=\"text-align:left;font-family:Microsoft Yahei;font-size:14px;color:#000;vertical-align:top;\">EMSAL  杏仁油地板养护乳液250ml</td>\t\t\t\t\t\t</tr>\t\t\t\t\t\t<tr>\t\t\t\t\t\t\t<td style=\"text-align:left;vertical-align:top;font-family:Microsoft Yahei;font-size:14px;font-weight:bold;color:#000;\">\t\t\t\t\t\t\t\t<b>【产品品牌】</b> \t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t<td style=\"text-align:left;font-family:Microsoft Yahei;font-size:14px;color:#000;vertical-align:top;\">\t\t\t\t\t\t\t\t菲洛施</td>\t\t\t\t\t\t</tr>\t\t\t\t\t\t<tr>\t\t\t\t\t\t\t<td style=\"text-align:left;vertical-align:top;font-family:Microsoft Yahei;font-size:14px;font-weight:bold;color:#000;\">\t\t\t\t\t\t\t\t<b>【产品成分】<br></b> \t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t<td style=\"text-align:left;font-family:Microsoft Yahei;font-size:14px;color:#000;vertical-align:top;\">\t\t\t\t\t\t\t\t杏仁油，非离子表面活性剂，香料</td>\t\t\t\t\t\t</tr>\t\t\t\t\t\t<tr>\t\t\t\t\t\t\t<td style=\"text-align:left;vertical-align:top;font-family:Microsoft Yahei;font-size:14px;font-weight:bold;color:#000;\">\t\t\t\t\t\t\t\t<b>【净含量】<br></b> \t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t<td style=\"text-align:left;font-family:Microsoft Yahei;font-size:14px;color:#000;vertical-align:top;\">250ml</td>\t\t\t\t\t\t</tr>\t\t\t\t\t\t<tr>\t\t\t\t\t\t\t<td height=\"20\" style=\"text-align:left;vertical-align:top;font-family:Microsoft Yahei;font-size:14px;font-weight:bold;color:#000;\">\t\t\t\t\t\t\t\t<b>【保质期】<br></b> \t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t<td style=\"text-align:left;font-family:Microsoft Yahei;font-size:14px;color:#000;vertical-align:top;\">\t\t\t\t\t\t\t\t3年</td>\t\t\t\t\t\t</tr>\t\t\t\t\t\t<tr>\t\t\t\t\t\t\t<td style=\"text-align:left;vertical-align:top;font-family:Microsoft Yahei;font-size:14px;font-weight:bold;color:#000;\">\t\t\t\t\t\t\t\t<b>【产品产地】<br></b> \t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t<td style=\"text-align:left;font-family:Microsoft Yahei;font-size:14px;color:#000;vertical-align:top;\">德国</td>\t\t\t\t\t\t</tr>                        <tr>\t\t\t\t\t\t\t<td style=\"text-align:left;vertical-align:top;font-family:Microsoft Yahei;font-size:14px;font-weight:bold;color:#000;\">\t\t\t\t\t\t\t\t<b>【产品类型】<br></b> \t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t<td style=\"text-align:left;font-family:Microsoft Yahei;font-size:14px;color:#000;vertical-align:top;\">家庭清洁护理</td>\t\t\t\t\t\t</tr>\t\t\t\t\t</tbody>\t\t\t\t</table>\t\t\t</td>\t\t</tr>\t</tbody></table><table border=\"0\" width=\"750px\" style=\"text-align:center;\" class=\"ke-zeroborder\">\t<tbody>\t\t<tr>\t\t\t<td height=\"49\" style=\"font-size:16px;\">\t\t\t\t<strong>1.</strong>掩盖细小划痕，有效保护木制品。<br><strong>2.</strong>气味柔和，光泽明亮，适合各色木制品使用。</td>\t\t</tr>\t\t<tr>\t\t\t<td>\t\t\t\t<img width=\"750\" src=\"http://img.st.iblimg.com/photo-1/1000/2016/11/1850046577.jpg\"> \t\t\t</td>\t\t</tr><tr>\t\t\t<td>\t\t\t\t<img width=\"750\" src=\"http://img.st.iblimg.com/photo-1/1000/2016/11/1850046577.jpg\"> \t\t\t</td>\t  </tr>\t</tbody></table>");
        kdtItemAddParams.setPrice(1222f);
        kdtItemAddParams.setQuantity("123");
        kdtItemAddParams.setPostFee(0.022f);

        ByteWrapper[] byteWrappers = new ByteWrapper[2];

        ByteWrapper byteWrapper = new ByteWrapper("/Users/ph0ly/Desktop/icon.png");
        byteWrappers[0] = byteWrapper;
        byteWrapper = new ByteWrapper("/Users/ph0ly/Desktop/thumb_up_normal.png");
        byteWrappers[1] = byteWrapper;

        kdtItemAddParams.setImages(byteWrappers);

        KdtItemAdd kdtItemAdd = new KdtItemAdd();
        kdtItemAdd.setAPIParams(kdtItemAddParams);
        KdtItemAddResult result = client.invoke(kdtItemAdd);

        assertTrue(result.getItem().getTitle().equals(kdtItemAddParams.getTitle()));

        deleteItem(result.getItem().getNumIid());
    }

    @Test
    public void testKdtItemUpdate() {

        KdtItemUpdateParams kdtItemUpdateParams = new KdtItemUpdateParams();
        KdtItemUpdate kdtItemUpdate = new KdtItemUpdate();
        kdtItemUpdate.setAPIParams(kdtItemUpdateParams);

        // ===================================
        kdtItemUpdateParams.setTitle("单测商品-更新");
        kdtItemUpdateParams.setQuantity("54321");
        kdtItemUpdateParams.setNumIid(kdtItemAddResult.getItem().getNumIid());

        ByteWrapper[] byteWrappers = new ByteWrapper[3];
        byteWrappers[0] = new ByteWrapper("/Users/ph0ly/Documents/banner.png");
        byteWrappers[1] = new ByteWrapper("/Users/ph0ly/Downloads/QQ图片20160905155100.png");
        byteWrappers[2] = new ByteWrapper("/Users/ph0ly/Documents/banner.png");

        kdtItemUpdateParams.setImages(byteWrappers);

        KdtItemUpdateResult result = client.invoke(kdtItemUpdate);

        KdtItemGetResult kdtItemGetResult = getItem(kdtItemAddResult.getItem().getNumIid());

        assertEquals(kdtItemUpdateParams.getTitle(), kdtItemGetResult.getItem().getTitle());
        assertEquals(kdtItemUpdateParams.getNumIid(), kdtItemGetResult.getItem().getNumIid());

    }

    @Test
    public void testKdtItemGet() {

        KdtItemGet kdtItemGet = new KdtItemGet();
        KdtItemGetParams kdtItemGetParams = new KdtItemGetParams();
        kdtItemGet.setAPIParams(kdtItemGetParams);

        kdtItemGetParams.setNumIid(kdtItemAddResult.getItem().getNumIid());

        KdtItemGetResult result = client.invoke(kdtItemGet);
        System.out.println(result.getItem().getNumIid() + ", " + result.getItem().getTitle());
        System.out.println(result.getItem().getDesc());

        assertTrue(result != null);
    }

    @Test
    public void testKdtItemDelete() {
        KdtItemAddResult kdtItemAddResult = createItem();

        KdtItemDeleteParams kdtItemDeleteParams = new KdtItemDeleteParams();
        KdtItemDelete kdtItemDelete = new KdtItemDelete();
        kdtItemDelete.setAPIParams(kdtItemDeleteParams);

        kdtItemDeleteParams.setNumIid(kdtItemAddResult.getItem().getNumIid());

        KdtItemDeleteResult result = client.invoke(kdtItemDelete);

        assertTrue(result != null);
    }

    @Test
    public void testKdtItemUpdateDelisting() {
        Long id = kdtItemAddResult.getItem().getNumIid();
        KdtItemUpdateDelistingParams kdtItemUpdateDelistingParams = new KdtItemUpdateDelistingParams();
        KdtItemUpdateDelisting kdtItemUpdateDelisting = new KdtItemUpdateDelisting(kdtItemUpdateDelistingParams);
        kdtItemUpdateDelistingParams.setNumIid(id);
        kdtItemUpdateDelistingParams.setFields("title");
        KdtItemUpdateDelistingResult kdtItemUpdateDelistingResult = client.invoke(kdtItemUpdateDelisting);

        System.out.println(kdtItemUpdateDelistingResult.getItem().getTitle());
    }

    @Test
    public void testKdtItemUpdateListing() throws Exception {
        Long id = kdtItemAddResult.getItem().getNumIid();

        // 下线
        KdtItemUpdateDelistingParams kdtItemUpdateDelistingParams = new KdtItemUpdateDelistingParams();
        KdtItemUpdateDelisting kdtItemUpdateDelisting = new KdtItemUpdateDelisting(kdtItemUpdateDelistingParams);
        kdtItemUpdateDelistingParams.setNumIid(id);
        kdtItemUpdateDelistingParams.setFields("title");
        KdtItemUpdateDelistingResult kdtItemUpdateDelistingResult = client.invoke(kdtItemUpdateDelisting);

        System.out.println(kdtItemUpdateDelistingResult.getItem().getTitle());

        Thread.sleep(2000);

        // 上线
        KdtItemUpdateListingParams kdtItemUpdateListingParams = new KdtItemUpdateListingParams();
        KdtItemUpdateListing kdtItemUpdateListing = new KdtItemUpdateListing(kdtItemUpdateListingParams);
        kdtItemUpdateListingParams.setFields("title");
        kdtItemUpdateListingParams.setNumIid(id);

        KdtItemUpdateListingResult kdtItemUpdateListingResult = client.invoke(kdtItemUpdateListing);
        System.out.println(kdtItemUpdateListingResult.getItem().getTitle());

        Thread.sleep(2000);
    }

    @Test
    public void testKdtItemsUpdateListing() throws Exception {
        Long id = kdtItemAddResult.getItem().getNumIid();

        KdtItemsUpdateDelistingParams kdtItemsUpdateDelistingParams = new KdtItemsUpdateDelistingParams();
        kdtItemsUpdateDelistingParams.setNumIids(id.toString());
        KdtItemsUpdateDelisting kdtItemsUpdateDelisting = new KdtItemsUpdateDelisting(kdtItemsUpdateDelistingParams);
        KdtItemsUpdateDelistingResult kdtItemsUpdateDelistingResult = client.invoke(kdtItemsUpdateDelisting);

        KdtItemsUpdateListingParams kdtItemsUpdateListingParams = new KdtItemsUpdateListingParams();
        KdtItemsUpdateListing kdtItemsUpdateListing = new KdtItemsUpdateListing(kdtItemsUpdateListingParams);
        kdtItemsUpdateListingParams.setNumIids(id + ",");
        KdtItemsUpdateListingResult kdtItemsUpdateListingResult = client.invoke(kdtItemsUpdateListing);

        Thread.sleep(3000);
    }

    @Test
    public void testKdtItemsUpdateDelisting() throws Exception {

        Long id = kdtItemAddResult.getItem().getNumIid();

        KdtItemsUpdateDelistingParams kdtItemsUpdateDelistingParams = new KdtItemsUpdateDelistingParams();
        kdtItemsUpdateDelistingParams.setNumIids(id.toString());
        KdtItemsUpdateDelisting kdtItemsUpdateDelisting = new KdtItemsUpdateDelisting(kdtItemsUpdateDelistingParams);

        KdtItemsUpdateDelistingResult kdtItemsUpdateDelistingResult = client.invoke(kdtItemsUpdateDelisting);

        Thread.sleep(3000);

    }

    @Test
    public void testKdtSkusCustomGet() {
        Long id = kdtItemAddResult.getItem().getNumIid();

        KdtSkusCustomGetParams kdtSkusCustomGetParams = new KdtSkusCustomGetParams();
        KdtSkusCustomGet kdtSkusCustomGet = new KdtSkusCustomGet(kdtSkusCustomGetParams);
        kdtSkusCustomGetParams.setNumIid(id);
        kdtSkusCustomGetParams.setOuterId("1111");

        KdtSkusCustomGetResult kdtSkusCustomGetResult = client.invoke(kdtSkusCustomGet);
        for (KdtSkusCustomGetResult.GoodsSku goodsSku : kdtSkusCustomGetResult.getSkus()) {
            System.out.println(goodsSku.getOuterId() + " => " + goodsSku.getPropertiesName());
        }
    }

    @Test
    public void testKdtItemsInventoryGet() {
        Long id = kdtItemAddResult.getItem().getNumIid();

        // 下线商品，将商品放入仓库
        KdtItemUpdateDelistingParams kdtItemUpdateDelistingParams = new KdtItemUpdateDelistingParams();
        KdtItemUpdateDelisting kdtItemUpdateDelisting = new KdtItemUpdateDelisting(kdtItemUpdateDelistingParams);
        kdtItemUpdateDelistingParams.setNumIid(id);
        kdtItemUpdateDelistingParams.setFields("title");
        KdtItemUpdateDelistingResult kdtItemUpdateDelistingResult = client.invoke(kdtItemUpdateDelisting);

        //
        KdtItemsInventoryGetParams kdtItemsInventoryGetParams = new KdtItemsInventoryGetParams();
        KdtItemsInventoryGet kdtItemsInventoryGet = new KdtItemsInventoryGet(kdtItemsInventoryGetParams);
        KdtItemsInventoryGetResult kdtItemsInventoryGetResult = client.invoke(kdtItemsInventoryGet);
        for (KdtItemsInventoryGetResult.GoodsDetail goodsDetail : kdtItemsInventoryGetResult.getItems()) {
            System.out.println(goodsDetail.getTitle());
        }
    }

    @Test
    public void testKdtItemsCustomGet() {
        Long id = kdtItemAddResult.getItem().getNumIid();
        KdtItemsCustomGetParams kdtItemsCustomGetParams = new KdtItemsCustomGetParams();
        KdtItemsCustomGet kdtItemsCustomGet = new KdtItemsCustomGet(kdtItemsCustomGetParams);
        kdtItemsCustomGetParams.setOuterId(kdtItemAddResult.getItem().getOuterId());

        KdtItemsCustomGetResult kdtItemsCustomGetResult = client.invoke(kdtItemsCustomGet);
        for (KdtItemsCustomGetResult.GoodsDetail goodsDetail : kdtItemsCustomGetResult.getItems()) {
            System.out.println(goodsDetail.getTitle());
        }
    }

    @Test
    public void testKdtItemSkuUpdate() {
        Long id = kdtItemAddResult.getItem().getNumIid();
        KdtItemSkuUpdateParams kdtItemSkuUpdateParams = new KdtItemSkuUpdateParams();
        KdtItemSkuUpdate kdtItemSkuUpdate = new KdtItemSkuUpdate(kdtItemSkuUpdateParams);
        kdtItemSkuUpdateParams.setNumIid(id);
        kdtItemSkuUpdateParams.setOuterId("1111");
        kdtItemSkuUpdateParams.setPrice(150f);
        kdtItemSkuUpdateParams.setQuantity(10L);

        KdtItemAddResult.GoodsSku[] skus = kdtItemAddResult.getItem().getSkus();
        KdtItemAddResult.GoodsSku sku = null;
        for (KdtItemAddResult.GoodsSku goodsSku : skus) {
            if (goodsSku.getOuterId().equals(kdtItemSkuUpdateParams.getOuterId())) {
                sku = goodsSku;
                break;
            }
        }

        kdtItemSkuUpdateParams.setSkuId(sku.getSkuId());
        KdtItemSkuUpdateResult kdtItemSkuUpdateResult = client.invoke(kdtItemSkuUpdate);
        KdtItemSkuUpdateResult.GoodsSku goodsSku = kdtItemSkuUpdateResult.getSku();

        assertTrue(goodsSku.getPrice().equals(kdtItemSkuUpdateParams.getPrice()));
    }

    public static KdtItemAddResult createItem() {
        KdtItemAddParams kdtItemAddParams = new KdtItemAddParams();
        kdtItemAddParams.setTitle("单测商品-增加");
        kdtItemAddParams.setDesc("<table border=\"0\" width=\"750px\" style=\"text-align:center;\" class=\"ke-zeroborder\">\t<tbody>\t\t<tr>\t\t\t<td>\t\t\t\t<img width=\"750\" height=\"490\" src=\"http://img.st.iblimg.com/photo-1/1000/2016/11/1460142577.jpg\"> \t\t\t</td>\t\t</tr>\t</tbody></table><table border=\"0\" width=\"750px\" style=\"text-align:center;\" class=\"ke-zeroborder\">\t<tbody>\t\t<tr>\t\t\t<td>\t\t\t\t<img width=\"750\" height=\"60\" src=\"http://img.st.iblimg.com/photo-1/1000/2016/11/1967632009.jpg\"> \t\t\t</td>\t\t\t<td>\t\t\t\t<img width=\"750\" height=\"60\" src=\"http://img.st.iblimg.com/photo-1/1000/2016/11/1460142577.jpg\"> \t\t\t</td>\t\t\t<td>\t\t\t\t<img width=\"750\" height=\"60\" src=\"http://img.st.iblimg.com/photo-1/1000/2016/11/820642106.jpg\"> \t\t\t</td>                        <td>\t\t\t\t<img width=\"750\" height=\"60\" src=\"http://img.st.iblimg.com/photo-1/1000/2016/11/870526283.jpg\"> \t\t\t</td>                       <td>\t\t\t\t<img width=\"750\" height=\"60\" src=\"http://img.st.iblimg.com/photo-1/1000/2016/11/703655858.jpg\"> \t\t\t</td>                       <td>\t\t\t\t<img width=\"750\" height=\"60\" src=\"http://img.st.iblimg.com/photo-1/1000/2016/11/1850046577.jpg\"> \t\t\t</td>                        <td>\t\t\t\t<img width=\"750\" height=\"60\" src=\"http://img.st.iblimg.com/photo-1/1000/2016/11/264065081.jpg\"> \t\t\t</td>                       <td>\t\t\t\t<img width=\"750\" height=\"60\" src=\"http://img.st.iblimg.com/photo-1/1000/2016/11/1627450393.jpg\"> \t\t\t</td>                       <td>\t\t\t\t<img width=\"750\" height=\"60\" src=\"http://img.st.iblimg.com/photo-1/1000/2016/11/1862483376.jpg\"> \t\t\t</td>                       <td>\t\t\t\t<img width=\"750\" height=\"60\" src=\"http://img.st.iblimg.com/photo-1/1000/2016/11/916595689.jpg\"> \t\t\t</td>\t\t</tr>\t</tbody></table><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"750\" style=\"font-family:Microsoft Yahei;font-size:16px;\" class=\"ke-zeroborder\">\t<tbody>\t\t<tr>\t\t\t<td width=\"350\">\t\t\t\t<div>\t\t\t\t\t<img height=\"350\" width=\"350\" src=\"http://img.st.iblimg.com/photo-1/1000/2016/11/1627450393.jpg\"> \t\t\t\t</div>\t\t\t</td>\t\t\t<td width=\"412\">\t\t\t\t<table width=\"100%\" style=\"font-family:Microsoft Yahei;\" class=\"table-a\">\t\t\t\t\t<tbody>\t\t\t\t\t\t<tr>\t\t\t\t\t\t\t<td width=\"23%\" style=\"text-align:left;vertical-align:top;font-family:Microsoft Yahei;font-size:14px;font-weight:bold;color:#000;\">\t\t\t\t\t\t\t\t<p>\t\t\t\t\t\t\t\t\t【产品名称】\t\t\t\t\t\t\t\t</p>\t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t<td width=\"77%\" style=\"text-align:left;font-family:Microsoft Yahei;font-size:14px;color:#000;vertical-align:top;\">EMSAL  杏仁油地板养护乳液250ml</td>\t\t\t\t\t\t</tr>\t\t\t\t\t\t<tr>\t\t\t\t\t\t\t<td style=\"text-align:left;vertical-align:top;font-family:Microsoft Yahei;font-size:14px;font-weight:bold;color:#000;\">\t\t\t\t\t\t\t\t<b>【产品品牌】</b> \t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t<td style=\"text-align:left;font-family:Microsoft Yahei;font-size:14px;color:#000;vertical-align:top;\">\t\t\t\t\t\t\t\t菲洛施</td>\t\t\t\t\t\t</tr>\t\t\t\t\t\t<tr>\t\t\t\t\t\t\t<td style=\"text-align:left;vertical-align:top;font-family:Microsoft Yahei;font-size:14px;font-weight:bold;color:#000;\">\t\t\t\t\t\t\t\t<b>【产品成分】<br></b> \t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t<td style=\"text-align:left;font-family:Microsoft Yahei;font-size:14px;color:#000;vertical-align:top;\">\t\t\t\t\t\t\t\t杏仁油，非离子表面活性剂，香料</td>\t\t\t\t\t\t</tr>\t\t\t\t\t\t<tr>\t\t\t\t\t\t\t<td style=\"text-align:left;vertical-align:top;font-family:Microsoft Yahei;font-size:14px;font-weight:bold;color:#000;\">\t\t\t\t\t\t\t\t<b>【净含量】<br></b> \t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t<td style=\"text-align:left;font-family:Microsoft Yahei;font-size:14px;color:#000;vertical-align:top;\">250ml</td>\t\t\t\t\t\t</tr>\t\t\t\t\t\t<tr>\t\t\t\t\t\t\t<td height=\"20\" style=\"text-align:left;vertical-align:top;font-family:Microsoft Yahei;font-size:14px;font-weight:bold;color:#000;\">\t\t\t\t\t\t\t\t<b>【保质期】<br></b> \t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t<td style=\"text-align:left;font-family:Microsoft Yahei;font-size:14px;color:#000;vertical-align:top;\">\t\t\t\t\t\t\t\t3年</td>\t\t\t\t\t\t</tr>\t\t\t\t\t\t<tr>\t\t\t\t\t\t\t<td style=\"text-align:left;vertical-align:top;font-family:Microsoft Yahei;font-size:14px;font-weight:bold;color:#000;\">\t\t\t\t\t\t\t\t<b>【产品产地】<br></b> \t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t<td style=\"text-align:left;font-family:Microsoft Yahei;font-size:14px;color:#000;vertical-align:top;\">德国</td>\t\t\t\t\t\t</tr>                        <tr>\t\t\t\t\t\t\t<td style=\"text-align:left;vertical-align:top;font-family:Microsoft Yahei;font-size:14px;font-weight:bold;color:#000;\">\t\t\t\t\t\t\t\t<b>【产品类型】<br></b> \t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t<td style=\"text-align:left;font-family:Microsoft Yahei;font-size:14px;color:#000;vertical-align:top;\">家庭清洁护理</td>\t\t\t\t\t\t</tr>\t\t\t\t\t</tbody>\t\t\t\t</table>\t\t\t</td>\t\t</tr>\t</tbody></table><table border=\"0\" width=\"750px\" style=\"text-align:center;\" class=\"ke-zeroborder\">\t<tbody>\t\t<tr>\t\t\t<td height=\"49\" style=\"font-size:16px;\">\t\t\t\t<strong>1.</strong>掩盖细小划痕，有效保护木制品。<br><strong>2.</strong>气味柔和，光泽明亮，适合各色木制品使用。</td>\t\t</tr>\t\t<tr>\t\t\t<td>\t\t\t\t<img width=\"750\" src=\"http://img.st.iblimg.com/photo-1/1000/2016/11/1850046577.jpg\"> \t\t\t</td>\t\t</tr><tr>\t\t\t<td>\t\t\t\t<img width=\"750\" src=\"http://img.st.iblimg.com/photo-1/1000/2016/11/1850046577.jpg\"> \t\t\t</td>\t  </tr>\t</tbody></table>");
        kdtItemAddParams.setPrice(132f);
        kdtItemAddParams.setQuantity("123");
        kdtItemAddParams.setPostFee(0.022f);
        kdtItemAddParams.setOuterId("nb");
        kdtItemAddParams.setSkuQuantities("2,3");
        kdtItemAddParams.setSkuProperties("颜色:黄色;尺寸:M;重量:1KG,颜色:黄色;尺寸:S;重量:1KG");
        kdtItemAddParams.setSkuPrices("130.00,1111.00");
        kdtItemAddParams.setSkuOuterIds("1111,2222");

        ByteWrapper[] byteWrappers = new ByteWrapper[2];

        ByteWrapper byteWrapper = new ByteWrapper("/Users/ph0ly/Desktop/icon.png");
        byteWrappers[0] = byteWrapper;
        byteWrapper = new ByteWrapper("/Users/ph0ly/Desktop/thumb_up_normal.png");
        byteWrappers[1] = byteWrapper;

        kdtItemAddParams.setImages(byteWrappers);

        KdtItemAdd kdtItemAdd = new KdtItemAdd();
        kdtItemAdd.setAPIParams(kdtItemAddParams);
        KdtItemAddResult result = client.invoke(kdtItemAdd);

        assertTrue(result.getItem().getTitle().equals(kdtItemAddParams.getTitle()));

        return result;
    }

    public static KdtItemGetResult getItem(Long id) {
        KdtItemGet kdtItemGet = new KdtItemGet();
        KdtItemGetParams kdtItemGetParams = new KdtItemGetParams();
        kdtItemGet.setAPIParams(kdtItemGetParams);

        kdtItemGetParams.setNumIid(id);

        return client.invoke(kdtItemGet);
    }

    public static void deleteItem(Long id) {
        KdtItemDeleteParams kdtItemDeleteParams = new KdtItemDeleteParams();
        KdtItemDelete kdtItemDelete = new KdtItemDelete();
        kdtItemDelete.setAPIParams(kdtItemDeleteParams);

        kdtItemDeleteParams.setNumIid(id);

        KdtItemDeleteResult result = client.invoke(kdtItemDelete);

        try {
            KdtItemGetResult getResult = getItem(id);
        } catch (com.youzan.open.sdk.exception.KDTException e) {

        }

    }

}
