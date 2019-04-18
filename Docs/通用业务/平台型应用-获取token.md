## 获取token

### 初始化token
通过此接口获取的token调用[创建店铺接口]()，去创建一个新店铺。

请求方式：POST

Content-Type：application/x-www-form-urlencoded

请求URL：https://open.youzan.com/oauth/token

#### 请求参数：

| 名称            | 类型     | 是否必须 | 示例值                | 描述                             |
| ------------- | ------ | ---- | ------------------ | ------------------------------ |
| client_id     | String | 是    | Test client        | 有赞云颁发给开发者的应用ID                 |
| client_secret | String | 是    | Testclientsecret   | 有赞云颁发给开发者的应用secret             |
| grant_type    | String | 是    | authorize_platform | 授与方式（固定为 “authorize_platform”） |

CURL请求示例
```curl
curl -X POST https://open.youzan.com/oauth/token -H 'content-type: application/x-www-form-urlencoded' -d 'client_id=testclient&client_secret=testsecret&grant_type=authorize_platform'
```

#### 返回值：

| 名称            | 类型     | 是否必须 | 描述                                       |
| ------------- | ------ | ---- | ---------------------------------------- |
| access_token  | String | 是    | 可用于调用API的 access_token                   |
| expires_in    | Number | 是    | access_token 的有效时长，单位：秒（过期时间：7天）         |
| token_type    | String | 否    | 令牌类型                                     |
| scope         | String | 否    | access_token 最终的访问范围                     |

### 店铺token
通过此接口获取的token可调用具体店铺数据的接口，店铺id为创建店铺成功后返回的kdt_id。

请求方式：POST

Content-Type：application/x-www-form-urlencoded

请求URL：https://open.youzan.com/oauth/token

#### 请求参数：

| 名称            | 类型     | 是否必须 | 示例值                | 描述                             |
| ------------- | ------ | ---- | ------------------ | ------------------------------ |
| client_id     | String | 是    | Test client        | 有赞云颁发给开发者的应用ID                 |
| client_secret | String | 是    | Testclientsecret   | 有赞云颁发给开发者的应用secret             |
| grant_type    | String | 是    | authorize_platform | 授与方式（固定为 “authorize_platform”） |
| kdt_id        | Number | 是    | 123456             | 调用创建店铺接口成功后获得的kdt_id           |

CURL请求示例
```curl
curl -X POST https://open.youzan.com/oauth/token -H 'content-type: application/x-www-form-urlencoded' -d 'client_id=testclient&client_secret=testsecret&grant_type=authorize_platform&kdt_id=88888'
```

#### 返回值：

| 名称            | 类型     | 是否必须 | 描述                                       |
| ------------- | ------ | ---- | ---------------------------------------- |
| access_token  | String | 是    | 可用于调用API的 access_token                   |
| expires_in    | Number | 是    | access_token 的有效时长，单位：秒（过期时间：7天）         |
| scope         | String | 否    | access_token 最终的访问范围                     |
| refresh_token | String | 否    | 用于刷新令牌 access_token 的 refresh_token（过期时间：28 天） |