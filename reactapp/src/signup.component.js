import React, { Component } from "react";

export default class SignUp extends Component {
    render() {
        return (
            <form>
                <h3>Register</h3>

                <div className="form-group">
                <input type="text" className="form-control" placeholder="Enter admin/user" />
                </div>

                <div className="form-group">
                    
                    <input type="text" className="form-control" placeholder="Enter email" />
                </div>

                <div className="form-group">

                    <input type="email" className="form-control" placeholder="Enter Username" />
                </div>
                
                <div className="form-group">

                    <input type="number" className="form-control" placeholder="Enter mobilenumber" />
                </div>

                <div className="form-group">
                    <input type="password" className="form-control" placeholder="Enter password" />
                </div>
                
                <div className="form-group">
                    <input type="password" className="form-control" placeholder="Confirm password " />
                </div>

                <button type="submit" className="btn btn-dark btn-lg btn-block">Register</button>
                <p className="forgot-password text-right">
                    Already registered <a href="#">log in?</a>
                </p>
            </form>
        );
    }
}