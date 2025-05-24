// ./src/components/04W/MyProps
function MyProps({text, color = "blue"}) {
    return (
        <button style = {{color : color}}>
            {text}
        </button>
    )
}

export default MyProps