function factorial(num)
{
    if(num<0)
    {
        return "Factorial not defined , please enter positive number";
    }
    else if(num==0 || num == 1)
    {
        return 1;
    }
    else
    {
        return num * factorial(num-1)
    }
}

let num = prompt("Enter Number");
let result = factorial(num);
console.log("Factorial of the given number is - " , result);