// ./src/components/04W/Profile
function Profile({name, location}) {
    return (
        <div>
            <p>안녕하세요, 제 이름은 {name} 입니다.</p>
            <p>주소는 {location} 입니다.</p>
        </div>
    )
}

export default Profile

/*
부모 컴포넌트에서 
    <Profile 
    name = "승민"
    location = "구로구"
    />
형태로 넘겨도 
React가 내부적으로 컴포넌트에 props를 줄 때는 객체 형태로 넘겨줌
*/