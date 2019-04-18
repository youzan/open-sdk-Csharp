## Oauth2.0 授权

### 获取授权码（Authorization Code）

#### url参数：

| 名称            | 类型     | 是否必须 | 示例值                           | 描述                                       |
| ------------- | ------ | ---- | ----------------------------- | ---------------------------------------- |
| client_id        | String | 是    | testclient                       | 有赞云颁发给开发者的应用ID                           |
| response_type | String | 是    | code                          | 返回的令牌类型（固定为 “code”）                      |
| state         | String | 是    | teststate                     | 用于保持请求和回调的状态，在回调时，会回传该参数。开发者可以用这个参数验证请求有效性，也可以记录用户请求授权页前的位置。可防止CSRF攻击 |
| redirect_uri  | String | 否    | http://youzanyun.com/callback | 开发者自身的回调地址                               |
| scope         | String | 否    | testcope                      | 授权权限，以空格分隔的权限列表，若不传递此参数，代表请求用户的默认权限。     |

开发者需参数拼装在 https://open.youzan.com/oauth/authorize 之后即为授权url，发送给需要授权的商家，由商家访问授权。

示例：假设client_id=testclient，回调地址为http://youzanyun.com/callback

```json
https://open.youzan.com/oauth/authorize?client_id=testclient&response_type=code&state=teststate&redirect_uri=http://youzanyun.com/callback
```

商家访问授权url即可对应用进行授权操作。

#### 返回值：

| 名称   | 类型     | 是否必须 | 描述                                       |
| ---- | ------ | ---- | ---------------------------------------- |
| code | String | 是    | code 参数可以在 redirect_uri 对应的应用后端程序中获取（过期时间：10 分钟） |

- 返回以浏览器重定向方式响应，code 参数可以在 redirect_uri 对应的应用后端程序中获取。

### 获取 access_token

请求方式：POST

Content-Type：application/x-www-form-urlencoded

请求地址：https://open.youzan.com/oauth/token

#### 请求参数：

| 名称           | 类型     | 是否必须 | 示例值                                      | 描述                                       |
| ------------ | ------ | ---- | ---------------------------------------- | ---------------------------------------- |
| client_id       | String | 必须   | testclient                                  | 有赞云颁发给开发者的应用ID                           |
| client_secret   | String | 必须   | testclientsecret                            | 有赞云颁发给开发者的应用Secret                       |
| grant_type   | String | 必须   | authorization_code                       | 授与方式（固定为 “authorization_code”）           |
| code         | String | 必须   | fea70e7bd05d45692d70eaddf0cc43af939b3402 | 商家授权后有赞云返回的授权码（Authorization Code）       |
| redirect_uri | String | 必须   | http://youzanyun.com/callback            | 授权回调地址（该值必须与获取 Authorization Code 时传递的 redirect_uri 保持一致） |

CURL请求示例
```curl
curl -X POST https://open.youzan.com/oauth/token -H 'content-type: application/x-www-form-urlencoded' -d 'client_id=testclient&client_secret=testclientsecret&grant_type=authorization_code&code=fea70e7bd05d45692d70eaddf0cc43af939b3402&redirect_uri=http://youzanyun.com/callback'
```

#### 返回值：

| 名称            | 类型     | 是否必须 | 描述                                       |
| ------------- | ------ | ---- | ---------------------------------------- |
| access_token  | String | 是    | 可用于调用API的 access_token                   |
| expires_in    | Number | 是    | access_token 的有效时长，单位：秒（过期时间：7天）         |
| token_type    | String | 否    | 令牌类型                                     |
| scope         | String | 否    | access_token 最终的访问范围                     |
| refresh_token | String | 否    | 用于刷新令牌 access_token 的 refresh_token（过期时间：28 天） |

### 刷新令牌 (Refresh Token)

请求方式：POST

Content-Type：application/x-www-form-urlencoded

请求地址：https://open.youzan.com/oauth/token

#### 请求参数：

| 名称            | 类型     | 是否必须 | 示例值                                      | 描述                                       |
| ------------- | ------ | :--- | ---------------------------------------- | ---------------------------------------- |
| grant_type    | String | 是    | refresh_token                            | 授与方式（固定为 “refresh_token”）                |
| refresh_token | String | 是    | 013c6f454917531c00c99539a01601cf94db8dc2 | 用于刷新令牌 access_token 的 refresh_token（过期时间：28 天） |
| client_id        | String | 是    | testclient                                  | 有赞云颁发给开发者的应用ID                           |
| client_secret    | String | 是    | testclientsecret                            | 有赞云颁发给开发者的应用Secret                       |
| scope         | String | 否    | testcope                                 | 授权权限。以空格分隔的权限列表，若不传递此参数，代表请求用户的默认权限      |

CURL请求示例
```curl
curl -X POST https://open.youzan.com/oauth/token -H 'content-type: application/x-www-form-urlencoded' -d 'client_id=testclient&client_secret=testclientsecret&grant_type=refresh_token&refresh_token=013c6f454917531c00c99539a01601cf94db8dc2'
```

#### 返回值：

| 名称            | 类型     | 是否必须 | 描述                                       |
| ------------- | ------ | ---- | ---------------------------------------- |
| access_token  | String | 是    | 可用于调用API的 access_token                   |
| expires_in    | Number | 是    | access_token 的有效时长，单位：秒（过期时间：7天）         |
| token_type    | String | 否    | 令牌类型                                     |
| scope         | String | 否    | access_token 最终的访问范围                     |
| refresh_token | String | 否    | 用于刷新令牌 access_token 的 refresh_token（过期时间：28 天） |