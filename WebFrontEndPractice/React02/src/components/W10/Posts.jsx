// ./src/components/W10/Post.js
import {useState} from 'react'
import axios from 'axios'

function Posts() {
    const [title, setTitle] = useState("")
    const [body, setBody] = useState("")

    const onSubmit = () => {
        axios.post("http://localhost:3001/posts", {
            title,
            body
        })
        setTitle("")
        setBody("")
    }

    return (
        <div className = 'container'>
            <div className='mb-3'>
                <label className='form-label'>Title</label>
                <input 
                    className='form-control'
                    value = {title}
                    onChange={e => {
                        setTitle(e.target.value)
                    }}/>

                <label className='form-label'>Body</label>

                <textarea
                    className='form-control'
                    value = {body}
                    onChange={e => {
                        setBody(e.target.value)
                    }}
                    rows = "20"/>

                    <button
                        className='btn btn-primary'
                        onClick = {onSubmit}>
                        Post
                    </button>
            </div>
        </div>
    )
}

export default Posts