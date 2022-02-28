import React from 'react';
import {Routes,Route} from "react-router-dom";
import App from './App';
import UserRegistration from './components/Forms/UserRegistration';
import Navbar from './components/Navbar/Navbar';
import RegOption from './components/RegOption';
function MainRoutes(){
    return(
        <div>
            <Routes>
                
                    <Route path="/" element={<Navbar/>}/>
                    <Route path="/uReg" element={<UserRegistration/>}/>
            </Routes>
        </div>
    )
}

export default MainRoutes;