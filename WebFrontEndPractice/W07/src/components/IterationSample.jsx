// ./src/components/IterationSample
import { useState } from "react"

function MyEvent() {
    const [names, setNames] = useState([
        {id : 1, text : "눈사람"},
        {id : 2, text : "얼음"},
        {id : 3, text : "눈"},
        {id : 4, text : "바람"}
    ])

    const [inputText, setInputText] = useState("")
    const [nextId, setNextId] = useState(5)

    const onChange = e => setInputText(e.target.value)
    const onClick = e => {
        const nextNames = names.concat({id : nextId, text : inputText})
        setNextId(nextId + 1)
        setNames(nextNames)
        setInputText("")
    }

    const onRemove = id => {
        const nextNames = names.filter(name => name.id !== id)
        setNames(nextNames)
    }

    const nameList = names.map(name => <li onDoubleClick = {() => onRemove(name.id)}>{name.text}</li>)  // 인자 전달를 위해 익명함수 전달

    return (
        <>
            <h1>동적 배열 렌더링</h1>
            <input onChange = {onChange} value = {inputText} />
            <button onClick = {onClick}>추가</button>
            <ul>{nameList}</ul>
        </>
    )
}

export default MyEvent