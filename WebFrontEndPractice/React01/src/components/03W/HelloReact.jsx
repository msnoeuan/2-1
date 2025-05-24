// ./src/components/03W/HelloReact
function HelloReact() {
    const name = "리액트"

    return (
        <>
            <h3>리액트 안녕!</h3>
            <h3>잘 작동하니?</h3>

            {name === "리액트" ? <h3>리액트입니다.</h3> : <h3>리액트가 아닙니다.</h3>}
            {name === "리액트" && <h2>리액트입니다.</h2>}
        </>
    )
}

export default HelloReact