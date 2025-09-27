const express = require('express');
const f = require('fs');

let user = require('./MOCK_DATA.json');
const { json } = require('stream/consumers');

const port = 8080;

const app = express();

//Get the request 

app.get('/' , (req, res)=>{

    res.send("Hello Express ! ")
})

app.get('/user' , (req , res)=>{

    res.json(user);
})

app.get('/user/:id' , (req,res)=>{

    const id = Number(req.params.id);

    const getId = user.find(

        getId => getId.id === id
    )

    return res.json(getId);
})


// Delete the particular ID 



app.delete('/user/delete/:id' , (req,res) =>{
    const id = Number(req.params.id);

    const initialLength = user.length;

    // Correctly uses filter() to create a NEW array without the user
    user = user.filter(u => u.id !== id); 

    if (user.length < initialLength) {
        // Successful deletion
        return res.status(204).send(); // Sends 204 No Content
    } else {
        // User not found
        return res.status(404).json({ message: `User with id ${id} not found.` });
    }
})


// Alternative delete code - 

// app.delete('/user/delete/:id' , (req,res) =>{
//     const id = Number(req.params.id);

//     const userIndex = user.findIndex(u => u.id === id);

//     if (userIndex === -1) {
//         return res.status(404).json({ message: `User with id ${id} not found.` });
//     }

//     const [deletedUser] = user.splice(userIndex , 1); 

//     return res.status(204).send(); 
// });






