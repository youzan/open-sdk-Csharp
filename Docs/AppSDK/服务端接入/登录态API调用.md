## 登录态API调用

### 总物理架构
![](https://img.yzcdn.cn/public_files/2017/03/16/42b3b5c8472f50cb61263ec6ffffe9b4.jpg)

### 登录交互流程
![](https://img.yzcdn.cn/public_files/2017/03/16/bdfb2d172a2e13ca123adc2741f0cf89.jpg)

### API调用方式
请求方式：POST

Content-Type：application/x-www-form-urlencoded

### 初始化token接口
请求URL：https://uic.youzan.com/sso/open/initToken

请求参数：

| 字段名称          | 类型     | 是否必填 | 含义                    |
| ------------- | ------ | ---- | --------------------- |
| client_id     | String | 是    | 有赞云分配的应用client_id     |
| client_secret | String | 是    | 有赞云分配的应用client_secret |


* 2017年4月21日前申请开通了AppSDK的开发者，请联系与你对接的服务经理，为你开通新接口的调用。

返回结果：
```json
{
  "code": 0,
  "msg": "success",
  "data": {
    "access_token": "65119644ee553cda8eb1730e0cc4f85e",
    "cookie_key": null,
    "cookie_value": null
  }
}
```

| 字段名称         | 类型     | 含义                          |
| ------------ | ------ | --------------------------- |
| access_token | String | 访问token，无登录态，有效期7天                    |

### 登录接口
请求URL：https://uic.youzan.com/sso/open/login

请求参数：

| 字段名称          | 类型     | 是否必填 | 含义                    |
| ------------- | ------ | ---- | --------------------- |
| client_id     | String | 是    | 有赞云分配的应用client_id     |
| client_secret | String | 是    | 有赞云分配的应用client_secret |
| open_user_id  | String | 是    | 开发者自身系统的用户ID          |
| nick_name     | String | 否    | 用户昵称                  |
| gender        | 1      | 否    | 性别（0男1女2未知）           |
| telephone     | String | 否    | 用户电话                  |
| avatar        | String | 否    | 用户头像                  |
| extra         | String | 否    | 扩展信息                  |
| device_id     | String | 否    | 用户设备ID                |

返回结果：
```json
{
  "msg" : "登录成功",
  "data" : {
    "cookie_value" : "e74c10db3b70d32204922f9f4e",
    "cookie_key" : "open_cookie_c2a7b9269fd095fa5b1467769433688",
    "access_token" : "cddc46b2fcf73739ad0caacfaebf4561"
  },
  "code" : 0
}
```

| 字段名称         | 类型     | 含义                          |
| ------------ | ------ | --------------------------- |
| access_token | String | 访问token，携带用户信息，有效期7天                    |
| cookie_key   | String | 设置的COOKIE的key值，建议128长度字符串   |
| cookie_value | String | 设置的COOKIE的value值，建议128长度字符串 |

错误码：

| 字段名称      | 错误信息      | 解决办法 |
| --------- | --------- | ---- |
| 135000006 | 获取TOKEN失败 | 稍后重试 |

### 登出接口
请求URL：https://uic.youzan.com/sso/open/logout

请求参数：

| 字段名称          | 类型     | 是否必填 | 含义                    |
| ------------- | ------ | ---- | --------------------- |
| client_id     | String | 是    | 有赞云分配的应用client_id     |
| client_secret | String | 是    | 有赞云分配的应用client_secret |
| open_user_id  | String | 是    | 开发者自身系统的用户ID          |


返回结果：
```json
{
  "msg" : "登出成功",
  "data" : null,
  "code" : 0
}
```
