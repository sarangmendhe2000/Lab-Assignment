import React, { useEffect } from "react"
import { useState } from "react"
export function Counter()
{
    const[counter, setCounter] = useState(0);
    const[history , setHistory] = useState([]);

    //Update history 

    useEffect(()=>{
        setHistory((prevHistory) => [...prevHistory , counter]);
    } , [counter])

    //Increment function
       const  increment =()=>{
        
              setCounter(counter+1);
        }
        console.log(counter)
      


    return (

        <div className="counter">
            
            <h1>Counter Application</h1>
            <p>Current Count : {counter}</p>
            <button onClick={increment}>Increment</button>
            
            {/* Creating Table  */}
            <table border="2px solid black">
                <thead>
                    <tr>
                        <th>Numbers</th>
                    </tr>
                    
                </thead>
                <tbody>
                    {history.map((num , index)=>{
                        return(
                        <tr key={index}>
                            <td>{num}</td>
                        </tr>
                        )
                    })}
                  
                </tbody>
            </table>
        </div>
    )
}