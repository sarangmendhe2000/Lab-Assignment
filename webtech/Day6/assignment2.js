let pos1 = 0 ;
let pos2 = 0;


let box1 = document.querySelector(".box1");
let box2 = document.querySelector(".box2");

let id = setInterval(()=>{

    pos1 += 5 ;
    pos2 += 5;

    box1.style.top = pos1 +"px";
    box1.style.left = pos1 + "px";

    box2.style.top = pos2 +"px";
    box2.style.right = pos2+"px";



},100)


setTimeout(()=>{
    clearInterval(id);
    console.log("Stop interval")
},9000) 