let arr = [];

function updateArray()
{
    document.getElementById("arrayOutput").innerText = JSON.stringify(arr) ; 
}

function addEnd()
{
    let val = Number(document.getElementById("num").value)
    arr.push(val);
    updateArray();
}

function addStart()
{
    let val = Number(document.getElementById("num").value)
    arr.unshift(val);
    updateArray()
}

function deleteEnd()
{
    arr.pop();
    updateArray();
}

function deleteStart()
{
    arr.shift()
    updateArray();
}
function odd()
{
    let odd = arr.filter((e) =>
    e%2 !==0
    )
     document.getElementById("result").innerText = odd;

}

function even()
{
    let even = arr.filter((e)=>
        e%2===0
    )

    document.getElementById("result").innerText = even;
}
