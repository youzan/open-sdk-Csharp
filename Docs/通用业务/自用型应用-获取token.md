## 获取token

### 获取token
请求方式：POST

Content-Type：application/x-www-form-urlencoded

请求URL：https://open.youzan.com/oauth/token

#### 请求参数：

| 名称            | 类型     | 是否必须 | 示例值                | 描述                             |
| ------------- | ------ | ---- | ------------------ | ------------------------------ |
| client_id     | String | 是    | Test client        | 有赞云颁发给开发者的应用ID                 |
| client_secret | String | 是    | Testclientsecret   | 有赞云颁发给开发者的应用secret             |
| grant_type    | String | 是    | silent | 授与方式（固定为 “silent”） |
| kdt_id        | Number | 是    | 123456             | 授权给该应用的店铺id           |

CURL请求示例
```curl
curl -X POST http://open.youzan.com/oauth/token -H 'content-type: application/x-www-form-urlencoded' -d 'client_id=testclient&client_secret=testclientsecret&grant_type=silent&kdt_id=88888'
```

#### 返回值：

| 名称            | 类型     | 是否必须 | 描述                                       |
| ------------- | ------ | ---- | ---------------------------------------- |
| access_token  | String | 是    | 可用于调用API的 access_token                   |
| expires_in    | Number | 是    | access_token 的有效时长，单位：秒（过期时间：7天）         |
| scope         | String | 否    | access_token 最终的访问范围                     |

*注意：token的有效期为7天，需要做定时任务定时来请求拿到新token用于接口调用