package com.youzan.open.sdk.util.json;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ph0ly
 * @time 2016-12-06
 */
public class MySimpleDateFormat extends SimpleDateFormat {

    public MySimpleDateFormat(String pattern) {
        super(pattern);
    }

    @Override
    public Date parse(String source) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            return sdf.parse(source);
        } catch (Exception e) {
            Long ts = Long.parseLong(source);
            return new Date(ts);
        }
    }

}
