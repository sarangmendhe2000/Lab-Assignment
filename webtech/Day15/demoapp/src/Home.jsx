import React from "react"
import { useState } from "react"
function Home()
{
    const[inputText , setInputText ] = useState("");

    const[outputText, setOutputText] = useState("");

    // Event Handler 

    const handleChange=(e)=>
    {
        setInputText(e.target.value);

        //Reset the output text whenever the input changes
        setOutputText("");
    }

     const handleLowerCase=()=>{

        const lowercase = inputText.toLowerCase();
        console.log("In lowerCase -  ", lowercase);
        setOutputText(lowercase);
     }

     const handleUpperCase=()=>{

        const uppercase = inputText.toUpperCase();
        console.log("In upperCase - " , uppercase);
        setOutputText(uppercase);
     }
    

    return(
        <div>
           <h1> Now Its Time To  Show The Super Power of Functional Component - Hooks</h1>

            <h5>UseState Hook</h5>

            <input type="text"
            
            value={inputText}
            
            onChange={handleChange}

            placeholder="Example - Hello"

            
            />

            <p>You give the input - {inputText}</p>
            
            <button onClick={handleLowerCase}>
                Convert to Lower Case
            </button>

            <button onClick={handleUpperCase}>
                Convert to Upper Case
            </button>
        
            {/* // Output Display */}


            <div>
                Your final output will be - {outputText}
            </div>
        </div>
    )
}
export default Home