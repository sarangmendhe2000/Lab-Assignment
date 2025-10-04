

function handleSubmit(event)
{
    event.preventDefault();

    const dataInput = document.getElementById('dataInput');
    const enterData = dataInput.value;

    console.log("Data submitted" , enterData);

    let number = enterData;
    let table =1;

    const output = document.getElementById("printTable");
     output.innerHTML= " ";
     
    if(!isNaN(number))
    {
        for(let i=1;i<=10;i++)
        {
           result = number*i
           console.log(result)
           
            
           output.innerHTML += "\n" + result;
        }
    }
}
