const http = require('http');
const url = require("url");

// Todo's Array (Global Scope)
const todos = [
    { id: 1, text: 'Learn Node.js', completed: false },
    { id: 2, text: 'Build a web server', completed: true },
    { id: 3, text: 'Deploy Application', completed: false }
];

// Creating server
const server = http.createServer((req, res) => {
    const parsedUrl = url.parse(req.url, true);
    const path = parsedUrl.pathname;

    // Handle the '/todos' path
    // Corrected the path check from './todos' to '/todos'

    if (path === '/todos') {
        // Set header and end the response inside the correct block
        res.writeHead(200, {
            'Content-Type': 'application/json'
        });
        res.end(JSON.stringify(todos));
    } else if (path.startsWith('/todos/')) {
        // Handle the '/todos/:id' path
        const id = parseInt(path.split('/')[2]);

        // Use the global 'todos' array
        const todo = todos.find(t => t.id === id);

        if (todo) {
            res.writeHead(200, {
                'Content-Type': 'application/json'
            });
            res.end(JSON.stringify(todo));
        } else {
            // Send 404 for not found
            res.writeHead(404, {
                'Content-Type': 'application/json'
            });
            res.end(JSON.stringify({
                error: 'Not Found'
            }));
        }
    } else {
        // Handle any other path
        res.writeHead(404, {
            'Content-Type': 'application/json'
        });
        res.end(JSON.stringify({
            error: 'Not Found'
        }));
    }
});

// Starting the server
const port = 3000;
server.listen(port, () => {
    // Corrected the console log message
    console.log("Server is running at the port :", port);
});