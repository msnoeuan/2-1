// ./src/components/ReturnMap
function ReturnMap() {
    const elementArray = [
        <li>Start</li>,
        <li>react</li>,
        <li>Array map</li>
    ]

    return (
        <ul>
            {elementArray.map(array_value => array_value)}
        </ul>
    )
}

export default ReturnMap