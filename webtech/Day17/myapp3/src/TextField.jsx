import React from "react"
import { useState } from "react"


export function TextField()
{

    const[inputText , setInputText] = useState("");
    const[items , setItems] = useState([]);

     {/* //Handle typing in input  */}

             const handleChange=(e)=>{
                setInputText(e.target.value);
             }

    //  Handle onBlur Event    
    
    const handleBlur=()=>{
        if(inputText.trim() !=="")
        {
            setItems((prevItems) => [...prevItems , inputText])
            setInputText("");
        }
    };



    return (

        <div className="textField">
            
            <h2>Enter Data</h2>
            <input
             type="text"
             placeholder="Type here" 
             value= {inputText}
             onChange={handleChange}
             onBlur={handleBlur}

             />

             <h3>Ordered List</h3>
             <ol>
                {
                    items.map((item , index)=>{
                        return(
                        <li key={index} >{item}</li>
                        )
                    })
                }
             </ol>
        </div>


        )
        
        
    
}
