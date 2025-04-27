const mysql = require("mysql2");

// Create a connection
const connection = mysql.createConnection({
  host: "localhost", // your host, usually localhost
  user: "root", // your MySQL username
  password: "*********", // your MySQL password
  database: "book_shop", // your database name
});

// Connect
connection.connect((err) => {
  if (err) {
    console.error("Error connecting: " + err.stack);
    return;
  }
  console.log("Connected as id " + connection.threadId);
});

// Don't forget to close the connection when done
connection.end();
