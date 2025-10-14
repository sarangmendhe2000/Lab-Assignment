import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import Home from './Home';
import About from './About';
import Contact from './Contact';
import { Counter } from './Counter';

import { createBrowserRouter , RouterProvider } from 'react-router-dom'; 

const root = ReactDOM.createRoot(document.getElementById('root'));

const appRouter = createBrowserRouter([

  {
    path:"/",
    element:<App/>
  },
  {
     path: "/home",
     element: <Home/>
  },
  {
    path:"/about",
    element: <About/>
  },
  {
    path:"/contact",
    element:<Contact  number1 ={8959752707} number2 ={9406660270}/>
  },

  {
    path:"/counter",
    element:  <Counter/>
  }
]
)
root.render(
  <React.StrictMode>
    <RouterProvider router = {appRouter}>
    </RouterProvider>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
