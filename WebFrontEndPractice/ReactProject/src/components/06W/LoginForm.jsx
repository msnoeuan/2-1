// ./src/components/06W/LoginForm
import {useState} from 'react'

function LoginForm() {
    const [domain, setDomain] = useState("gmail.com")
    const [id, setId] = useState("")

    const domains = ["gmail.com", "naver.com", "hanmail.com"]

    const onChangeDomain = (e) => {
        setDomain(e.target.value);
    }

    return (
        <>
            <form>
                <input type="text" value = {id} onChange = {(e) => {setId(e.target.value)}}/>
                {domain === "" ? null : <span>@</span>}

                <select onChange={onChangeDomain}>
                    {domains.map((domain) => <option key = {domain} value = {domain} >{domain}</option>)}
                    <option value = "">직접 입력</option>
                </select>
                <br />
                <input type="password" />
                <button>로그인</button>
            </form>
        </>
    )
}

export default LoginForm