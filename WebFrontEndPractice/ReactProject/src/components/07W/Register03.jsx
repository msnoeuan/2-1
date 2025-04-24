// ./src/components/Register

// reactjs code snippets
// rsf: 함수 컴포넌트
// rsc : 화살표 함수

import React, {useState} from 'react';



function Register() {
    const [input, setInput] = useState({  // 객체라 중괄호 사용
         name : "",
         birth : "",
         country : "",
         bio : "",
    })

    const onChangeName = (e) => {
        setInput({
            ...input,
            name : e.target.value
        });
    };
    const onChangeBirth = (e) => {
        setInput({
            ...input,
            birth : e.target.value
        });
    };
    const onChangeCountry = (e) => {
        setInput({
            ...input,
            country : e.target.value
        });
    };
    const onChangeBio = (e) => {
        setInput({
            ...input,
            bio : e.target.value
        });
    };

    return (
        <div>
            <input type="text" 
                   value={input.name} 
                   onChange={onChangeName}
                   placeholder='{"이름"}'/> {input.name} 
            <br />

            <input type="date" 
                   value={input.birth} 
                   onChange={onChangeBirth}/> {input.birth}
            <br />

            <select  value = {input.country} onChange={onChangeCountry}>
                <option value = "kr">한국</option>
                <option value = "uk">영국</option>
                <option value = "us">미국</option>
            </select> {input.country}
            <br />

            <textarea value={input.bio} onChange={onChangeBio} /> {input.bio}
        </div>
    );
}

export default Register;