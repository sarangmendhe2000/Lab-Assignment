let fname=document.getElementById("fname");
let lname= document.getElementById("lname");
let age= document.getElementById("age");





function handleClick(event)
{
    event.preventDefault();
    
    console.log(fname.value.substring(0,2));
    console.log(lname.value.substring(lname.value.length-2, lname.length));
    console.log(age.value);

    let first_name= fname.value.substring(0,2)
    let last_name= lname.value.substring(lname.value.length-2, lname.length)
    let ages= age.value;

    document.getElementById("newUserName").innerHTML=first_name+last_name+ages;
  
}