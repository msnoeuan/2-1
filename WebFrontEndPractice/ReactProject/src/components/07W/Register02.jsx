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

    const onChange = (e) => {
        setInput({
            ...input,
            [e.target.name] : e.target.value,
        });
    };

    return (
        <div>
            <input name = "name"
                   type="text" 
                   value={input.name} 
                   onChange={onChange}
                   placeholder='{"이름"}'/> {input.name} 
            <br />

            <input name = "birth"
                   type="date" 
                   value={input.birth} 
                   onChange={onChange}/> {input.birth}
            <br />

            <select name = "country" value = {input.country} onChange={onChange}>
                <option value = "kr">한국</option>
                <option value = "uk">영국</option>
                <option value = "us">미국</option>
            </select> {input.country}
            <br />

            <textarea name = "bio" value={input.bio} onChange={onChange} /> {input.bio}
        </div>
    );
}

export default Register;