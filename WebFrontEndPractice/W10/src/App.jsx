import './App.css'
import {useState} from 'react'
import Info from './components/Info'
import Posts from './components/Posts'

function App() {
  const [visible, setVisible] = useState(false)

  return (
    <>
      <h1>Posts</h1>
      <Posts />

      <hr />

      <h1>회원정보</h1>
      
      <button onClick = {() => setVisible(!visible)}>
        {visible ? '숨기기' : '보이기'}
      </button>

      {visible && <Info />}
    </>
  )
}

export default App
