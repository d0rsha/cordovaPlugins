var exec = require('cordova/exec');

// export cordova exec methods 

exports.coolMethod = function (arg0, success, error) {
    exec(success, error, 'ReportFullyDrawnPlugin', 'coolMethod', [arg0]);
};
