import React, { useContext } from 'react';
import {Switch, Route, Redirect} from 'react-router-dom';
import TopMenu from './components/TopMenu';
import Profile from "./pages/Profile";
import Home from "./pages/Home";
import SignIn from "./pages/SignIn";
import SignUp from "./pages/SignUp";
import './App.css';
import { AuthContext } from "./context/AuthContext";

function App() {
  const isAuth = useContext(AuthContext);
  
  return (
      <>
          <TopMenu/>
          <div className="content">
              <Switch>
                  <Route exact path="/">
                      <Home/>
                  </Route>
                  <Route path="/profile">
                      {isAuth ? <Profile/> : <Redirect to="/"/>}
                  </Route>
                  <Route exact path="/signin">
                      <SignIn/>
                  </Route>
                  <Route exact path="/signup">
                      <SignUp/>
                  </Route>
              </Switch>
          </div>
      </>
  );
}

export default App;
