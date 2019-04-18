package com.youzan.open.sdk.client.auth;

import com.youzan.open.sdk.model.AuthType;
import org.apache.commons.lang3.StringUtils;

/**
 * @author ph0ly
 * @time 2016-11-28
 */
public class Token implements Auth {

    private String accessToken;

    public Token(String accessToken) {
        if (StringUtils.isBlank(accessToken)) {
            throw new IllegalArgumentException("Access token can't be null");
        }

        this.accessToken = accessToken;
    }

    public AuthType getType() {
        return AuthType.TOKEN;
    }

    public String getAccessToken() {
        return accessToken;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Token token = (Token) o;

        return accessToken != null ? accessToken.equals(token.accessToken) : token.accessToken == null;
    }

    @Override
    public int hashCode() {
        return accessToken != null ? accessToken.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Token{" +
                "accessToken='" + accessToken + '\'' +
                '}';
    }
}
