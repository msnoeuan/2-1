// ./src/App.jsx
import { useState } from "react"
import { BrowserRouter, Routes, Route } from "react-router-dom"
import { GlobalStyle } from "./AppStyle.js"
import UserContext from "./context/UserContext.jsx"
import Home from "./pages/Home/Home.jsx"
import BlogDetail from "./pages/BlogDetail/BlogDetail"
// import data from "./database/data.json"
// import "./app.css"

function App() {
  const [userId, setUserId] = useState(1)
  const [isLogin, setIsLogin] = useState(true)
  // console.log(data)
  return (
    <>
      <GlobalStyle/>
      <UserContext.Provider value = {{userId, isLogin}}>
        <BrowserRouter>
          <Routes>
            <Route path = '/' element = {<Home />} />
            <Route path = '/blog/ :id' element = {<BlogDetail />} />
          </Routes>
        </BrowserRouter>
      </UserContext.Provider>

    </>
  );
}

export default App