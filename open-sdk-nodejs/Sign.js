
function Sign(appId, appSecret) {
	this.appId = appId;
	this.appSecret = appSecret;
}

Sign.prototype.getAppId = function() {
	return this.appId;
}

Sign.prototype.getAppSecret = function() {
	return this.appSecret;
}

module.exports = Sign;