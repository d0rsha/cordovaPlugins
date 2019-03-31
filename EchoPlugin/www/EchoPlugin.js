var exec = require("cordova/exec");

var PLUGIN = "EchoPLugin";

var EchoPlugin = {
  coolMethod: function(arg0, success, error) {
    exec(success, error, PLUGIN, "coolMethod", [arg0]);
  },

  echo: function(phrase, success, error) {
    exec(success, error, PLUGIN, "echo", [phrase]);
  },

  getDate: function(success, error) {
    exec(success, error, PLUGIN, "getDate", []);
  }
};

module.exports = EchoPlugin;
