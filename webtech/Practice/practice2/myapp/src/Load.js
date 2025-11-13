import { Home } from "./Home";
import { AboutUs } from "./AboutUs";
import Login from "./Login";
import {BrowserRouter ,Routes, Route,NavLink} from "react-router-dom";
function Load(){


    return(
       
<BrowserRouter>

<NavLink to="/">Home</NavLink>|{" "}

<NavLink to="/aboutus">AboutUs</NavLink>|{" "}
<NavLink to="/login">Login</NavLink>


<Routes>
<Route path ="/" element={<Home/>}/>
<Route path ="/aboutus" element={<AboutUs/>}/>
<Route path ="/login" element={<Login/>}/>


</Routes>


</BrowserRouter>



    );
}
export default Load;