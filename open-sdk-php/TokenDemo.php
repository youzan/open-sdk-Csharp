<?php
require_once __DIR__ . '/lib/YZTokenClient.php';

$token = 'fill your token';//请填入商家授权后获取的access_token
$client = new YZTokenClient($token);

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

$files = [
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