
 let count = 0;
function Count(btn)
{
    if(count<10)
    {
    count++;
    


    document.getElementById("count").innerHTML =
    `
        Count  - ${count}
    
    `
    }
    else
    {
        btn.disabled = true;
    }
    

}