import './App.css'
import EvenOdd from './components/EvenOdd'
import HelloReact from './components/HelloReact'
import InLineStyle from './components/InLineStyle'
import LoginButton from './components/LoginButton'
import MyIntroApp from './components/MyIntroApp'
import { Resume, Privacy, WorkSkills, Career, Awards } from './components/Resume'

function App() {

  return (
    <>
      <EvenOdd />

      <hr />

      <LoginButton />

      <hr />

      <HelloReact />

      <hr />

      <InLineStyle />

      <hr />

      <Resume />
      <br />
      <Privacy 
        name = "유승민"
        phone = "010-9976-1563"
        email = "msnoeuan@gmail.com"
      />
      <br />
      <WorkSkills 
        contents = "이것은 업무 내용.."
      />
      <br />
      <Career 
        title = "학력"
        contents = "학력사항"
      />
      <br />
      <Career 
        title = "경력"
        contents = "경력사항"
      />
      <br />
      <Awards 
        contents = "수상 1"
      />

      <hr />

      <MyIntroApp 
        hobby = "야구 보기"
        food = "불고기"
        color = "green"
      />
    </>
  )
}

export default App
