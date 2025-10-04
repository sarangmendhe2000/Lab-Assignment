// import e from "express";
import { useState } from "react"
export default function LoginPage()
{
    const[firstName , setFirstName]= useState("");
    const[lastName , setLastName] = useState("");
    const[email , setEmail] = useState("");
    const[password , setPassword]= useState("");
    const[submit , setSubmit]= useState([]);


    //Handle Functions


    const handleClick=(e)=>{
       e.preventDefault();
       const newEntry = {firstName , lastName , email , password};
       setSubmit([...submit , newEntry]);

       // Clear input Fields 
       setFirstName("");
       setLastName("");
       setEmail("");
       setPassword("");
    }

    return(
        <div>
            <h1>Login Page</h1>

            {/* Login form */}
            <form action="">

            <label>First Name</label>
            <input type="text"
            value={firstName}
            onChange={(e)=>setFirstName(e.target.value)} />

            <br /><br />

            <label >Last Name</label>
            <input type="text"
            value={lastName}
            onChange={(e)=>setLastName(e.target.value)}
            />
            <br /><br />
            <label >Email</label>
            <input type="email"
            value={email}
            onChange={(e)=>setEmail(e.target.value)}
             />
             <br /><br />

            <label>Password</label>
            <input type="password"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
            />
            <br /><br />
            <button onClick={handleClick}>Submit</button>
            </form>
            {/* Display Data */}
            {submit.length   && (
                <div>
            <h2> List</h2>

            <table border="2px">
                <thead>
                    <tr>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Email</th>
                        <th>Password</th>
                    </tr>
                </thead>
                <tbody>
                    {submit.map((val , index)=>{
                        return(
                        <tr key={index}>
                        <td>{val.firstName}</td>
                        <td>{val.lastName}</td>
                        <td>{val.email}</td>
                        <td>{val.password}</td>   
                    </tr>
                        )
})}
                    
                </tbody>
            </table>
        </div>
        )}
        </div>
    )
}