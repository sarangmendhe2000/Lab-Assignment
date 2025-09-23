console.log("Everything working fine...")


$(document).ready(function(){

    $("#btn").click(function()
{
    let xhr = new XMLHttpRequest();

    xhr.open("GET", "https://fake-json-api.mock.beeceptor.com/users", true);

    xhr.onload = function () {
        if (xhr.status === 200) {
            var data = JSON.parse(xhr.responseText);
            console.log(data);
            $("#p1").text(JSON.stringify(data , null , 2));

        }
        else{
            $("#p1").text("Error load handling");
        }
}
xhr.send();


})
})
