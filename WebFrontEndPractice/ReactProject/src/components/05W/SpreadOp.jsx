// ./src/components/05W/SpreadOp
function Body({name, location, favorList}) {
    return (
        <>
            <p>{name} 은 {location}에 거주합니다.</p>
            <p>{favorList.length} 개의 음식을 좋아합니다.</p>
        </>
    )
}

function SpreadOp() {
    const BodyProps = {
        name : "홍길동",
        location : "서울",
        favorList : ["파스타", "빵"]
    };

    return (
        <>
            <h1>[예제] 스프레드 연산자</h1>
            <Body {...BodyProps}/>
        </>
    )
}

export default SpreadOp