var total = process.argv.slice(2).reduce(function(previousValue, currentValue) {
  return Number(previousValue) + Number(currentValue);
});

console.log(total);