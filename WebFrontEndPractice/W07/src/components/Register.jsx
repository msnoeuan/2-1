// ./src/components/Register
import {useState} from 'react'

function Register() {
    const [input, setInput] = useState({
        name : "",
        birth : "",
        country : "",
        bio : ""
    })

    const onChange = e => {
        setInput({
            ...input,
            [e.target.name] : e.target.value
        })
    }

    return (
        <div>
            <input name = "name" value = {input.name} onChange = {onChange} placeholder = '이름 입력' />
            {input.name}

            <br />

            <input type="date" name = "birth" onChange = {onChange}/>
            {input.birth}

            <br />

            <select name="country" onChange = {onChange}>
                <option value="KR">한국</option>
                <option value="USA">미국</option>
                <option value="US">영국</option>
            </select>
            {input.country}

            <br />

            <textarea name = "bio" onChange = {onChange}></textarea>
            {input.bio}
        </div>
    )
}

export default Register