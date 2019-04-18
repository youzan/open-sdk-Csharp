有赞基础SDK5.1.0 Android端接入指南
===

## 1. 简述

使用`有赞基础SDK`可以将有赞整个电商交易的页面嵌入到APP内, 实现了静默登录, 跳转支付等功能来实现App端的交易闭环.

> 注: 本文只涉及SDK的使用方法, 默认读者已经熟悉IDE的基本使用方法(Android Studio(推荐) 或 Eclipse), 以及具有一定的编程知识基础等.

## 2. 快速体验

开发者通过demo来快速了解SDK的使用, 点击[【下载demo】][download-core-sdk].

## 3. 运行环境

最低支持: Android 3.1.x(API 12)

### 3.1 依赖: 

* 网络请求框架

  [okhttp3+][], [okio][]

## 4. 接入

### 4.1 引入依赖

在 项目的根build.gradle中声明maven仓库.
如下:


``` groovy
allprojects {
    repositories {
		maven {url 'https://dl.bintray.com/youzanyun/maven/'}
	}
}

```

在子项目build.gradle的dependencies中声明包：

``` groovy
	compile 'com.youzanyun.open.mobile:basic:5.1.0'

```

> 注：如果是从老版本升级过来, 须将Manifest里的`YZ_APP_ID`和`YZ_APP_SECRET `删除掉.

### 4.2 初始化

在全局`Application`的`onCreate`方法中添加初始化代码:

``` java
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        /**
         * 初始化
         * @param Context application Context
         * @param clientId 客户端标识ID
         */
        YouzanSDK.init(this, "Here is client id provided by Youzan");
    }
}
```

> 即保证在调用有赞SDK提供的视图类之前需要对SDK进行初始化.
> 其中入参UserAgent(UA)参考[客户端接入简介][client-introduction-doc]获取，2017年4月21日前开通 APPSDK 的用户如申请进行了 ua 绑定 client_id ，这里填 ua 即可。

### 4.3 界面展示

有赞`基础SDK`依托于`YouzanBrowser`来进行页面渲染, 开发者可以像`WebView`一样熟悉的使用.

如下是加载一个有赞页面的代码示例:

``` java
YouzanBrowser view = new YouzanBrowser(context);
view.loadUrl("店铺链接");
```

> **下面使用`view`的地方默认为`YouzanBrowser`实例对象.**
>
> 如果是使用有赞原生版SDK来进行页面渲染, 将`YouzanBrowser`替换成`YouzanHybrid`即可.

### 4.4 认证

出于更好的安全性考虑, SDK从4.0版本开始调整了用户认证方式, 并且4.0以下版本SDK使用的用户认证方式将不再做支持.

新的认证方案如下图所示:

![认证方案示例图][youzan-auth-framework-map]


其中从有赞服务端返回认证信息是一个包含用户登录态信息的JSON, 是完成APP内登录态认证的必要条件.

三方服务端获取认证信息可以参考[服务端接入简介][server-doc]

#### 4.4.1 获取认证信息

需要订阅认证事件`AbsAuthEvent`来监听来自SDK内的认证回调, 并编码实现请求三方自有服务端来获取认证数据. 

``` java
view.subscribe(new AbsAuthEvent() {
	/**
	* 认证回调
 	* @param view 触发回调的视图
	* @param needLogin 认证信息是否需要用户角色信息
 	*/
	@Override
	public void call(View view, boolean needLogin) {
		//实现一个网络请求, 从三方服务端获取认证信息数据
	}
});
```

在获取到用户信息后, 需要将数据按要求填充到`YouzanToken`.

`YouzanToken `的数据模型:

| 字段          | 说明                   |
| ----------- | -------------------- |
| accessToken | 可用于获取资源的 AccessToken |

示例代码:

``` java
view.sync(token);
```

#### 4.4.2 清除认证信息

在三方App内发生用户切换或用户退出的时, 为了避免出现客户信息混乱, 请务必执行如下代码登出有赞用户角色. 

代码示例:

``` java
YouzanSDK.userLogout(context);
```

### 4.5 其他

#### 4.5.1 页面回退

因为SDK设计原因需要监听返回事件, 来处理页面回退逻辑.
如下是重写了Activity的`onBackPressed`代码示例:

``` java
@Override
public void onBackPressed() {
    if (!view.pageGoBack()) {
        super.onBackPressed();
    }
}
```

> 注1: 这里是调用的是`YouzanBrowser.pageGoBack()`区别于`WebView.goBack()`.


#### 4.5.2 图片上传

为处理来自页面上的图片上传事件, 需要订阅文件选择事件`AbsChooserEvent`, 并通过`view.receiveFile(requestCode, data)`接收数据.

代码示例:

``` java
view.subscribe(new AbsChooserEvent() {
	@Override
	public void call(View view, Intent intent, int requestId) throws ActivityNotFoundException {
		startActivityForResult(intent, requestId);
	}
});
```

上面是通过`startActivityForResult`来启动系统图片选择, 所以需要在`onActivityResult`中接收图片后将uri数据后回传给SDK处理.

``` java
@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if(resultCode == RESULT_OK){
        //返回文件uri
        view.receiveFile(requestCode, data);
    }
}
```

#### 4.5.3 页面分享

如需要获取页面的分享信息, 需要调用`view.sharePage()`来触发分享事件.
代码示例:

``` java
view.subscribe(new AbsShareEvent() {
	@Override
	public void call(View view, GoodsShareModel data) {
		//在获取数据后, 可以使用其他分享SDK来提高分享体验.
	}
});
```

页面分享信息模型(GoodsShareModel)

| 字段     | 说明      |
| ------ | ------- |
| title  | 页面标题    |
| link   | 当前页面链接  |
| desc   | 商品详细的描述 |
| imgUrl | 商品图片链接  |

> 并不是有赞的所有可见页面都能触发分享.


#### 4.5.4 日志开关

SDK 提供了日志功能，默认日志为关闭状态. 开发者可以通过下面设置打开日志开关. 通过 `YZSDK` 来对日志进行筛选.

``` java
YouzanSDK.isDebug(true);
```


[client-introduction-doc]:https://www.youzanyun.com/docs/guide/appsdk/682
[okhttp3+]:http://repo1.maven.org/maven2/com/squareup/okhttp3/okhttp/
[okio]:http://repo1.maven.org/maven2/com/squareup/okio/okio/
[download-core-sdk]:https://www.youzanyun.com/docs/guide/appsdk/691
[server-doc]:https://www.youzanyun.com/docs/guide/appsdk/683
[youzan-auth-framework-map]:https://img.yzcdn.cn/public_files/2017/03/03/83e0fb6c0104d6836bdbb662bf82338a.png
[listen-backpress-in-fragment]:http://www.jianshu.com/p/fff1ef649fc0

