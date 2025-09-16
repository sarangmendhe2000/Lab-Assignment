function Timer()
{
    let time = new Date();
    let current = time.toLocaleTimeString();
    console.log(current);

    document.getElementById("time").innerHTML=current;
}


setInterval(Timer , 2000);
