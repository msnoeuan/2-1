// ./src/components/07W/IterationSample
import {useState} from 'react'

function IterationSample(props) {
    const [names, setNames] = useState([
        {id : 1, text : "눈사람"},
        {id : 2, text : "얼음"},
        {id : 3, text : "눈"},
        {id : 4, text : "바람"},
    ])

    const [inputText,setInputText] = useState('')
    const [nextId,setNextId] = useState(5)  // 새로운 항목 추가할 때 사용할 ID

    const onChange = e => setInputText(e.target.value)
    const onClick = () => {
        const nextNames = names.concat({
            id : nextId,
            text : inputText
        })

        setNextId(nextId + 1)  // 새로운 배열 요소(객체)의 아이디 + 1
        setNames(nextNames)  // 원래 names 배열에서 새로 추가된 요소가 있는 nextNames로 갱신
        setInputText('')  // input 안을 빈칸으로
    }
    
    const onRemove = (id) => {
        const nextNames = names.filter(name => name.id !== id)
        setNames(nextNames)
    }

    const nameList = names.map(name => <li key = {name.id} onDoubleClick={() => onRemove(name.id)}>{name.text}</li>)

    return (
        <div>
            <input type = "text" value = {inputText} onChange={onChange}/>
            <button onClick = {onClick}>추가</button>
            <ul>{nameList}</ul>
        </div>
    );
}

export default IterationSample;