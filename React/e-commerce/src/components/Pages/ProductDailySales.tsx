import {useNavigate} from "react-router-dom";
import React, {useEffect} from "react";
import axios from "axios";
import base_url from "../../api/bootapi";
import un_auth from "../../unAuthRedirect/unAuth";
import VendorNavbar from "../Navbar/VendorNavbar";
import EditProduct from "../Forms/EditProducts2";
import SiteProductDailySales from "../Body/siteProductDailySales";
import {AdminNavbar} from "../Navbar/AdminNavbar";

const ProductDailySales = () => {
    var navigate = useNavigate();

    useEffect(() => {
        let token= "Bearer "+localStorage.getItem("token");
        console.log(token);
        axios.post(`${base_url}tokenValidation`,"data",{
            headers: {
                'Authorization': token,
                'Content-Type': 'application/json',
                'Accept': 'application/json'
            }}).then(
            (response)=>{
                //navigate("/customer/index");
                if(localStorage.getItem("userType_session") != "admin"){
                    navigate(`${un_auth}`); //un_auth
                }
            },(error)=>{

                navigate(`${un_auth}`);
                let res:string[]=Object.values(error.response.data);
                let errorMsg:string="";
            }
        );
    }, [])

    return (
        <div>
            <AdminNavbar/>
            <SiteProductDailySales/>
        </div>
    );
}

export default ProductDailySales;