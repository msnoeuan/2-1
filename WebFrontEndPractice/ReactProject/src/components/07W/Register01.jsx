// ./src/components/Register

// reactjs code snippets
// rsf: 함수 컴포넌트
// rsc : 화살표 함수

import React, {useState} from 'react';



function Register() {
    const [name, setName] = useState('')
    const [birth, setBirth] = useState('')
    const [country, setCountry] = useState('')
    const [bio, setBio] = useState('')

    const onChangeName = (e) => {
        setName(e.target.value)
    };

    const onChangeBirth = (e) => {
        setBirth(e.target.value);
    };

    const onChngeCountry = (e) => {
        setCountry(e.target.value);
    };

    const onChangeBio = (e) => {
        setBio(e.target.value)
    }

    return (
        <div>
            <input type="text" 
                   value={name} 
                   onChange={onChangeName}
                   placeholder='{"이름"}'/> {name} 
            <br />

            <input type="date" 
                   value={birth} 
                   onChange={onChangeBirth}/> {birth}
            <br />

            <select  value = {country} onChange={onChngeCountry}>
                <option value = "kr">한국</option>
                <option value = "uk">영국</option>
                <option value = "us">미국</option>
            </select> {country}
            <br />

            <textarea value={bio} onChange={onChangeBio} /> {bio}
        </div>
    );
}

export default Register;