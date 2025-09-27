// import logo from './logo.svg';
import Factorial from './Factorial'
import './App.css';

function App(props) {

   const inputNumber = props.number;
  //  Calling 

   const result = Factorial(inputNumber)

 
  return (
    <div className='fact' >
      

        <h1>Factorial Calculator</h1>
        <h2>Input Number : {inputNumber}</h2>
        <p>Result : {result}</p>

    </div>

  
  );
}

export default App;
