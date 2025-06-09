// ./src/pages/BlogDetail/BlogDetail.jsx
import { useEffect, useState } from "react"
import { useLocation } from "react-router-dom"
import axios from "axios"

export default function BlogDetail() {
  const location = useLocation()
  // console.log(location)
  const postNumber = location.pathname.split('/')[2]
  const [post, setPost] = useState(undefined)

  useEffect(() => {
    axios.get('http://localhost:3001/posts/${postNumber}')
         .then((data) => {setPost(data.data)})
         .catch(() => setPost(null))
  }, [postNumber])

  // console.log(post)
  
  return (
    <div>
      {post === undefined ? 
        <div>로딩중..</div> : post === null ? 
        <div>404</div> : <div>{post.title}</div>}
    </div>
  )
}
