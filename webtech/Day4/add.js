// function Calculate(...a)
// {
//     let sum =0;
//     let odd=[];
    
//     for(let i=0;i<a.length;i++)
//     {
//         sum = sum +a[i];
    

//     if(a[i]%2 != 0)
//     {
//         odd.push(a[i]);
//     }
//     }


//     console.log("Sum is - ",sum);
//     for(i=0;i<odd.length;i++)
//     {
//         console.log(odd[i]);
//     }
// }




// Simplification of this code - 

function Calculate(...a)
{
        let sum =0;
        let odd=[];

        a.forEach((e)=>{
                sum += e
                 if(e%2!=0)
        {
            odd.push(e);
        }
        }

        
       
)
console.log("Sum is - ", sum);
console.log(odd.join(", "));
console.log("Maximum number in th array is - ", Math.max(...a));

        
}


Calculate(2,3,4);
Calculate(5,4);
Calculate(2,0,2,3,4,5,6);
Calculate();