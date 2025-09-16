
function time(id)
{
    let time = new Date();
    let second = time.getSeconds();
    let minute = time.getMinutes();
    let hours = time.getHours();


    console.log("Time is - " , hours + ": ",minute + ": ", second )
    // alert("Hello")

    clearInterval(id)
}

let id = setInterval(time,1000);

setTimeout(function(){

    clearInterval(id);
    console.log("Stop after 5 second");
},5000)