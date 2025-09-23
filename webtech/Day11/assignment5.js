console.log("First")

setImmediate(()=>{

    console.log("SetImmediate is run")
})


process.nextTick(()=>
{
    console.log("Second");
})


setImmediate(()=>{

    console.log("SetImmediate22222 is run")
})

console.log("Third");