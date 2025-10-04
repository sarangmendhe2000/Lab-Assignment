import React from "react"
import { useState } from "react"

export function DataConversion() {

    const [inputText, setInputText] = useState("");
    const [outputText, setOutputText] = useState("");
    const [conversion, setConversion] = useState("");

    //Title Case Function

    const toTitleCase = (str) => {

        return str.toLowerCase()
            .split(" ")
            .map((word) => {
                return word.charAt(0).toUpperCase() + word.slice(1)
            })
            .join(" ");

    }




    // Event Input

    const handleChange = (e) => {

        setInputText(e.target.value);
        // setOutputText("");


        //Apply conversion

        if (conversion === "upperCase") {
            setOutputText(e.target.value.toUpperCase())
        }
        else if (conversion === "lowerCase") {
            setOutputText(e.target.value.toLowerCase());
        }
        else if (conversion === "titleCase") {
            setOutputText(toTitleCase(e.target.value));
        }
        else {
            setOutputText(e.target.value)
        }
    }

    // Handle radio buttons



    const handleConversion = (e) => {

        const selected = e.target.value;
        setConversion(selected);


        if (selected === "upperCase") {
            setOutputText(inputText.toUpperCase());
        }
        else if (selected === "lowerCase") {
            setOutputText(inputText.toLowerCase());
        }
        else if (selected === "titleCase") {
            setOutputText(toTitleCase(inputText))
        }
    }


    return (
        <div className="conversion">

            <div className="heading">
                <h1>DataCoversion will do here</h1>
            </div>

            <br /><br />

            <div >


                <input className="inputText" type="text"
                    placeholder="type text"
                    value={inputText}
                    onChange={handleChange}
                />
                <br />


                <p>You give the input -  {inputText}</p>

                <label>
                    <input type="radio"
                        name="Conversion"
                        value="upperCase"
                        checked={conversion === "upperCase"}
                        onChange={handleConversion}
                    />
                    UpperCase
                </label>

                <label>

                    <input type="radio"
                        name="Conversion"
                        value="lowerCase"
                        checked={conversion === "lowerCase"}
                        onChange={handleConversion}
                    />

                    LowerCase
                </label>

                <label>
                    <input type="radio"
                        name="Conversion"
                        value="titleCase"
                        checked={conversion === "titleCase"}
                        onChange={handleConversion}
                    />

                    TitlCase

                </label>
            </div>



            <div>
                <h4>Converted Output</h4>
                <div className="output">
                    <p>{outputText}</p>
                </div>
                
            </div>

        </div>

    )
}