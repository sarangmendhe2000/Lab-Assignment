let a = parseInt(prompt("Enter first Number"));
let b =parseInt( prompt("Enter Second Number"));


let choice = parseInt(prompt("Enter 1 for Addtion , 2 for Substraction  , 3 for Multiplication , 4 for Division"));

switch(choice)
{
    case 1 : Calculate(a , b, Additon)
    break;

    case 2 : Calculate(a , b, Substraction)
    break;

    case 3 : Calculate(a , b, Multiplication)
    break;

    case 4 : Calculate(a , b, Division)
    break;

    default : 
    console.log("Invalid Choice");
    break;

}

function Calculate(a , b , myCallback )
{
    let result = myCallback(a , b )
    display(result);
}

function Additon(a , b)
{
    return a+b;
}

function Substraction(a , b)
{
    return a-b;
}

function Multiplication(a, b)
{
    return a*b;
}

function Division(a , b)
{
    try
    {
        if(b===0)
        {
            throw new Error( "Division by 0 is not allowed")
        }
        return  a/b;
    }
    catch(error)
    {
        return error.message
    }

    
}

function display(result)
{
    console.log(result);
    document.writeln("result = " , result);
}