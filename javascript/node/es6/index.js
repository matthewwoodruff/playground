"use strict";

var Member = require("./Member");

var a = "hello";

var member = new Member(1, 2);

var es6Func = () => "a";

console.log(member);
console.log(member._a);

var abc = (val) => {
  "use strict";
  val = "wut?";
  console.log(val);
}

abc(a);

console.log(a);
