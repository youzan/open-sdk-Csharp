var Sign = require('./Sign');
var Token = require('./Token');
var FileWrapper = require('./FileWrapper');
var HashMap = require('hashmap');
var Moment = require('moment');
var Http = require('http');
var Request = require('request');
var MD5 = require('md5');
var FormData = require('form-data');
var Crypto = require('crypto');
var Fs = require('fs');
var Q = require('q');

function YZClient(auth) {
    if (typeof auth == 'undefined') {
        throw new Error('Auth expected');
    }
    this.auth = auth;
}

YZClient.prototype.invoke = function(apiName, version, method, params, files) {

    var url = 'https://api.youzanyun.com';
    var service = apiName.substring(0, apiName.lastIndexOf('.'));
    var action = apiName.substring(apiName.lastIndexOf('.') + 1, apiName.length);
    var requestParams = params;
    if (typeof params == 'undefined') {
    	requestParams = {};
    }
    // token模式
    if (this.auth instanceof Token) {
        url += '/api/oauthentry/' + service + '/' + version + '/' + action + '?access_token=' + this.auth.getToken();
        requestParams = new HashMap();
        for (k in params) {
        	requestParams.set(k, params[k]);
        }
    }
    // 签名模式
    else if (this.auth instanceof Sign) {
        url += '/api/entry/' + service + '/' + version + '/' + action;
        requestParams = this.getSign(this.auth, params);
    } else {
        throw new Error('Unknown type of Auth, expectd "Sign" or "Token"');
    }

    return this.sendRequest(url, method, requestParams, files);
}

YZClient.prototype.sendRequest = function(url, method, params, files) {
    var deferred = Q.defer();
    var userAgent = 'X-KDT-Client 2.0.0 - NodeJS';
    if (method.toUpperCase() == 'POST') {
        if (typeof files != 'undefined') {
            // 构造multipart
            var form = {};
            params.forEach(function(value, key) {
                form[key] = value;
            });
            for (var i = 0; i < files.length; i++) {
                if (files[i] instanceof FileWrapper) {
                    var tmp = files[i];
                    var fileStream = Fs.createReadStream(tmp.getFileName());
                    if (typeof form[tmp.getName()] != 'undefined') {
                        form[tmp.getName()].push(fileStream);
                    } else {
                        form[tmp.getName()] = [fileStream];
                    }
                }
            }
            Request.post({
                'url': url,
                'formData': form
            }, function(err, resp, body) {
                if (typeof err != 'undefined' && err != null) {
                    deferred.reject(err);
                } else if (resp.statusCode != 200) {
                    deferred.reject(resp);
                } else {
                    deferred.resolve(resp);
                }
            });
        }
        // 普通url encoded form
        else {
            var form = {};
            params.forEach(function(value, key) {
                form[key] = value;
            });
            Request.post({
                'url': url,
                'form': form
            }, function(err, resp, body) {
                if (typeof err != 'undefined' && err != null) {
                    deferred.reject(err);
                } else if (resp.statusCode != 200) {
                    deferred.reject(resp);
                } else {
                    deferred.resolve(resp);
                }
            })
        }

    } else if (method.toUpperCase() == 'GET') {
        var qs = {};
        params.forEach(function(value, key) {
            qs[key] = value;
        });
        Request({
            headers:{
                "response-compatible-mode": "response"
            },
            'url': url,
            'method': 'GET',
            'qs': qs
        }, function(err, resp, body) {
            if (typeof err != 'undefined' && err != null) {
                deferred.reject(err);
            } else if (resp.statusCode != 200) {
                deferred.reject(resp);
            } else {
                deferred.resolve(resp);
            }
        });
    }
    return deferred.promise;
}

YZClient.prototype.getSign = function(auth, params) {
    if (typeof auth == 'undefined' || typeof auth != 'object') {
        throw new Error('Auth expected and must be "Sign" type');
    }
    var timestamp = Moment().format("YYYY-MM-DD HH:mm:ss");
    var format = 'json';
    var appId = auth.getAppId();
    var appSecret = auth.getAppSecret();
    var v = '1.0';
    var signMethod = 'md5';

    var paramMap = new HashMap();
    // 通用参数
    paramMap.set('timestamp', timestamp);
    paramMap.set('format', format);
    paramMap.set('app_id', appId);
    paramMap.set('v', v);
    paramMap.set('sign_method', signMethod);

    var paramKeys = ['timestamp', 'format', 'app_id', 'v', 'sign_method'];

    var input = appSecret;
    // 动态参数
    if (typeof params != 'undefined') {
        for (var key in params) {
            paramMap.set(key, params[key]);
            paramKeys.push(key);
        }
    }
    var sortedKeys = paramKeys.sort();
    for (var i = 0; i < sortedKeys.length; i++) {
        input += (sortedKeys[i] + paramMap.get(sortedKeys[i]));
    }
    input += appSecret;
    var sign = MD5(input);

    paramMap.set('sign', sign);

    return paramMap;
}

module.exports = YZClient;