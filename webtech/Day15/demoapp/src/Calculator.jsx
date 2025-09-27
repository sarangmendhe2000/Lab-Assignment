import React from 'react';
import { Addition } from './Addition';
import { Substraction } from './Substraction';
import { Multiplication } from './Multiplication';
import { Division } from './Division';
import './App.css';
import { UserCalculator } from './UserCalculator';
import './a.css'

function Calculator({ num1, num2 }) {

    const a = { num1 };
    const b = { num2 };

    const Result = Addition(num1, num2)
    const Result2 = Substraction(num1 , num2)
    const Result3 = Multiplication(num1 , num2)
    const Result4 = Division(num1 , num2)




    return (
        <div>
            <h1>Calculator</h1>
            <p>Number is  :{num1}  and {num2}</p>
            <h3>Addition -{Result}</h3>
            <h3>Substraction  -{Result2}</h3>
            <h3>Multiplication  -{Result3}</h3>
            <h3>Division  -{Result4}</h3>
           
        </div>


    );
}

export default Calculator;
