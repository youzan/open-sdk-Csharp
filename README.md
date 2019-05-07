# open-sdk-Cshrap
有赞云开放平台SDK C#语言
## 1. 获取Token

    Silent silent = new Silent("bifrost-console", "bifrost-console",18163424);
    ToKenData oAuthToken = silent.GetToken();
    string token = oAuthToken.Toke
    
## 2.正常调用

            GeneralApi generalApi = new GeneralApi();
            GeneralApiParams apiParams = new GeneralApiParams();
            generalApi.SetName("youzan.ump.promocard.detail.get");
            generalApi.SetVersion("3.0.0");
            generalApi.SetHttpMethod("POST");
            generalApi.SetOAuthType(common.constant.OAuthEnum.TOKEN);
            apiParams.AddParam("id", "2003777768");
            generalApi.SetAPIParams(apiParams);

            IYouZanClient defaultYZClient = new DefaultYZClient();

            string result  =  defaultYZClient.Invoke(generalApi,newToken(oAuthToken.Token));



### 请求参数

    不同类型的token获取方式传参略有不同
    
### AuthorizationCode（授权码类型）

| 参数名| 是否必传 | 类型 |实例值|参数描述
| ------ | ------ | ------ |--------|--------
| client_id | 是 | String |bifrost-console|客户端ID
| client_secret | 是 | String |bifrost-console|客户端秘钥
| authorize_type | 否 | String |authorization_code|应用授权类型（默认可缺省）
| code | 是 | String | 18163424|应用授权码（店铺授权给应用是产生）

### CertificateToke（默认类型）
| 参数名| 是否必传 | 类型 |实例值|参数描述
| ------ | ------ | ------ |--------|--------
| client_id | 是 | String |bifrost-console|客户端ID
| client_secret | 是 | String |bifrost-console|客户端秘钥
| authorize_type | 否 | String |certificate|应用授权类型（默认可缺省）

### RefreshToken（工具类型刷新token）

| 参数名| 是否必传 | 类型 |实例值|参数描述
| ------ | ------ | ------ |--------|--------
| client_id | 是 | String |bifrost-console|客户端ID
| client_secret | 是 | String |bifrost-console|客户端秘钥
| authorize_type | 否 | String |refresh_token|应用授权类型（默认可缺省）
| refresh_token | 是 | String |5a2be800b5a5e903be484b24b8197dfc|被刷新token

### SilentToken（自用类型）


| 参数名| 是否必传 | 类型 |实例值|参数描述
| ------ | ------ | ------ |--------|--------
| client_id | 是 | String |bifrost-console|客户端ID
| client_secret | 是 | String |bifrost-console|客户端秘钥
| authorize_type | 否 | String |silent|应用授权类型（默认可缺省）
| grant_id | 否 | long / ulong | 18163424|店铺ID


### 响应参数


| 参数名| 类型 |实例值|参数描述
| ------ | ------ | ------ |--------|--------
| expires | String|bifrost-console|过期时间
| access_token | String |5a2be800b5a5e903be484b24b8197dfc|token
| authority_id |String |18163424|授权ID
| scop |String |"multi_store shop item trade logistics coupon_advanced user pay_qrcode trade_virtual reviews item_category storage retail_goods"|应用范围



### Invoke(IAPI api, IAuth auth);

### 场景说名：

    构建API发送请求到网关
    
### 接口说明

    外部开发者的鉴权方式目前只有Token：
    
#### 构建API的参数：
| 参数名| 是否必传 | 类型 |实例值|参数描述
| ------ | ------ | ------ | ------ | ------ 
| GeneralApiParams | 是 | GeneralApiParams ||API请求参数
| apiName | 是 | String |youzan.ump.promocard.detail.get|API名称
| version | 否 | String |3.0.0|API版本号
| method | 否 | String | POST|请求方式
| oauthType | 是 | oauthType | TOKEN|鉴权类型

### 响应参数

| 参数名| 是否必传 | 类型 |实例值
| ------ | ------ | ------ | ------ |
| response | 是 | String |根据接口而定

