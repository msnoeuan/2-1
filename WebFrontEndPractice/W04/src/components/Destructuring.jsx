// ./src/components/Destructuring
function Destructuring() {
    const bf = {
        name : "유승민",
        age : 23,
        location : "서울시 구로구"
    }

    const {name, age, location} = bf;

    return (
        <>
            <h3>나는</h3>
            내 이름은 {name}이고 {age}살, {location}에 산다!
        </>
    )
}

export default Destructuring