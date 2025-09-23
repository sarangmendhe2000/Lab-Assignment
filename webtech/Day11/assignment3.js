
import { createServer } from 'http';

const server = createServer((req , res)=>{

    res.writeHead(200 , {

            'content-type' : 'text/html'

    })

    res.write("Hello ")

    res.end();
})

server.listen(8080);