  function call(event)
  {

    event.preventDefault();

    //Get the value from the input field 

    fname = document.getElementById("fname").value ;
    lname = document.getElementById("lname").value ;
    age = document.getElementById("age").value;


    // Store data in an object 

    let student = {
        "fname" : fname ,
        "lname" : lname, 
        "age" : age
    };

    // Convert data into json 

    let jsonData = JSON.stringify(student);

    console.log(" Json Data ",jsonData);



    //Append it into the table 

    let tableBody = document.getElementById("tbody");
    let newRow = document.createElement("tr");

    newRow.innerHTML = 
        `
                        <td>${fname}</td>
                        <td>${lname}</td>
                        <td>${age}</td>
        `

        tableBody.appendChild(newRow);


        // Clear field 

        document.getElementById("fname").value = "";
        document.getElementById("lname").value = "";
        document.getElementById("age").value= "";





  }