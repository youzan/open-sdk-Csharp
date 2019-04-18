<?php
/**
 * 有赞推送服务消息接收示例
 * Doc：https://www.youzanyun.com/docs/guide/push/692
 * Auther: 墨鱼
 * Github：https://github.com/Motea/open-sdk-php/blob/master/YouzanPush.php
 */

$client_id = "";//应用的 client_id
$client_secret = "";//应用的 client_secret

$json = file_get_contents('php://input');
$data = json_decode($json, true);

/**
 * 判断消息是否合法，若合法则返回成功标识
 */
$msg = $data['msg'];
$sign_string = $client_id."".$msg."".$client_secret;
$sign = md5($sign_string);
if($sign != $data['sign']){
    exit();
}else{
    $result = array("code"=>0,"msg"=>"success") ;
    var_dump($result);
}

/**
 * msg内容经过 urlencode 编码，需进行解码
 */
$msg = json_decode(urldecode($msg),true);

/**
 * 根据 type 来识别消息事件类型，具体的 type 值以文档为准，此处仅是示例
 */
if($data['type'] == "SCRM_CARD"){
    //处理会员卡商家侧消息
}