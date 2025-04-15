// ./src/components/04W/Destructuring
function Destructuring() {
    const bf = {
        name : "김선혁",
        age : 26,
        location : "경기도 양평군 ㅠㅠ"
    }

    const {name, age, location} = bf;

    return (
        <>
            <h3>내 남자친구는..</h3>
            {name}이고.. {age}살이고.. {location}에 사는데..
            서울왓으면 좋겟네..
        </>
    )
}

export default Destructuring