// ./src/components/05W/Counter
import React, {useState} from 'react';

function Counter() {
    const [number, setNumber] = useState(0);  // [읽기 전용 변수, 함수] => 함수를 사용하여 number 값 변경

    const onIncrease = () => {setNumber(number + 1)};  // 이벤트 핸들러는 함수 이름 뒤에 () 사용 X
    const onDecrease = () => {setNumber(number - 1)};

    return (
        <div>
            <h1>{number}</h1>
            <button onClick = {onIncrease}>+ 1</button>
            <button onClick = {onDecrease}>- 1</button>
            <button onClick = {() => {setNumber(number + 2)}}>+ 2</button>
            <button onClick = {() => {setNumber(number - 2)}}>- 2</button>
        </div>
    );
}

export default Counter