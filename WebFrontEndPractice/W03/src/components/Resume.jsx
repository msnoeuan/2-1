// ./src/components/Resume
export function Resume() {
    return (
        <>
            <h1>이력서</h1>
        </>
    )
}

export function Privacy(props) {
    return (
        <>
            <h3>개인정보</h3>
            <p>이름 : {props.name}</p>
            <p>연락처 : {props.phone}</p>
            <p>email : {props.email}</p>
        </>
    )
}

export function WorkSkills(props) {
    return (
        <>
            <h3>업무 스킬</h3>
            <p>내용 : {props.contents}</p>
        </>
    )
}

export function Career(props) {
    return (
        <>
            <h3>학력과 경력</h3>
            <b>{props.title}</b>
            <p>{props.contents}</p>
        </>
    )
}

export function Awards(props) {
    return (
        <>
            <h3>수상 경력</h3>
            <p>{props.contents}</p>
        </>
    )
}