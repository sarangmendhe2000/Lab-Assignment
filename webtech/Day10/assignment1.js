console.log('Everting working fine')

$(document).ready(function(){

   $("#btn").click(function(){

    $("#result").load("https://jsonplaceholder.typicode.com/posts/1")
   }) 

})