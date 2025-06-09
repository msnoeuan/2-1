// ./src/components/StateOff
import {useState} from 'react'

function TextChange({state}) {
    return (
        <div>
            {state === false ? "OFF" : "ON"}
        </div>
    )
}

function BtnTextChange({state, onClick}) {
    return (
        <button onClick = {onClick}>
            {state === false ? "켜기" : "끄기"}
        </button>
    )
}

function StateOnOff() {
    const [state, setState] = useState(false)
    const clickBtn = () => setState(!state)

    return (
        <>
            <h1>[Quiz] State</h1>
            <TextChange state = {state} />
            <BtnTextChange state = {state} onClick = {clickBtn} />
        </>
    )
}

export default StateOnOff