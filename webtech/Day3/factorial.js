console.log("Hello World");
let fact=1;

function Factorial(num)
{
    for(i=num ;i>=1;i--)
{
    fact = fact*i;
}
}

let num = prompt("Enter Number ");

Factorial(num);
console.log("Factorial of the given number is  - ", fact);
