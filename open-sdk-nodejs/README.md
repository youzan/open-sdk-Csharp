## 介绍
+ 有赞开放平台NodeJS版本的SDK，v2.0.0

## 安装
```
npm install yz-open-sdk-nodejs
```

## 引用包
```
var YZClient = require('yz-open-sdk-nodejs');
var Token = require('./node_modules/yz-open-sdk-nodejs/Token');
```

## 如何使用？（参考demo.js）
### 调用kdt.item.add接口

```
var YZClient = new YZClient(new Sign('app_id', 'app_secret')); //var YZClient = new YZClient(new Token('xxxx'));
var image0 = new FileWrapper('images[]', '/Users/ph0ly/Desktop/thumb_up_normal.png');
var image1 = new FileWrapper('images[]', '/Users/ph0ly/Desktop/thumb_down_normal.png');
var image2 = new FileWrapper('images[]', '/Users/ph0ly/Desktop/abcdefg.jpg');

var promise = YZClient.invoke('kdt.item.add', '1.0.0', 'POST', {
    title: 'nodejs333',
    price: 123,
    post_fee: 100,
    desc: 'dddd'
}, [image0, image1, image2]);

promise.then(function(resp) {
	console.log('resp: ' + resp.body);
	var data = JSON.parse(resp.body);
	console.log(data.response.item.num_iid);
}, function(err) {
	console.log('err: ' + err);
}, function(prog) {
	console.log('prog: ' + prog);
});

```

### 调用kdt.item.update接口

```
var promise = YZClient.invoke('kdt.item.update', '1.0.0', 'POST', {
	num_iid: 327492886,
    title: 'nodejs333 => 444',
    price: 123,
    post_fee: 100,
    desc: 'aaaa'
}, [ image2 ]);

promise.then(function(resp) {
	console.log('resp: ' + resp.body);
	var data = JSON.parse(resp.body);
	console.log(data.response.item.num_iid);
}, function(err) {
	console.log('err: ' + err);
}, function(prog) {
	console.log('prog: ' + prog);
});

```

### 调用kdt.shop.basic.get接口

```
var promise = YZClient.invoke('kdt.shop.basic.get', '1.0.0', 'GET', {});

promise.then(function(resp) {
	console.log('resp: ' + resp.body);
	var data = JSON.parse(resp.body);
	console.log(data.response.item.num_iid);
}, function(err) {
	console.log('err: ' + err);
}, function(prog) {
	console.log('prog: ' + prog);
});

```