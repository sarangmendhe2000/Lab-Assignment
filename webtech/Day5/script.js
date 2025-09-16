// validate function 

function Validate(name, age, email) {
    let isValid = true;


    //Validation 

    if (name === "") {
        document.getElementById("nameError").style.visibility = "visible"
        isValid = false;


    }
    else {
        document.getElementById("nameError").style.visibility = "hidden"

    }

    if (age === "") {
        document.getElementById("ageError").style.visibility = "visible"
        document.getElementById("ageError18").style.visibility = "hidden"

        isValid = false;

    }

    else if (isNaN(Number(age)) || Number(age) < 18) {
 
        document.getElementById("ageError18").style.visibility = "visible"
        document.getElementById("ageError").style.visibility = "hidden"

        isValid = false;
    }
    else {
        document.getElementById("ageError18").style.visibility = "hidden"
    }

    if (email === "") {
        document.getElementById("emailError").style.visibility = "visible"
        isValid = false;
    }
    else {
        document.getElementById("emailError").style.visibility = "hidden"
    }

    return isValid;


}


function SubmitEvent() {
    let name = document.getElementById("name").value
    let age = document.getElementById("age").value
    let email = document.getElementById("email").value

    console.log(name, email, age);

    let valid = Validate(name, age, email);

    if (valid) {
        let tableBody = document.getElementById("tableBody");
        let newrow = document.createElement("tr");

        newrow.innerHTML =
            `
                <td>${name}</td>
                <td>${age}</td>
                <td>${email}</td>
                <td>
                    <button onclick="editRow(this)">Edit</button>
                    <button onclick="deleteRow(this)">Delete</button>
                </td>
    
    
    `;
       tableBody.appendChild(newrow);
    }


    //clear field 

    document.getElementById("name").value="";
    document.getElementById("age").value="";
    document.getElementById("email").value="";


   

}

 //Delete Data

    function deleteRow(btn)
    {
        let row = btn.parentNode.parentNode;
        console.log("what is inside btn - ", btn);
        row.remove();
    }

 // Edit Data
 
 function editRow(btn)
 {
    let row = btn.parentNode.parentNode
    console.log(row);

    let name = row.cells[0].textContent;
    let age = row.cells[1].textContent;
    let email = row.cells[2].textContent;

    //Put the value back into the form 

    document.getElementById("name").value = name;
    document.getElementById("age").value = age;
    document.getElementById("email").value= email;


    // Remove the old row 

    row.remove();

 }
