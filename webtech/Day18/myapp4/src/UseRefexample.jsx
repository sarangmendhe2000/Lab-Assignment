import { useRef , useState } from "react"

export function UseRefexample()
{
    const count = useRef(0)
    const[render , setRender]= useState(0)

    const handleClick=()=>
    {
        count.current= count.current+1;
        console.log("Count is ", count.current)
    }



    return(
        <div>
         
         <h2>Count(ref value) : {count.current}</h2>
         <button onClick={handleClick}>Increase Ref</button>
         <button onClick={()=> setRender(render+1)}>Re-render</button>
        </div>
    )
}