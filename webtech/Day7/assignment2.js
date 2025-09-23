$(document).ready(function(){

function factorial(number)
{
    let result = 1;

    if(number === 0)
    {
        return 1;
    }

    for(i=1;i<=number;i++)
    {
        result *= i;
    }
    return result;
}



 $("#btn").click(function(){


    let number =  parseInt($("#number").val()) ;

    if(isNaN(number) || number< 0)
    {
        $("#factorial").text("Please Enter valid Positive Number")
    }
 
    else
    {
        let fact = factorial(number);
        $("#factorial").text("Factorial of the given number is " + fact);
    }
 })   

})