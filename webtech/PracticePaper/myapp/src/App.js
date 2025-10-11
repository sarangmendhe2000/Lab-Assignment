import './App.css';
import {Link} from "react-router-dom"


function App() {
  return (
    
    <div>
      Please Click the Links given Below - 
      <Link to = "/about">About</Link>
      <Link to = "/home">Home</Link>
      <Link to = "/contact">Contact</Link>
      <Link to = "/counter">Counter</Link>

    </div>
  );
}

export default App;
