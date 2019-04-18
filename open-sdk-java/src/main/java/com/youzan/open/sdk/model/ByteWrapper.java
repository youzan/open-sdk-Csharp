package com.youzan.open.sdk.model;

import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.content.ByteArrayBody;
import org.apache.http.entity.mime.content.ContentBody;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.InputStreamBody;

import java.io.File;
import java.io.InputStream;

/**
 * @author ph0ly
 * @time 2016-11-29
 */
public class ByteWrapper {

    private String name;
    private ContentBody contentBody;

    public ByteWrapper(String filePath) {
        contentBody = new FileBody(new File(filePath));
    }

    public ByteWrapper(String filePath, ContentType contentType) {
        contentBody = new FileBody(new File(filePath), contentType);
    }

    public ByteWrapper(File file) {
        contentBody = new FileBody(file);
    }

    public ByteWrapper(File file, ContentType contentType) {
        contentBody = new FileBody(file, contentType);
    }

    public ByteWrapper(String name, byte[] data) {
        contentBody = new ByteArrayBody(data, name);
    }

    public ByteWrapper(String name, byte[] data, ContentType contentType) {
        contentBody = new ByteArrayBody(data, contentType, name);
    }

    public ByteWrapper(String name, InputStream stream) {
        contentBody = new InputStreamBody(stream, name);
    }

    public ByteWrapper(String name, InputStream stream, ContentType contentType) {
        contentBody = new InputStreamBody(stream, contentType, name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ContentBody getData() {
        return this.contentBody;
    }

}
