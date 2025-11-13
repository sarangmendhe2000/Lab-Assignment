import React, { useState } from "react";

export default function DisplayData() {
  const [state, setState] = useState([]); // initialize as empty array

  const handleFetch = () => {
    fetch("https://jsonplaceholder.typicode.com/todos")
      .then((response) => response.json())
      .then((result) => {
        console.log("Fetched Data:", result);
        setState(result); // store array of todos
      })
      .catch((error) => {
        console.log("Error Fetching Data:", error);
      });
  };  
   function abc(){
     const response = await axios.get('https://jsonplaceholder.typicode.com/posts/1');
  return (
    <div>
      <button onClick={handleFetch}>Fetch Data</button>

      {state.length > 0 ? (
        <table
          border="1"
          style={{ marginTop: "20px", borderCollapse: "collapse", width: "80%" }}
        >
          <thead>
            <tr>
              <th>ID</th>
              <th>Title</th>
              <th>Completed</th>
            </tr>
          </thead>

          <tbody>
            {state.map((todo) => (
              <tr key={todo.id}>
                <td>{todo.id}</td>
                <td>{todo.title}</td>
                <td>{todo.completed ? "Yes" : "No"}</td>
                <link  button href={abc}axios />
              </tr>
            ))}
          </tbody>
        </table>
      ) : (
        <p>No data yet. Click the button 👆</p>
      )}
    </div>
  );
}
