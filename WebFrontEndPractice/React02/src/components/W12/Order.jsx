// ./src/components/W12/Order 
import {Fragment, useState, useMemo} from 'react'
import menu from './data.json'
const formatter = Intl.NumberFormat('ko-KR')

// const data = [
//     { "name": "오늘의 커피", "price": 2500 },
//     { "name": "에스프레소",  "price": 2800 },
//     { "name": "아메리카노",  "price": 3000 },
//     { "name": "카페라떼",    "price": 3500 },
//     { "name": "카페모카",    "price": 3800 }
// ]

function Order() {
    const [selected, setSelected] = useState([])

    const sum = useMemo(() => {
        let value = 0;
        selected.forEach(item => value += item.price)
        return value
    }, [selected])

    return (
        <div>
            <h1>Order</h1>
            <h2>메뉴판</h2>

            <dl>
                {
                    menu.map(element => (
                        <Fragment key={element.name}>
                            <dt>{element.name}</dt>
                            <dd>
                                {formatter.format(element.price)}원
                                <small>
                                    <button onClick={() => {
                                        if(selected.includes(element)) 
                                            setSelected(selected.filter(item => item !== element))
                                        else 
                                            setSelected([...selected, element])
                                    }}>
                                        [{selected.includes(element) ? '선택 해제' : '선택'}]
                                    </button>
                                </small>
                            </dd>
                        </Fragment>
                    ))
                }
            </dl>

            <hr />

            <h2>주문서</h2>
            <ul>
                {selected.map(item => <li key = {item.name}>{item.name}</li>)}
            </ul>
            <p>합계 : {formatter.format(sum)}</p>
            <div>
                <button>
                    주문하기
                </button>
            </div>
        </div>
    )
}

export default Order
