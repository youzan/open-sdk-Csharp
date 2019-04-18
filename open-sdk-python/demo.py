import auth
from yzclient import YZClient

if __name__ == '__main__':
    # 签名模式调用
    # sign = auth.Sign(app_id='${app_id}', app_secret='${app_secret}')
    # yzclient = YZClient(sign)

    # 免签名模式调用
    token = auth.Token(token='${token}')
    client = YZClient(token)

    print client.invoke('kdt.shop.basic.get', '1.0.0', 'GET')
    # print yzclient.invoke('kdt.item.add', '1.0.0', 'POST', params={'title': 'pythongegege333', 'desc': 'new goods',
    #                                                                'price': '1.0', 'post_fee': '0.1'},
    #                       files=[
    #     ('images[]', ('foo.png', open('/Users/ph0ly/Desktop/3.pic.jpg', 'rb'), 'image/png')),
    #     ('images[]', ('bar.png', open('/Users/ph0ly/Desktop/thumb_up_normal.png', 'rb'), 'image/png'))])

    # 上传文件参数files为数组[]，格式形如： ('images[]', ('foo.png', open('/Users/ph0ly/Desktop/3.pic.jpg', 'rb'), 'image/png'))

