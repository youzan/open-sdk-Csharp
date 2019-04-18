<?php
require_once __DIR__ . '/lib/YZSignClient.php';

//注意：签名调用方式将在2017年10月31日后废弃不再支持，请尽快换用免签名方式调用。

$app_id = 'fill your app_id'; //请填入你有赞店铺后台-营销-有赞API的AppId
$app_secret = 'fill your app_secret';//请填入你有赞店铺后台-营销-有赞API的AppSecret
$client = new YZSignClient($app_id, $app_secret);

$method = 'youzan.item.get';//要调用的api名称
$api_version = '3.0.0';//要调用的api版本号

$my_params = [
	'item_id' => '888888',
];

echo '<pre>';
var_dump(
    $client->post($method, $api_version, $my_params)
);
echo '</pre>';

/*
调用图片上传接口示例

$method = 'youzan.materials.storage.platform.img.upload';//要调用的api名称
$api_version = '3.0.0';//要调用的api版本号

$my_files = [
    [
        'url' => __DIR__ . '/test1.png',
        'field' => 'image[]',
    ],
];

echo '<pre>';
var_dump(
    $client->post($method, $api_version, $my_params, $my_files)
);
echo '</pre>';
*/