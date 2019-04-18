package com.youzan.open.gen.core.converter;

import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author ph0ly
 * @time 2016-12-01
 */
@Component
public class JavaTypeConverter implements TypeConverter {

    private Map<String, String> convertMap = Maps.newConcurrentMap();

    public JavaTypeConverter() {
        convertMap.put("Number", "Long");
        convertMap.put("Price", "Float");
        convertMap.put("Array", "Object");
        convertMap.put("byte[]", "ByteWrapper[]");
        // trick type
        convertMap.put("Sring", "String");
        convertMap.put("Trade", "TradeDetail");
        convertMap.put("Trade[]", "TradeDetail[]");
        convertMap.put("ItemCategory", "GoodsCategory");
        convertMap.put("ItemCategory[]", "GoodsCategory[]");
    }

    @Override
    public String convert(String type) {
        String val = convertMap.get(type);
        if (val == null) {
            return type;
        }
        return val;
    }
}
