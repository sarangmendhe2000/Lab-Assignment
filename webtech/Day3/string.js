let arr = ["Apple" , "Grapes" , "Banana " , "Mango"];

arr.forEach((e,i) => {
    arr[i] = e.toUpperCase();
});

console.log(arr);