
// try{

//     let n = process.argv[2];

//     if(isNaN(n) || n<1 || n>5)
//     {
//         throw new Error("Enter number between 1-5");
        
//     }


// for (let i = 0; i < n; i++) {


//     for (let j = n; j > i; j--) {
//         process.stdout.write("* ");
//     }
//     console.log("");

// }

// }
// catch(error)
// {
//     console.error("Error : " , error.message)
// }


const validInputs = [1, 2, 3, 4, 5];

try {
    let n = parseInt(process.argv[2]);
    if (!validInputs.includes(n)) {
        throw new Error("Input must be between 1 and 5");
    }

    for (let i = n; i >= 1; i--) {
        console.log("* ".repeat(i).trim());
    }

} catch (err) {
    console.error("Error:", err.message);
}







