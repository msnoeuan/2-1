// ./src/componetns/MyEvent
import {useState} from 'react'

function MyEvent() {
    const [id, setId] = useState("")
    const [pw, setPw] = useState("")

    const handleLoginSubmit = e => {
        e.preventDefault();  // 기본 이벤트를 막음
        console.log("제출되었습니다.")

        if(id === "")
            alert("아이디를 입력하지 않았습니다.")
        if(pw === "")
            alert("패스워드를 입력하지 않았습니다.")

        alert(`id : ${id}, pw : ${pw}`)
    }

    const handleLoginInput = e => {
        console.log("id", e.target.value)
        setId(e.target.value)
    }

    const handlePasswordInput = e => {
        console.log("pw", e.target.value);
        setPw(e.target.value)
    }

    return (
        <form onSubmit = {handleLoginSubmit}>
            <label>
                아이디 : <input type = "text" onChange = {handleLoginInput}></input>
            </label>

            <br />

            <label>
                비밀번호 : <input type = "password" onChange = {handlePasswordInput}></input>
            </label>

            <br />

            <button type = "submit">로그인</button>
        </form>
    )
}

export default MyEvent