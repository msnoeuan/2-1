// ./src/components/06W/ReturnMap
function ReturnMap() {
    const element_Array = [
        <li>Start</li>,
        <li>react</li>,
        <li>Array map</li>,
    ]

    return (
        <ul>
            {element_Array.map((array_value => array_value))}
        </ul>
    )
}

export default ReturnMap