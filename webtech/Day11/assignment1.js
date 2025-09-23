let number = parseInt(process.argv[2]);

function factorial(number)
{
    if(number<0)
    {
        console.log("Enter positive number");
    }
    else if ( number === 0 || number === 1)
    {
        return 1;
    }

    else
       return  number* factorial(number-1)
}

let result = factorial(number);
console.log(result)