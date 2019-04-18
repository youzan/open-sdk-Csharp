package com.youzan.open.sdk;

import com.youzan.open.sdk.gen.v1_0_0.api.KdtLogisticsOnlineConfirm;
import com.youzan.open.sdk.gen.v1_0_0.api.KdtLogisticsOnlineMarksign;
import com.youzan.open.sdk.gen.v1_0_0.api.KdtLogisticsTraceSearch;
import com.youzan.open.sdk.gen.v1_0_0.model.*;
import org.junit.Test;

/**
 * @author ph0ly
 * @time 2016-12-07
 */
public class KdtLogisticsTest extends BaseTest {

    @Test
    public void testKdtLogisticsOnlineConfirm() {
        KdtLogisticsOnlineConfirmParams kdtLogisticsOnlineConfirmParams = new KdtLogisticsOnlineConfirmParams();
        KdtLogisticsOnlineConfirm kdtLogisticsOnlineConfirm = new KdtLogisticsOnlineConfirm(kdtLogisticsOnlineConfirmParams);
        //kdtLogisticsOnlineConfirmParams.set
    }

    @Test
    public void testKdtLogisticsTraceSearch() {
        KdtLogisticsTraceSearchParams kdtLogisticsTraceSearchParams = new KdtLogisticsTraceSearchParams();
        KdtLogisticsTraceSearch kdtLogisticsTraceSearch = new KdtLogisticsTraceSearch(kdtLogisticsTraceSearchParams);
        kdtLogisticsTraceSearchParams.setTid("12345");

        KdtLogisticsTraceSearchResult kdtLogisticsTraceSearchResult = client.invoke(kdtLogisticsTraceSearch);
        System.out.println(kdtLogisticsTraceSearchResult.getTid());
    }

    @Test
    public void testKdtLogisticsOnlineMarkSign() {
        KdtLogisticsOnlineMarksignParams kdtLogisticsOnlineMarksignParams = new KdtLogisticsOnlineMarksignParams();
        KdtLogisticsOnlineMarksign kdtLogisticsOnlineMarksign = new KdtLogisticsOnlineMarksign(kdtLogisticsOnlineMarksignParams);
        kdtLogisticsOnlineMarksignParams.setTid("E123456");
        KdtLogisticsOnlineMarksignResult kdtLogisticsOnlineMarksignResult = client.invoke(kdtLogisticsOnlineMarksign);
        System.out.println(kdtLogisticsOnlineMarksignResult.getIsSuccess());
    }

}
