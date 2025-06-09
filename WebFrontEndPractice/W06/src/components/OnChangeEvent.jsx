// ./src/components/OnChangeEvent
import {useState} from 'react'

function OnChangeEvent() {
    const [text, setText] = useState("")
    const onChange = e => {
        console.log(e.target.value)
        setText(e.target.value)
    }
    const onReset = e => setText("")

    return (
        <div>
            <input onChange = {onChange} value = {text} />
            <button onClick = {onReset}>초기화</button>
            <div><b>값 : {text}</b></div>
        </div>
    )
}

export default OnChangeEvent