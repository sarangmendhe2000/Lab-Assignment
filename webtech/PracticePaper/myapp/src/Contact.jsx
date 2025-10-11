import React from "react";

class Contact extends React.Component{

    constructor(props)
    {
        super(props);
    }

    render()
    {
        return(
            <div>
                This is Contact Us Page

                <h3>Contact Details - </h3>
                <h5>Mobile - {this.props.number1}</h5>
                <h5>Mobile - {this.props.number2}</h5>


            </div>
        )
    }
}

export default Contact