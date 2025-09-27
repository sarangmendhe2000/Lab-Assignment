import React from 'react';
import { Addition } from './Addition';
import { Substraction } from './Substraction';
import { Multiplication } from './Multiplication';
import { Division } from './Division';
import './App.css';


export function UserCalculator({num1 , num2 , operation})
{
    let result;
    let operandSymbol = '';

    switch(operation.toLowerCase())
    {
        case 'add': 
        result = Addition(num1 ,num2)
        operandSymbol = '+'
        break;

        case 'substract': 
        result = Substraction(num1 ,num2)
        operandSymbol = '-'
        break;

        case 'multiply': 
        result = Multiplication(num1 ,num2)
        operandSymbol = '*'
        break;

        case 'division': 
        result = Division(num1 ,num2)
        operandSymbol = '/'
        break;

         default:
            result = "Invalid Operation"
            operandSymbol='?'

    }

    return(

            <div>
                <h1>Targeted Calculator ( {operation} Mode)</h1>
                <p>Number is  :{num1}  and {num2}</p>
                <h2>
                {num1} {operandSymbol} {num2} = {result} </h2>
            




            </div>

    )

}