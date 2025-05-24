// ./src/components/W10/Info
import {useState} from 'react'

function Info() {
    const [name, setName] = useState("");
    const [nickname, setNickname] = useState("")

    const onChangeName = e => setName(e.target.value)
    const onChangeNickname = e => setNickname(e.target.value)

    return (
        <div>
            <div>
                <input value={name} onChange={onChangeName}/>
                <input value={nickname} onChange={onChangeNickname}/>
            </div>

            <div>
                <b>이름 : {name}</b>
            </div>
            <div>
                <b>닉네임 : {nickname}</b>
            </div>
        </div>
    )
}

export default Info