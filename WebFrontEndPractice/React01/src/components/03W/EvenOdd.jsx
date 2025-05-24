// ./src/components/03W/EvenOdd
function EvenOdd() {
    const number = 10;

    return (
        <>
            <h1>main</h1>
            <h3>{number}</h3>
            <h3>{number + 11}</h3>
            <h3>{number % 2 ? "홀수" : "짝수"}</h3>
        </>
    )
}

export default EvenOdd