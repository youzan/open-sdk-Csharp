<?php
require_once __DIR__ . '/lib/YZGetTokenClient.php';

//工具型应用oauth2.0授权获取token
$client_id = "fill your client_id";//请填入有赞云控制台的应用client_id
$client_secret = "fill your client_secret";//请填入有赞云控制台的应用client_secret
$redirect_url = "fill your redirect_url";//请填入开发者后台所填写的回调地址，本示例中回调地址应指向本文件。

$token = new YZGetTokenClient( $client_id , $client_secret );
$type = 'oauth';//如要刷新access_token，type值为refresh_token
$keys['code'] = $_GET['code'];//如要刷新access_token，这里为$keys['refresh_token']
$keys['redirect_uri'] = $redirect_url;

echo '<pre>';
var_dump(
    $token->get_token( $type , $keys )
);
echo '</pre>';

/*
//自用型应用获取token
$client_id = "fill your client_id";//请填入有赞云控制台的应用client_id
$client_secret = "fill your client_secret";//请填入有赞云控制台的应用client_secret

$token = new YZGetTokenClient( $client_id , $client_secret );
$type = 'self';
$keys['kdt_id'] = '164932';

echo '<pre>';
var_dump(
    $token->get_token( $type , $keys )
);
echo '</pre>';


//平台型应用获取初始化token
$client_id = "fill your client_id";//请填入有赞云控制台的应用client_id
$client_secret = "fill your client_secret";//请填入有赞云控制台的应用client_secret

$token = new YZGetTokenClient( $client_id , $client_secret );
$type = 'platform_init';

echo '<pre>';
var_dump(
    $token->get_token( $type , $keys )
);
echo '</pre>';


 //平台型应用获取店铺token
$client_id = "fill your client_id";//请填入有赞云控制台的应用client_id
$client_secret = "fill your client_secret";//请填入有赞云控制台的应用client_secret

$token = new YZGetTokenClient( $client_id , $client_secret );
$type = 'platform';
$keys['kdt_id'] = '19024015';

echo '<pre>';
var_dump(
    $token->get_token( $type , $keys )
);
echo '</pre>';

 */
