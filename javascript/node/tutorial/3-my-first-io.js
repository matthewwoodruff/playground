var fs = require('fs');

console.log(process.argv[1])

var buffer = fs.readFileSync(process.argv[1]);

console.log(buffer.toString().split("\n").length)