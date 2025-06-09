// ./src/components/Myprops
function Myprops({text, color = "blue"}) {
    return (
        <button style={{color : color}}>
            {text}
        </button>
    )
}

export default Myprops