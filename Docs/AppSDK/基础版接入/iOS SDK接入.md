## iOS 基础 SDK 接入

### 一、简述

使用有赞 基础 SDK 可以将有赞整个电商交易的页面嵌入到开发者自身 App 内，可实现静默登录，跳转支付等功能，形成交易闭环。

`基础版SDK`基于 UIWebView 将有赞提供的 Html5 页面嵌入到 App 中。
在`基础版SDK`中访问商品详情页需登录。

### 二、快速体验

开发者通过 demo 来快速了解 SDK 的使用, 点击[下载demo](https://www.youzanyun.com/docs/guide/appsdk#691).

### 三、运行环境

最低支持: iOS 7.0

### 四、接入

#### 1.引入FrameWork

1. 把YZBase.framework 加入到工程中，此 SDK 最低支持 iOS 7.0，在 XCode 的 build setting 中，为 other link flags 添加 `-ObjC`。
2. 设置 `Info.plist` 里面的值

- 设置Privacy (用户的留言可能需要用户选择图片)
  ![privacy](https://img.yzcdn.cn/public_files/2017/04/19/e8c65110c1ea6d542d346665fead6d94.png)
- 设置 Schemes (付款需要用户打开微信和支付宝)
  ![schemes](https://img.yzcdn.cn/public_files/2017/04/19/eaaf016f40fa2da3dadabd89bc081cc9.png)

SDK 暴露了头文件 `YZSDK.h` ，里面定义了登录、登出、网页交互的一些方法。

#### 2.初始化

使用之前需要设置 UserAgent(UA)

```objective-c
[YZSDK setUserAgent:YourUserAgent];
```

> 其中入参 userAgent 的值就是你 client_id (客户端标识ID) 的值，client_id 的获取请参考[服务端接入简介][client-introduction-doc]获取，2017年4月21日前开通 APPSDK 的用户如申请进行了 ua 绑定 client_id ，这里填 ua 即可。

#### 3.界面展示

有赞`基础SDK`依托于`UIWebView`来进行页面展示.传入商城页面地址，就可以进行完整的商品展示购买流程。

主要注意下面两个代理方法必须调用，具体可参考DEMO

```objective-c
- (void)webViewDidFinishLoad:(UIWebView *)webView {
	// 页面加载完成，初始化有赞交互环境
    [YZSDK initYouzanWithUIWebView:webView];
}
```

```objective-c
- (BOOL)webView:(UIWebView *)webView shouldStartLoadWithRequest:(NSURLRequest *)request navigationType:(UIWebViewNavigationType)navigationType {
    NSURL *url = [request URL];
	// 解析是否是有赞的回调事件，并做相应处理
    YZNotice *noticeFromYZ = [YZSDK noticeFromYouzanWithUrl:url];
	
    if(noticeFromYZ.notice & YouzanNoticeLogin) { // 登录请求
        
    } else if(noticeFromYZ.notice & YouzanNoticeShare) {// 分享事件

    } else if(noticeFromYZ.notice & YouzanNoticeReady) {//有赞环境初始化成功，分享按钮可用

    } else if (noticeFromYZ.notice & IsYouzanNotice) {// 其他事件
    }
    return YES;
}

```



#### 4.认证

出于更好的安全性考虑, SDK从4.0版本开始调整了用户认证方式, 并且4.0以下版本SDK使用的用户认证方式将不再做支持.

新的认证方案如下图所示:

![认证方案示例图](https://img.yzcdn.cn/public_files/2017/03/03/83e0fb6c0104d6836bdbb662bf82338a.png)


其中从有赞服务端返回认证信息是一个包含用户登录态信息的JSON, 是完成APP内登录态认证的必要条件.

三方服务端获取认证信息可以参考[服务端登录态API调用](https://www.youzanyun.com/docs/guide/appsdk#683)

##### 1)获取认证信息

在获取到用户信息后, 需要将数据按要求填充到`YouzanToken`.

``` objective-c
+ (void)setToken:(nonnull NSString *)token key:(nullable NSString *)key value:(nullable NSString *)value;
```

##### 2)清除认证信息

在三方App内发生用户切换或用户退出的时, 为了避免出现客户信息混乱, 请务必执行如下代码登出有赞用户角色.

代码示例:

``` objective-c
+ (void)logout;
```

### 五、其他

#### 1.页面分享

如需要获取页面的分享信息, 需要调用下面方法来触发分享事件：

``` objective-c
+ (void)shareActionWithUIWebView:(nonnull UIWebView *)webView;
```

之后会触发 `UIWebView` 加载一个新的URL，通过解析可以得到一个 `YZNotice`，其`response` 会包含分享需要的各种信息。具体可参考DEMO。

> 并不是有赞的所有可见页面都能触发分享.


#### 2.日志开关

SDK 提供了日志功能，默认日志为关闭状态. 开发者可以通过下面设置打开日志开关. 

``` objective-c
+ (void)setOpenDebugLog:(BOOL)open;
```