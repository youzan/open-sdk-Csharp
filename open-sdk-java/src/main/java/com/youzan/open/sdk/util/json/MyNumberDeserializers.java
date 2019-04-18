package com.youzan.open.sdk.util.json;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;

import java.io.IOException;

/**
 * @author ph0ly
 * @time 2016-12-06
 */
public class MyNumberDeserializers extends NumberDeserializers {

    public final static class BooleanDeserializer
            extends PrimitiveOrWrapperDeserializer<Boolean>
    {
        private static final long serialVersionUID = 1L;

        final static NumberDeserializers.BooleanDeserializer primitiveInstance = new NumberDeserializers.BooleanDeserializer(Boolean.class, Boolean.FALSE);
        final static NumberDeserializers.BooleanDeserializer wrapperInstance = new NumberDeserializers.BooleanDeserializer(Boolean.TYPE, null);

        public BooleanDeserializer(Class<Boolean> cls, Boolean nvl)
        {
            super(cls, nvl);
        }

        @Override
        public Boolean deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException
        {
            JsonToken t = jp.getCurrentToken();
            if (t == JsonToken.VALUE_TRUE) {
                return Boolean.TRUE;
            }
            if (t == JsonToken.VALUE_FALSE) {
                return Boolean.FALSE;
            }
            // [JACKSON-78]: should accept ints too, (0 == false, otherwise true)
            if (t == JsonToken.VALUE_NUMBER_INT) {
                // 11-Jan-2012, tatus: May be outside of int...
                if (jp.getNumberType() == JsonParser.NumberType.INT) {
                    return (jp.getIntValue() == 0) ? Boolean.FALSE : Boolean.TRUE;
                }
                return Boolean.valueOf(_parseBooleanFromNumber(jp, ctxt));
            }
            if (t == JsonToken.VALUE_NULL) {
                return (Boolean) getNullValue();
            }
            // And finally, let's allow Strings to be converted too
            if (t == JsonToken.VALUE_STRING) {
                String text = jp.getText().trim();
                // [#422]: Allow aliases
                if ("true".equals(text) || "True".equals(text)) {
                    return Boolean.TRUE;
                }
                if ("false".equals(text) || "False".equals(text)) {
                    return Boolean.FALSE;
                }
                if (text.length() == 0) {
                    return (Boolean) getEmptyValue();
                }
                if (_hasTextualNull(text)) {
                    return (Boolean) getNullValue();
                }
                // 增加字符串型转换
                // 如果数字仍然转换失败，则认为是真正的失败
                try {
                    Integer val = Integer.parseInt(text);
                    return val > 0;
                } catch (Exception e) {
                    throw ctxt.weirdStringException(text, _valueClass, "only \"true\" or \"false\" recognized");
                }
            }
            // Issue#381
            if (t == JsonToken.START_ARRAY && ctxt.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                jp.nextToken();
                final Boolean parsed = _parseBoolean(jp, ctxt);
                t = jp.nextToken();
                if (t != JsonToken.END_ARRAY) {
                    throw ctxt.wrongTokenException(jp, JsonToken.END_ARRAY,
                            "Attempted to unwrap single value array for single 'Boolean' value but there was more than a single value in the array");
                }
                return parsed;
            }
            // Otherwise, no can do:
            throw ctxt.mappingException(_valueClass, t);
        }

        // 1.6: since we can never have type info ("natural type"; String, Boolean, Integer, Double):
        // (is it an error to even call this version?)
        @Override
        public Boolean deserializeWithType(JsonParser jp, DeserializationContext ctxt,
                                           TypeDeserializer typeDeserializer)
                throws IOException, JsonProcessingException
        {
            return _parseBoolean(jp, ctxt);
        }
    }

}
