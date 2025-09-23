$(document).ready(function(){

    //Get the text from h1

    let getText = $("#hello").text();

    // Insert italic version in p1
    
    $("#p1").html("<i>" + getText + "</i>");

    //Insert underline in p2 

    $("#p2").html("<u>" + getText + "</u>")

}
)