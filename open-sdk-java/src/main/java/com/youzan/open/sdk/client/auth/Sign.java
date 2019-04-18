package com.youzan.open.sdk.client.auth;

import com.youzan.open.sdk.model.AuthType;
import org.apache.commons.lang3.StringUtils;

/**
 * @author ph0ly
 * @time 2016-11-28
 */
public class Sign implements Auth {

    private String appId;
    private String appSecret;

    public Sign(String appId, String appSecret) {
        if (StringUtils.isBlank(appId)) {
            throw new IllegalArgumentException("App id can't be empty");
        }
        if (StringUtils.isBlank(appSecret)) {
            throw new IllegalArgumentException("App secret can't be empty");
        }

        this.appId = appId;
        this.appSecret = appSecret;
    }

    public String getAppId() {
        return appId;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public AuthType getType() {
        return AuthType.SIGN;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sign sign = (Sign) o;

        if (appId != null ? !appId.equals(sign.appId) : sign.appId != null) return false;
        return appSecret != null ? appSecret.equals(sign.appSecret) : sign.appSecret == null;
    }

    @Override
    public int hashCode() {
        int result = appId != null ? appId.hashCode() : 0;
        result = 31 * result + (appSecret != null ? appSecret.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Sign{" +
                "appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                '}';
    }
}
