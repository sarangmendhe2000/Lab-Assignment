
import React from 'react'; 

import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom';


import Home from './home.js';
import Contact from './contact.js';
import Login from './login.js';

function App() {
    return (
        <Router>
          
            <nav>
                <Link to="/">Home</Link> | {' '}
                <Link to="/contact">Contact</Link> | {' '}
                <Link to="/login">Login</Link>
            </nav>

            <div className="content">
                <Routes>
               
                    <Route path="/" element={<Home />} />
                 
                    <Route path="/contact" element={<Contact />} />
                    
                    <Route path="/login" element={<Login />} />

                    <Route path="*" element={<h1>404 - Page Not Found</h1>} />
                </Routes>
            </div>
        </Router>
    );
}
