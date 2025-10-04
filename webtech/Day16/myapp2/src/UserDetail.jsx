import { Graduate } from "./Graduate"
import { Pg } from "./Pg"
import { Undergraduate } from "./Undergraduate"
import React from "react"
import { useState } from "react"


export function UserDetail()
{

    // Main Component


    
        const [names , setNames] = useState("");
        const[email, setEmail] = useState("");
        const[selectedValue , setSelectedValue] = useState("");


        const handleChange=(e)=>{
            setSelectedValue(e.target.value);
        };
    

    return(
        <div className="conversion2">
                <h1>User Detail Form</h1>
            <br /><br />

            {/* Accept user Details  */}
            
            <label> <b>Enter Your Name Here - </b>
            </label>
            <input type="text"
            value={names}    
            placeholder="Enter Name"
            onChange={(e)=>{
                return setNames(e.target.value)
            }}
            
            />
            <br /><br />

            
            <br /><br />

            <label>Enter Email</label>
            <input type="email" 
            value={email}
            placeholder="Email Address"
            onChange={(e)=>{
                setEmail(e.target.value)
            }}
            
            />

            <br /><br />
            <label >Select Course</label>
            <select value={selectedValue} onChange={handleChange}>

                <option value="">Choose</option>
                <option value="graduate">Graduate</option>
                <option value="undergraduate">UG</option>
                <option value="postgraduate">PG</option>


            </select>

            {/* Conditional Rendering  */}

            {selectedValue === "graduate"  && <Graduate/>}
            {selectedValue === "undergraduate" && <Undergraduate/>}
            {selectedValue === "postgraduate" && <Pg/>}
          
        </div>
    )
}