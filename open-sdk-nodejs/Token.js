function Token(token) {
	this.token = token;
}

Token.prototype.getToken = function() {
	return this.token;
}

module.exports = Token;