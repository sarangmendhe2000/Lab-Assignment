let num1 = process.argv[2];
let num2 = process.argv[3];

// console.log(num1*num2);

const Mutiply = new Promise((resolve , reject) =>{

    if(num1 > 0 && num2 > 0)
    {
        resolve(num1 * num2);
    }
    else
    {
        reject("Both number must be positive");
    }
});


Mutiply
.then(result =>{
    console.log("Multiplication result" , result)
}) 

.catch(error =>{

    console.log("Error "  , error);
})
