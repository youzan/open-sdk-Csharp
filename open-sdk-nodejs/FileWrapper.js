var Fs = require('fs');

function FileWrapper(name, fileName) {
	this.name = name;
    this.fileName = fileName;
}

FileWrapper.prototype.getName = function() {
    return this.name;
}

FileWrapper.prototype.getFileName = function() {
    return this.fileName;
}

module.exports = FileWrapper;