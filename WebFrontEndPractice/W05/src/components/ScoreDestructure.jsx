// ./src/components/ScoreDestructure
function ScoreDestructure() {
    const arr = [70, 80, 90]
    const [a, b, c] = arr;

    return (
        <>
            <p>{a}</p>
            <p>{b}</p>
            <p>{c}</p>
        </>
    )
}

export default ScoreDestructure