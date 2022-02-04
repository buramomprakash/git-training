
const chalk = require("chalk")


function checkOddOrEven(num){
    if(num%2==0){
        return chalk.bgWhite.blue('$'+num +'is even')
    }else{
        return chalk.bgWhite.blue('$'+num +'is odd')
    }
}

console.log(checkOddOrEven(20))
console.log(checkOddOrEven(29))
console.log(checkOddOrEven(66))
console.log(checkOddOrEven(97))
