
$(document).ready(function(){


let xhr = new XMLHttpRequest();

xhr.open("GET", "https://jsonplaceholder.typicode.com/posts" , true);

xhr.onload= function()
{
    if(xhr.status===200)
    {
        let data = JSON.parse(xhr.responseText);

        // console.log(data);
        console.log(data[0].id , data[0].title);
        
       let tableBody = $("#tableBody")

        for(let i=0;i<data.length;i++)
        {
            let row = `
                    <tr>
                        <td> ${data[i].id} </td>
                        <td> ${data[i].title} </td>
                    </tr>
            `
            tableBody.append(row);
        }
    }
        else{
            alert("Error Loading data");
        }
}

xhr.send();

}

)