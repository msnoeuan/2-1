// ./src/components/IterationSample
import {useState} from 'react'

const IterationSample = () => {
    const [names, setNames] = useState([
        {id : 1, text : '눈사람'},
        {id : 2, text : '얼음'},
        {id : 3, text : '눈'},
        {id : 4, text : '바람'},
    ]);

    const [inputText,setInputText] = useState('');
    // 새로운 항목 추가할 때 사용할 ID
    const [nextId,setNextId] = useState(5);

    const namesList = names.map(name => <li key = {name.id}>{name.text}</li>)

    return (
        <>
            <ul>{namesList}</ul>
        </>
    )
}

export default IterationSample;