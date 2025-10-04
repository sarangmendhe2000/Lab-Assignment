let date = document.getElementById("date");
let times = document.getElementById("time");

var today = new Date();

console.log(today);

let dd = String(today.getDate());
let mm = String(today.getMonth()+1);
let yyyy = today.getFullYear();
let hours = String(today.getHours());
let min = String(today.getMinutes());
let sec = String(today.getSeconds());

let finalDate =dd+"/"+mm+"/"+yyyy;


console.log(dd,"/", mm,"/",yyyy);


let time =hours+":"+min+":"+sec;

console.log(hours,':',min,":",sec);

date.innerHTML = finalDate; 
times.innerHTML= time;