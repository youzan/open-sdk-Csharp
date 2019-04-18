## 介绍
+ 有赞开放平台Python版本的SDK，v1.0.0

## 环境

```
python版本:  >= 2.7, < 3.0
三方库依赖: requests, 可以借助开源工具pip安装，pip install requests
```

## 引用包
```
import auth
from yzclient import YZClient
```

## 如何使用？（参考demo.py）
### 调用kdt.item.add接口

```
sign = auth.Sign(app_id='${app_id}', app_secret='${app_secret}')
client = YZClient(sign)
print client.invoke('kdt.item.add', '1.0.0', 'POST',
                params={'title': 'pythongegege333',
                'desc': 'new goods',
                'price': '1.0', 'post_fee': '0.1'},
                files=[
         ('images[]', ('foo.png', open('/Users/ph0ly/Desktop/3.pic.jpg', 'rb'), 'image/png')),
         ('images[]', ('bar.png', open('/Users/ph0ly/Desktop/thumb_up_normal.png', 'rb'), 'image/png'))]
         )

# 上传文件参数files为数组[]，格式形如： ('images[]', ('foo.png', open('/Users/ph0ly/Desktop/3.pic.jpg', 'rb'), 'image/png'))
```

### 调用kdt.shop.basic.get接口

```
token = auth.Token(token='${token}')
client = YZClient(token)
print client.invoke('kdt.shop.basic.get', '1.0.0', 'GET')
```