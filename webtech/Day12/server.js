const http = require ('http');
const url = require('url');
const fs = require('fs');

// Create Server 

const server = http.createServer((req, res) =>{

   // query parameters

   const parsedUrl = url.parse(req.url , true);
   const query = parsedUrl.query;

   // Extract first name and last name from query 

   const fName = query.fName || 'Guest';
   const lName = query.lName || '' ;

   // Form the persinalized Message

   const greeting = `

        Hello  ${fName} ${lName}
   
   `

   // Read the HTML File

   fs.readFile('index.html' ,(err , data)=>{

    if(err)
    {
        res.writeHead(500 , 
            {
                'Content-Type' : 'text'
            }

            
        )

        res.end('error loading page');
        return;
    }

    //Replace the tag with greeting 

    let htmlContent = data.toString();
    htmlContent = htmlContent.replace('<h1></h1>' , `<h1>${greeting}</h1>`)


    res.writeHead(200 , {

        'Content-Type' : 'text/html'
        
    })

    res.end(htmlContent);
   })



})

const port = 3000 ;


server.listen(port , ()=>{
 
     console.log("Server is running at port number :" , port) 
})