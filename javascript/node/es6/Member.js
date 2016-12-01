"use strict";

const NAME = "Hello";
const _b = Symbol("b");

class Member {
  constructor(a, b) {
    this._a = a;
    this[_b] = b;
  }
}

module.exports = Member;
