//  let i = 1;

//  function Counting(i)
//  {
//     for(i=1;i<=100;i++)
//     {
//         if(i%3 === 0 && i%5 === 0)
//         {
//             console.log("foobar")
//         }
//         else if(i%5 === 0 && i%3 !=0)
//         {
//             console.log("bar")
//         }
//         else if(i%5 !== 0 && i%3 === 0)
//         {
//             console.log("foo");
//         }
//         else
//         {
//             console.log(i);
//         }
//     }
//  }

//  Counting(i);


for (let i = 1; i <= 100; i++) {
    let output = "";  // start with empty string

    if (i % 3 === 0) output += "foo";  // add "foo" if divisible by 3
    if (i % 5 === 0) output += "bar";  // add "bar" if divisible by 5

    console.log(output || i);  // print output if not empty, else print the number
}