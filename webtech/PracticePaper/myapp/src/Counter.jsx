import { useState } from "react"


export function Counter()
{
    const[state , setState] = useState(0);

    function handleClick()
    {
        setState(prev => prev+1);
    }

    return(
        <div>
            Counter

            <button onClick={handleClick}>Increment</button>
            <p>Count - {state}</p>
        </div>
    )
}