package com.youzan.open.gen.util.http;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.youzan.open.gen.util.json.JsonUtils;
import org.apache.commons.codec.Charsets;
import org.apache.http.Header;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.*;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.util.List;

/**
 * @author ph0ly
 * @time 2016-06-23
 */
public class DefaultHttpClient implements HttpClient {

    private Integer maxRouteCount = 10;

    private Integer maxConnectionCount = 1000;

    private Integer socketTimeout = 5000;

    private Integer connectionTimeout = 2000;

    private CloseableHttpClient client = null;

    public DefaultHttpClient() {
        init();
    }

    public void init() {
        PoolingHttpClientConnectionManager poolingHttpClientConnectionManager = new PoolingHttpClientConnectionManager();
        this.client = HttpClients.custom().
                setMaxConnPerRoute(maxRouteCount).
                setMaxConnTotal(maxConnectionCount).
                setConnectionManager(poolingHttpClientConnectionManager).
                setDefaultRequestConfig(RequestConfig.custom().setConnectTimeout(connectionTimeout).setSocketTimeout(socketTimeout).build())
                .build();

    }

    public String get(String uri) {
        Preconditions.checkArgument(uri != null, "Uri cannot be null");
        HttpGet httpGet = new HttpGet(uri);
        try {
            CloseableHttpResponse response = this.client.execute(httpGet);
            return EntityUtils.toString(response.getEntity());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String get(String uri, Params params) {
        Preconditions.checkArgument(uri != null, "Uri cannot be null");
        Preconditions.checkArgument(params != null, "Params cannot be null");

        HttpGet httpGet = getGet(uri, params);

        try {
            CloseableHttpResponse response = this.client.execute(httpGet);
            return EntityUtils.toString(response.getEntity());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String post(String uri, Params params) {
        Preconditions.checkArgument(uri != null, "Uri cannot be null");
        Preconditions.checkArgument(params != null, "Params cannot be null");

        HttpPost httpPost = getPost(uri, params);

        try {
            CloseableHttpResponse response = this.client.execute(httpPost);
            return EntityUtils.toString(response.getEntity());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String put(String uri, Params params) {
        Preconditions.checkArgument(uri != null, "Uri cannot be null");
        Preconditions.checkArgument(params != null, "Params cannot be null");

        HttpPut httpPut = getPut(uri, params);

        try {
            CloseableHttpResponse response = this.client.execute(httpPut);
            return EntityUtils.toString(response.getEntity());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String delete(String uri) {
        Preconditions.checkArgument(uri != null, "Uri cannot be null");
        HttpDelete httpDelete = new HttpDelete(uri);

        try {
            CloseableHttpResponse response = this.client.execute(httpDelete);
            return EntityUtils.toString(response.getEntity());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String delete(String uri, Params params) {
        Preconditions.checkArgument(uri != null, "Uri cannot be null");
        Preconditions.checkArgument(params != null, "Params cannot be null");

        HttpDelete httpDelete = getDelete(uri, params);

        try {
            CloseableHttpResponse response = this.client.execute(httpDelete);
            return EntityUtils.toString(response.getEntity());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public <T> T get(String uri, Params params, TypeReference<T> ref) {
        String resp = this.get(uri, params);
        return JsonUtils.toBean(resp, ref);
    }

    public <T> T get(String uri, TypeReference<T> ref) {
        String resp = this.get(uri);
        return JsonUtils.toBean(resp, ref);
    }

    public <T> T post(String uri, Params params, TypeReference<T> ref) {
        String resp = this.post(uri, params);
        return JsonUtils.toBean(resp, ref);
    }

    public <T> T put(String uri, Params params, TypeReference<T> ref) {
        String resp = this.put(uri, params);
        return JsonUtils.toBean(resp, ref);
    }

    public <T> T delete(String uri, Params params, TypeReference<T> ref) {
        String resp = this.delete(uri, params);
        return JsonUtils.toBean(resp, ref);
    }

    public <T> T delete(String uri, TypeReference<T> ref) {
        String resp = this.delete(uri);
        return JsonUtils.toBean(resp, ref);
    }

    private HttpGet getGet(String uri, Params params) {
        HttpGet httpGet = new HttpGet(uri);
        for (Header header : params.getHeaders()) {
            httpGet.setHeader(header);
        }
        String query = URI.create(uri).getQuery();
        List<NameValuePair> pairs = Lists.newArrayList();
        if (query != null) {
            pairs = URLEncodedUtils.parse(query, Charsets.UTF_8);
        }

        if (pairs.size() == 0) {
            uri += "?";
        } else {
            uri += "&";
        }
        String data = params.toString();
        if (data.length() > 0) {
            uri += data;
        }
        httpGet.setURI(URI.create(uri));
        return httpGet;
    }

    private HttpPost getPost(String uri, Params params) {
        HttpPost httpPost = new HttpPost(uri);
        for (Header header : params.getHeaders()) {
            httpPost.setHeader(header);
        }
        if (params.getContentType() == null || (
                params.getContentType() != null && params.getContentType().equals(ContentType.DEFAULT_TEXT)
                )) {
            params.setContentType(ContentType.APPLICATION_FORM_URLENCODED);
        }
        httpPost.setEntity(params.toEntity());

        return httpPost;
    }

    private HttpPut getPut(String uri, Params params) {
        HttpPut httpPut = new HttpPut(uri);
        for (Header header : params.getHeaders()) {
            httpPut.setHeader(header);
        }
        if (params.getContentType() == null || (
                params.getContentType() != null && params.getContentType().equals(ContentType.DEFAULT_TEXT)
        )) {
            params.setContentType(ContentType.APPLICATION_FORM_URLENCODED);
        }
        httpPut.setEntity(params.toEntity());
        return httpPut;
    }

    private HttpDelete getDelete(String uri, Params params) {
        HttpDelete httpDelete = new HttpDelete(uri);
        for (Header header : params.getHeaders()) {
            httpDelete.setHeader(header);
        }
        String query = URI.create(uri).getQuery();
        List<NameValuePair> pairs = Lists.newArrayList();
        if (query != null) {
            pairs = URLEncodedUtils.parse(query, Charsets.UTF_8);
        }

        if (pairs.size() == 0) {
            uri += "?";
        } else {
            uri += "&";
        }
        String data = params.toString();
        if (data.length() > 0) {
            uri += data;
        }
        httpDelete.setURI(URI.create(uri));
        return httpDelete;
    }

    public void close() {
        try {
            this.client.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
