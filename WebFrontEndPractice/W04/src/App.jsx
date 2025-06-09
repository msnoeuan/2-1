import './App.css'
import Destructuring from './components/Destructuring'
import Food from './components/Food'
import FoodImage from './components/FoodImage'
import { Function01, Function02, Function03 } from './components/Function'
import Myprops from './components/Myprops'
import Profile from './components/Profile'
import Sandwich from './components/Sandwich'

function App() {

  return (
    <>
      <Destructuring />

      <hr /> 

      <Food fav = "kimchi" />
      <Food fav = "ramen" />
      <Food fav = "chukumi" />

      <hr /> 
      
      <FoodImage />

      <hr /> 
      
      <Function01 />
      <Function02 />
      <Function03 />

      <hr /> 
      
      <Myprops 
        text = "메일"
        color = "red"
      />
      <Myprops 
        text = "카페"
      />
      <Myprops 
        text = "블로그"
        color = "grey"
      />

      <hr /> 
      
      <Profile 
        name = "승민"
        location = "서울시 구로구"
      />

      <hr />

      <Sandwich />
    </>
  )
}

export default App
