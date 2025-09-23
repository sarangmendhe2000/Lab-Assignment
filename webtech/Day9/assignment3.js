$(document).ready(function(){

 

    let tableBody = $("#tableBody");

    $("#btn").click(function(){
           let value = parseInt($("#id").val());
    console.log(value)


    let obj = new XMLHttpRequest();

    obj.open("GET" , "https://jsonplaceholder.typicode.com/posts" , false);

    obj.onload = function()
    {
        let data = JSON.parse(obj.responseText);

        console.log(data)

        var found = false;
    

        for(let i=0;i<data.length;i++)
        {
            if(data[i].id == value )
            {
                let row = `

                    <tr>
                      <td>${data[i].id}</td>
                      <td>${data[i].title}</td>
                    </tr>  
                
                `
                tableBody.append(row);

               found =true;
               break;
            }
           
        }
        if(!found)
           {
            alert("Data not found");
           }

    }
    obj.send();

    })
})