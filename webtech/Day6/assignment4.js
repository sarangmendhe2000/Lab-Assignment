function call(event)
{

    event.preventDefault();

    //Get the details 

    let fname = document.getElementById("fname").value;
    let lname = document.getElementById("lname").value;
    let age = document.getElementById("age").value;


    //Creating Username 
    let firstpart = fname.substring(0,2).toLowerCase()
    let lastpart = lname.slice(-2).toLowerCase();


    let userName = firstpart+lastpart+age;


    document.getElementById("userName").innerText = "Your UserName is - " +userName;


}