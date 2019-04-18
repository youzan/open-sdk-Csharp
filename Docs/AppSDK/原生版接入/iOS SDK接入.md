# 有赞 Native SDK iOS版接入指南

#### 一、简述

使用有赞 Native SDK 可以将有赞整个电商交易的页面嵌入到APP内, 实现了静默登录, 跳转支付等功能来实现App端的交易闭环.

#### 二、认证

出于更好的安全性考虑, SDK从4.0版本开始调整了用户认证方式, 并且4.0以下版本SDK使用的用户认证方式将不再做支持，并且强烈建议在服务端而不是客户端来完成这些认证过程,以免暴露隐私信息。

新的认证方案如下图所示:

![schemes](https://img.yzcdn.cn/public_files/2017/03/03/83e0fb6c0104d6836bdbb662bf82338a.png)


其中从有赞服务端返回认证信息是一个包含用户登录态信息的JSON, 是完成APP内登录态认证的必要条件.

三方服务端获取认证信息可以参考[服务端接入简介](http://.../)


#### 三、接入指南

下面把步骤说明一下，示例可见随 SDK 提供的 DEMO 项目。

###### 1.引入 framework

   把YZBase.framework 、YZNative.framework 和 YZNativeRes.bundle 加入到工程中，此 SDK 最低支持 iOS 7.0，在 XCode 的 build setting 中，为 other link flags 添加 -ObjC。
    SDK 暴露了三个头文件，`YZNativeSDK.h` 、 `YZNativeViewController.h` 以及 `YZSQuickDealManager.h`。其中`YZNativeSDK.h` 涉及初始化设置，登录登出；`YZNativeViewController.h` 涉及页面的显示以及一些自定义操作：刷新，返回，分享等；`YZSQuickDealManager.h` 涉及一些快速操作。

###### 2.设置 `Info.plist` 里面的值

- 设置Privacy (用户的留言可能需要用户选择图片)
   ![privacy](https://img.yzcdn.cn/public_files/2017/04/19/e8c65110c1ea6d542d346665fead6d94.png)
- 设置 Schemes (付款需要用户打开微信和支付宝)
   ![schemes](https://img.yzcdn.cn/public_files/2017/04/19/eaaf016f40fa2da3dadabd89bc081cc9.png)

###### 3.初始化设置

在调用 framework 中的任意方法之前，需要设置 UserAgent(UA)

 ```objective-c
+ (void)setUserAgent:(nonnull NSString *)userAgent;
 ```

 > 其中入参UserAgent(UA)参考[客户端接入简介][client-introduction-doc]获取. 

 **注意**：最好在调用 framework 中的方法之前，设置 accesstoken，cookie等内容

 ```objective-c
+ (void)setToken:(nonnull NSString *)token key:(nullable NSString *)key value:(nullable NSString *)value;
 ```

这些数据可以通过调用登录接口获取，有包含 open_user_id 和 不包含 open_user_id 的两种登录接口。建议在用户没有登录的时候调用不包含 open_user_id 的接口获取到token等信息，让非登录看到更多的内容。否则会很容易触发用户登录请求，降低用户体验。

###### 4.界面展示

通过一个 URL(通常是店铺主页，或者一个微页面),来初始化 `YZNativeViewController`

```objective-c
[[YZNativeViewController alloc] initWithOriginURL:someURL];
```

然后你就可以 push 这个 ViewController 到一个UINavigationController中 来显示电商页面了。

暂时只支持显示在 UINavigationController 中。如果你想用 present 的方式来显示，可以参考下面的高级功能，用 ChildViewController的方式来实现。

###### 5.登录代理

在显示本 SDK 提供的 ViewController 的时候，某些情况下需要用户登录，此时会调用 YZNativeViewController 实例的代理方法 `-receiveLoginRequestFromYZNativeViewController:`。在登录完成后需要调用实例的`-userDidLogin: 方法来告诉 SDK 用户已经完成登录。

注意的时，登录完成后，需要 APP 调用 `YZNativeSDK` 的 `+saveAccessToken:cookieKey:cookieValue:` 方法来设置用户的token等信息。SDK 并不会保存这些值，客户端可以保存这些值，等下次启动程序的时候直接设置。

###### 6.分享功能

如果想自定义分享事件，可以设置 `YZSUserDidLoginNotification` 实例的 shareBlock 回调。

###### 7.清除认证信息

在三方App内发生用户切换或用户退出的时, 为了避免出现客户信息混乱, 请务必执行如下代码登出有赞用户角色. 

代码示例:

```objective-c
[YZSDK logout];
```

#### 四、高级功能

在某些情况下，APP 方可能只想用子视图的方式来显示商城页面，此时可以通过把 `YZNativeViewController` 的实例通过 ChildViewController的方式，添加到宿主ViewController中，然后主 APP 来控制后退、刷新、分享等功能。

#### 五、快速下单

如果想对单个商品进行快速操作（加入购物车，立即购买），可以使用本 SDK 提供的 `YZSQuickDealManager` 类。
首先他需要一个提供登陆方法的代理。
然后在显示的时候可以调用下面方法，提供当前 ViewController 以及对应商品的 `alias`。

```objective-c
- (void)showInViewController:(UIViewController *)viewController withGoodsAlias:(NSString *)alias;
```

#### 六、常见问题

###### 1.iOS使用SDK时，出现支付后不能返回APP

现在有赞SDK中使用的是微信WAP支付，这个功能并不依赖微信SDK。优点是有赞SDK不需要集成微信SDK，安装包比较小，缺点是无法支持支付后跳转回原APP。

###### 2.iOS点击`去支付`无法跳转到对应客户端(微信、支付宝)

首先确认用户设备是否安装相应客户端，其次确认 shouldStartLoadWithRequest 里是否拦截微信/支付宝的scheme，最后确认工程是否加了微信/支付宝scheme白名单。

###### 3.iOS SDK 是否支持 ATS ?

4.x以上版本走https，老版本走http。若使用老版本，需要更新SDK包；4.x以上的版本不需要更新。

###### 4.iOS SDK 调用注册接口报错 `[__NSDictionaryM addYZObject:forKey:]: unrecognized selector sent to instance xxxxxxxxxxxxxx`

需要在`Other Linker Flags`里加上`-ObjC`。