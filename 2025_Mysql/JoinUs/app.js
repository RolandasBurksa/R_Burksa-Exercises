var express = require("express");
var app = express();
var bodyParser = require("body-parser");
const mysql = require("mysql2");

app.set("view engine", "ejs");
app.use(bodyParser.urlencoded({ extended: true }));
app.use(express.static(__dirname + "/public"));

// Create a connection
const connection = mysql.createConnection({
  host: "localhost", // your host, usually localhost
  user: "root", // your MySQL username
  password: "rbjavacoding@", // your MySQL password
  database: "book_shop", // your database name
});

app.get("/", function (req, res) {
  //   console.log("SOMEONE REQUESTED US!.");
  //   Find count of users in DB
  var q = "SELECT COUNT(*) AS count FROM books";
  connection.query(q, function (err, results) {
    if (err) throw err;
    var count = results[0].count;
    // res.send("We have " + count + " users in our DB!");
    res.render("home", { data: count });
  });
});

app.post("/register", function (req, res) {
  console.log("POST REQUEST SENT TO /REGISTER!." + req.body.email);
});

app.get("/joke", function (req, res) {
  res.send(
    "<strong>Now you are on the Joke page!</strong> <em> Let's do that again!</em>"
  );
  console.log("REQUESTED THE JOKE ROUT!.");
});

app.get("/random_num", function (req, res) {
  var num = Math.floor(Math.random() * 10) + 1;
  res.send("Your lucky number is - " + num);
});

app.listen(8080, function () {
  console.log("Server running on 8080!.");
});
