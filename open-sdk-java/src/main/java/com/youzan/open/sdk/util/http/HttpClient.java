package com.youzan.open.sdk.util.http;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.youzan.open.sdk.util.json.JsonUtils;
import org.apache.commons.codec.Charsets;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.EntityBuilder;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.ContentBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;

import java.io.Closeable;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @author ph0ly
 * @time 2016-06-23
 */
public interface HttpClient extends Closeable {

    String get(String uri);

    String get(String uri, Params params);

    <T> T get(String uri, TypeReference<T> ref);

    <T> T get(String uri, Params params, TypeReference<T> ref);

    String post(String uri, Params params);

    <T> T post(String uri, Params params, TypeReference<T> ref);

    String put(String uri, Params params);

    <T> T put(String uri, Params params, TypeReference<T> ref);

    String delete(String uri);

    <T> T delete(String uri, TypeReference<T> ref);

    String delete(String uri, Params params);

    <T> T delete(String uri, Params params, TypeReference<T> ref);

    public static class Params {
        private List<Header> headers = Lists.newArrayList();
        private Map<String, Object> data;
        private Multimap<String, ContentBody> bodyMultimap;
        private ContentType contentType = ContentType.DEFAULT_TEXT;

        private Params() {}

        public static Builder custom() {
            return new Builder();
        }

        public static class Builder {
            private Map<String, Object> data = Maps.newHashMap();
            private Multimap<String, ContentBody> bodyMultimap = ArrayListMultimap.create();
            private List<Header> headers = Lists.newArrayList();
            private ContentType contentType;

            public Builder header(String k, String v) {
                headers.add(new BasicHeader(k, v));
                return this;
            }

            public Builder add(Map<String, Object> params) {
                data.putAll(params);
                return this;
            }

            public Builder add(String k, String v) {
                if (k == null || v == null) {
                    throw new IllegalArgumentException("The specified k or v cannot be null");
                }
                data.put(k, v);
                return this;
            }

            public Builder add(String k, ContentBody contentBody) {
                if (contentBody == null) {
                    throw new IllegalArgumentException("The specified content body cannot be null");
                }
                bodyMultimap.put(k, contentBody);
                return this;
            }

            public Builder setContentType(ContentType contentType) {
                this.contentType = contentType;
                return this;
            }

            public Params build() {
                Params params = new Params();
                params.headers = this.headers;
                params.contentType = contentType;
                params.data = data;
                params.bodyMultimap = bodyMultimap;
                return params;
            }
        }

        public List<Header> getHeaders() {
            return headers;
        }

        public void setHeaders(List<Header> headers) {
            this.headers = headers;
        }

        public ContentType getContentType() {
            return contentType;
        }

        public void setContentType(ContentType contentType) {
            this.contentType = contentType;
        }

        public String toString() {
            if (contentType == ContentType.APPLICATION_JSON) {
                return JsonUtils.toJson(data);
            }

            List<NameValuePair> tmp = Lists.newArrayList();
            for (Map.Entry<String, Object> entry : data.entrySet()) {
                tmp.add(new BasicNameValuePair(entry.getKey(), entry.getValue().toString()));
            }
            return URLEncodedUtils.format(tmp, Charsets.UTF_8);
        }

        public HttpEntity toEntity() {
            if (contentType.equals(ContentType.MULTIPART_FORM_DATA)) {
                MultipartEntityBuilder builder = MultipartEntityBuilder.create();
                for (String key : data.keySet()) {
                    Object value = data.get(key);
                    try {
                        builder.addPart(key, new StringBody(value.toString(), ContentType.APPLICATION_FORM_URLENCODED.getMimeType(), Charset.forName("utf-8")));
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
                Map<String, Collection<ContentBody>> items = bodyMultimap.asMap();
                for (String key : items.keySet()) {
                    Collection<ContentBody> value = items.get(key);
                    for (ContentBody contentBody : value) {
                        builder.addPart(key, contentBody);
                    }
                }
                return builder.build();
            }

            return EntityBuilder.create().setContentType(contentType).setContentEncoding("utf-8").setText(toString()).build();
        }

    }

}
