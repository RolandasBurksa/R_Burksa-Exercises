var express = require("express");
var app = express();

app.get("/", function (req, res) {
  //   console.log("SOMEONE REQUESTED US!.");
  res.send("You've Reached The Home Page!");
});

app.listen(8080, function () {
  console.log("Server running on 8080!.");
});
