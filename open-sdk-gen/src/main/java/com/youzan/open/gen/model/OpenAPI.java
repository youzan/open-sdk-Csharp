package com.youzan.open.gen.model;

import java.util.List;

/**
 * @author ph0ly
 * @time 2016-11-30
 */
public class OpenAPI {

    private Long id;
    private String name;
    private String method;
    private String version;

    List<OpenAPIParam> params;
    List<OpenAPIResult> results;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<OpenAPIParam> getParams() {
        return params;
    }

    public void setParams(List<OpenAPIParam> params) {
        this.params = params;
    }

    public List<OpenAPIResult> getResults() {
        return results;
    }

    public void setResults(List<OpenAPIResult> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "OpenAPI{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", params=" + params +
                ", results=" + results +
                '}';
    }
}
