const express = require('express');

const f = require('fs');

let user = require('./MOCK_DATA.json');

const port = 3000;

const app = express();

//Get the request 

app.get('/', (req, res) => {

    res.send("Hello Express ! ")
})

app.get('/user', (req, res) => {

    res.json(user);
})

app.get('/user/:id', (req, res) => {

    const id = Number(req.params.id);

    const getId = user.find(

        getId => getId.id === id
    )

    return res.json(getId);
})


// Delete the particular ID 



app.delete('/user/delete/:id', (req, res) => {
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



// Post Method


app.use(express.json());

app.post('/user/adduser', (req, res) => {

    const data = req.body;

    const newUser = {

        id: user.length + 1,
        ...data
    };

    user.push(newUser);

    f.writeFile('./MOCK_DATA.json',

        JSON.stringify(user), (err) => {
            console.log(err);
        }
    )

    return res.json("Data Added");
})



//PUT Method 

app.use(express.json());

app.post('/user/adduser', (req, res) => {

    const data = req.body;

    const newUser = {

        id: user.length + 1,
        ...data
    };

    user.push(newUser);

    f.writeFile('./MOCK_DATA.json',

        JSON.stringify(user), (err) => {
            console.log(err);
        }
    )

    return res.json("Data Added");
})



//PUT Method 

app.put('/user/:id', (req, res) => {
    const userId = Number(req.params.id);
    const updatedData = req.body;

    // Use findIndex to get the index of the user in the array
    const userIndex = user.findIndex(u => u.id === userId);

    // CORRECT: Check if userIndex is not -1 (meaning the user was found)
    if (userIndex !== -1) {
        // CORRECT: Update the user object by correctly merging existing data with new data
        user[userIndex] = {
            ...user[userIndex],
            ...updatedData
        };

        // CORRECT: Write the updated data to the file, and send the response in the callback
        f.writeFile('./MOCK_DATA.json', JSON.stringify(user, null, 2), (err) => {
            if (err) {
                console.error("Error writing to file:", err);
                return res.status(500).json({ message: "Failed to save changes." });
            }
            res.status(200).json({
                message: 'User updated successfully',
                user: user[userIndex]
            });
        });
    } else {
        // User not found
        res.status(404).json({
            message: 'User not found'
        });
    }
});


app.listen(port);
console.log("Server start on port ", port);
