console.log("Working properly");

function Validate()
{
    let name = document.forms["form1"]["studName"].value;
    let age = document.forms["form1"]["studAge"].value;


    console.log(name , age);

    if(name.trim()==="")
    {
        document.getElementsByClassName("errormessage")[0].style.visibility= 'visible' ;
        return false;
    }

    else
    {
        document.getElementsByClassName("errormessage")[0].style.visibility= 'hidden';

        if(age === "")
        {
            console.log("Please eneter a valid age");
            document.getElementsByClassName("errormessage")[2].style.visibility= 'visible'
            return false;
        }

       else if(age<18 )
        {
            console.log("Age validation failed: Age is less than 18");
            document.getElementsByClassName("errormessage")[1].style.visibility= 'visible'
             return false;
        }
       
        else
        {
            document.getElementsByClassName("errormessage")[1].style.visibility = 'hidden'
             document.forms["form1"].action="form.html"
             alert("Form Submitted successfully ! Thank you ")
            return true;
        }
           
        

        
       
    }

    
    
}