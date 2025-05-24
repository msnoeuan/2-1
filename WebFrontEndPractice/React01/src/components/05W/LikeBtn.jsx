// ./src/components/05W/LikeBtn
import {useState} from 'react'

function LikeBtn() {
    const [like, setLike] = useState(false);

    const heart = like % 2 === 1 ? '❤️' : '';
    const clickLike = () => {
        if(like) {setLike(false)}
        else {setLike(true)}
    }

    return (
        <div>
            <h1>좋아요 버튼</h1>
            <button onClick = {clickLike}>like</button>
            <span>{heart}</span>
        </div>
    )
}

export default LikeBtn