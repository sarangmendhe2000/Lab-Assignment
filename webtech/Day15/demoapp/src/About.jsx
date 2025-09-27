import React from 'react';
class About extends React.Component{


    constructor(props)
    {
        super(props);

        console.log("parent constructor is called");

        this.state = {


            inputText: props.initialText || "",
            //New State variable to hold the converted value
            outputText: "" 
            // userInfo:{

            //     name: "Dummy name",
            //     id: "You will get the data soon..."

            // }

            
        };

        this.handleInputChange = this.handleInputChange.bind(this);
        this.handleUpperCase = this.handleUpperCase.bind(this);
        this.handleLowerCase= this.handleLowerCase.bind(this);    
    }

    //Handle events 

    handleInputChange(e){
        this.setState({
            inputText: e.target.value,
            outputText:""
        });
    }

    handleUpperCase(e)
    {
        const upperText = this.state.inputText.toUpperCase();
        console.log("UpperCase Output : - " , upperText);
        this.setState({outputText:upperText})

    }

    handleLowerCase(e)
    {
        const lowerText = this.state.inputText.toLowerCase();
        console.log("LowerCase Output : - " , lowerText);
        this.setState({outputText:lowerText});
    }
    
    render(){
           const { inputText , outputText } = this.state;
    return(
        <div>
         

            <h1>Wel-Come to the World of class Component</h1>

            <h2>Hello Welcome to about Page </h2>
            <h4>Know more About us </h4>
            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Ducimus perferendis, commodi laboriosam obcaecati quia molestiae! Perferendis dicta dolores omnis dolore esse fuga amet non quia ad. Eveniet doloremque voluptatem itaque odio magni.</p>


            {/* Creating Buttons */}

            <input type="text" 
            
                value={inputText}
                onChange={this.handleInputChange}
                placeholder='Hello World'
            />

            <p>{inputText}</p>

            <button onClick={this.handleUpperCase}>

            Convert to UpperCase
            </button>

            <button onClick={this.handleLowerCase}>
                Convert to LowerCase
            </button>
            
            <div>
                <p>After converting it - {outputText}</p>
            </div>
            
        
        </div>
    )
}
}

export default About;