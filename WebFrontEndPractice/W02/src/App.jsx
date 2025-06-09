import './App.css'
import Footer from './components/Footer'
import Header from './components/Header'
import Main from './components/Main'
import Resume from './components/Resume'
import Welcome from './components/Welcome'

function App() {

  return (
    <>
      <Header />
      <Main />
      <Footer />
      <h2>안녕, 리액트</h2>

      <hr />

      <Welcome name = "Kim" />
      <Welcome name = "Lee" />
      <Welcome name = "Choi" />

      <hr />

      <Resume 
        name = "홍길동"
        phone = "010-1111-1111"
        email = "hong@gmail.com"
      />
      <Resume 
        name = "유승민"
        phone = "010-9978-1563"
        email = "msnoeuan@gmail.com"
      />
      
    </>
  )
}

export default App
