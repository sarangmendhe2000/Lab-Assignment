let arr=[1,8,4,9,-8,20,99,111, 112,4];

// let max = arr[0];

// arr.forEach((e) =>{
//     if(max < e)
//     {
//         max = e ;
//     }
// });

arr.sort((a,b) => a-b);
console.log("Largest element in an array : " , arr[arr.length-1]);

