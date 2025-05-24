import './App.css'
import {useState, useRef} from 'react'

// // W10
// import Posts from './components/W10/Posts'
// import Info from './components/W10/Info'

// // W11
// import Controller from './components/W11/Controller'
// import Viewer from './components/W11/Viewer'
// import Header from './components/W11/Header'
// import TodoEditor from './components/W11/TodoEditor'
// import TodoList from './components/W11/TodoList'

// const mockTodo = [
//   {
//     id: 0,
//     isDone: false,
//     content: "React 공부하기",
//     createdDate: new Date().getTime(),
//   },
//   {
//     id: 1,
//     isDone: false,
//     content: "빨래 널기",
//     createdDate: new Date().getTime(),
//   },
//   {
//     id: 2,
//     isDone: false,
//     content: "노래 연습하기",
//     createdDate: new Date().getTime(),
//   },
// ];

// W12
import Home from './components/W12/Home'
import Order from './components/W12/Order'

function App() {
  // // W10
  // const [visible, setVisible] = useState(false)

  // // W11
  // const [count, setCount] = useState(0)
  // const handleSetCount = value => setCount(count + value);
  // const [todo, setTodo] = useState(mockTodo)
  // const idRef = useRef(3);
  // const onCreate = content => {
  //   const newItem = {
  //     id : idRef.current,
  //     content,
  //     isDone : false,
  //     createdDate : new Date().getTime()
  //   }

  //   setTodo([newItem, ...todo])
  //   idRef.current += 1;
  // }
  // const onUpdate = targetId => setTodo(todo.map(it => it.id === targetId ? {...it, isDone : !it.isDone} : it))
  // const onDelete = targetId => setTodo(todo.filter(it => it.id !== targetId))
  
  return (
    // // W10
    // <>
    //   <h1>Posts</h1>
    //   <Posts />
    //   <hr />
    //   <h1>회원정보</h1>
    //   <button onClick = {() => setVisible(!visible)}>
    //     {visible ? '숨기기' : '보이기'}
    //   </button>
    //   {visible && <Info />}
    // </>

    // // W11
    // <>
    //   <div className='App'>
    //     <h1>Simple Counter</h1>

    //     <section>
    //       <Viewer count = {count} />
    //     </section>

    //     <section>
    //       <Controller handleSetCount={handleSetCount} />
    //     </section>
    //   </div>

    //   <hr />

    //   <div className='W11App'>
    //     <Header />
    //     <TodoEditor onCreate = {onCreate} />
    //     <TodoList todo = {todo} onUpdate={onUpdate} onDelete={onDelete} />
    //   </div>
    // </>

    // W12
    <>
      <Home />
      <Order />
    </>
  )
}

export default App
