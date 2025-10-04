import { useState , useEffect  , useCallback} from "react"

export function Password() {

    //Set all States
    const [length, setLength] = useState(12);
    const [includeNumber, setIncludeNumber] = useState(false);
    const [includeSymbol, setIncludeSymbol] = useState(false);
    const[password , setPassword] = useState("")

    //Handle functions

    function generatePassword()
    {
        let characters = "QWERTYUIOPLKJHGFDSAZXCVBNMzxcvbnmlkjhgfdsaqwertyuiop";
        if(includeNumber)
        {
            characters = characters+'0123456789';
        }
        if(includeSymbol)
        {
            characters= characters+'!@#$%^&*()_+'
        }

        let newPassword ='';
        for(let i=0;i<length;i++)
        {
            newPassword += characters.charAt(
                
                Math.floor(Math.random() * characters.length)
            )
        }
        console.log(newPassword);
        setPassword(newPassword);
    }

    //To get the output after every render..
    useEffect(()=>{
        generatePassword()
    }, [length , includeNumber , includeSymbol])

    //use useCallback function

    useCallback(()=> {generatePassword()}, [length , includeNumber , includeSymbol] )
    


    return (
        <div className="password">
            <h1>Random Password Generator</h1>
            <label >Enter size of Password</label>
            <input type="number"
                value={length}
                placeholder="size"
                onChange={(e)=>{
                    return setLength(Number(e.target.value))
                }}
                min="4"
                max="20"
            />
            <br /><br />



            <input type="checkbox"
                checked={includeNumber}
                onChange={()=> setIncludeNumber(!includeNumber)}
            />

            <label>Include Number</label>

            <br /><br />

            <input type="checkbox"

                checked={includeSymbol}
                onChange={()=>setIncludeSymbol(!includeSymbol)}
            />
            <label>Include Symbol</label>
            <br /><br />

            <label>Password Generated </label>
            <br /><br />

            <input type="text"
            value={password} />
            <br /><br />
            <button onClick={generatePassword}>Generate password</button>

        </div>

    )
}