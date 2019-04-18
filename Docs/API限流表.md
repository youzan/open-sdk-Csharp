### 有赞API调用频次限流表

下述API频次限流对消息推送服务无影响，目前有赞的消息推送服务已支持订单、商品、积分、会员卡信息变更主动推送，建议自行开发进销存系统商家和正在服务大量商家的第三方ERP合作伙伴接入[有赞主动推送服务](https://www.youzanyun.com/docs/guide/push/692)，以保障订单数据、商品数据、库存数据的及时有效同步。

| API                                      | API名称         | 限流维度 | 限流阈值（次）  |
| ---------------------------------------- | ------------- | ---- | -------- |
| -                                        | 所有API总的调用次数   | 单IP  | 30000/分钟 |
| kdt.item.get| 获取单个商品信息      | 单店铺  | 10000/分钟 |
| kdt.item.update| 更新单个商品信息      | 单店铺  | 1000/分钟  |
| kdt.item.update.listing | 批量上架商品        | 单店铺  | 1000/分钟  |
| kdt.item.sku.update | 更新SKU信息       | 单店铺  | 2000/分钟  |
| kdt.items.inventory.get| 获取仓库中的商品列表    | 单店铺  | 1000/分钟  |
| kdt.items.onsale.get | 获取出售中的商品列表    | 单店铺  | 1000/分钟  |
| kdt.items.custom.get | 根据商品货号获取商品    | 单店铺  | 1000/分钟  |
| kdt.itemcategories.tags.get | 获取商品自定义标签列表   | 单店铺  | 7500/分钟  |
| kdt.skus.custom.get | 根据商品编码获取商品SKU | 单店铺  | 1000/分钟  |
| kdt.crm.fans.points.payout.get | 给用户减积分 | 单店铺  | 6000/分钟  |
| kdt.crm.fans.points.payin.get | 给用户加积分 | 单店铺  | 6000/分钟  |
| kdt.crm.customer.points.increase | 给用户加积分 | 单店铺  | 6000/分钟  |
| kdt.crm.customer.points.decrease | 给用户减积分 | 单店铺  | 6000/分钟  |
| youzan.crm.customer.points.decrease | 给用户减积分 | 单店铺  | 6000/分钟  |
| youzan.crm.customer.points.increase | 给用户加积分 | 单店铺  | 6000/分钟  |

注：表格中未列接口的频次限制受制于单IP每分钟调用限制。