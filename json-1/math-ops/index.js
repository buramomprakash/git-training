const operations=require('./operations.js')

console.log(operations.add(9,10))
console.log(operations.sub(9,10))
console.log(operations.mul(9,10))


const arguments = process.argv.slice(2)

//console.log(arguments)

arguments.forEach(function(item , value){
    console.log(item,value)
});