// ./src/components/02W/Resume
function Resume(props) {
    return (
        <>
            <h1>이력서</h1>
            <section>
                <h2>개인 정보</h2>
                <p>이름 : {props.name}</p>
                <p>연락처 : {props.phone}</p>
                <p>email : {props.email}</p>
            </section>
        </>
    )
}

export default Resume