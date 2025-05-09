let faker = require("faker");
let mysql = require("mysql2");

// Create a connection
const connection = mysql.createConnection({
  host: "localhost", // your host, usually localhost
  user: "root", // your MySQL username
  password: "***********", // your MySQL password
  database: "join_us", // your database name
});

// SELECTING DATA ---------
// let q = "SELECT COUNT(*) AS total FROM users";
// connection.query(q, function (error, results, fields) {
//   if (error) throw error;
//   console.log(results[0].total);
// });

// INSERTING DATA ---------
// let q = 'INSERT INTO users (email) VALUES ("rusty_the_dog@gmail.com")';
// connection.query(q, function (error, results, fields) {
//   if (error) throw error;
//   console.log(results);
// });

// INSERTING DATA TAKE2 -------
// let person = { email: faker.internet.email() };
// connection.query(
//   "INSERT INTO users SET ?",
//   person,
//   function (error, results, fields) {
//     if (error) throw error;
//     console.log(results);
//   }
// );

// INSERTING LOTS OF DATA -------
let data = [];
for (let i = 0; i < 500; i++) {
  data.push([faker.internet.email(), faker.date.past()]);
}

// console.log(data);

let q = "INSERT INTO users (email, created_at) VALUES ?";
connection.query(q, [data], function (error, results) {
  if (error) throw error;
  console.log(results);
});

connection.end();

// console.log(faker.internet.email());

// console.log(faker.date.past());

// console.log(faker.address.streetAddress());
// console.log(faker.address.city());
// console.log(faker.address.state());

// function generateAddress() {
//   console.log(faker.address.streetAddress());
//   console.log(faker.address.city());
//   console.log(faker.address.state());
// }

// generateAddress();
