// ./src/components/MyIntroApp
function MyIntroApp(props) {
    return (
        <div style = {{
            border : "solid 1px",
            width : "500px"
        }}>
            <h2>{props.name} 자기소개서</h2>
            <h2>안녕하세요</h2>
            <h3>취미 : <span>{props.hobby}</span></h3>
            <h3>좋아하는 음식 : <span>{props.food}</span></h3>
            <h3>좋아하는 색 : <span style = {{color : props.color}}>{props.color}</span></h3>
        </div>
    )
}

export default MyIntroApp