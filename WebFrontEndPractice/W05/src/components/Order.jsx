import {useState} from 'react'

// ./src/components/Order
function Order() {
    const [espresso, setEspresso] = useState(false)
    const [americano, setAmericano] = useState(false)
    const [cafelatte, setCafelatte] = useState(false)

    const sum = () => {
        let value = 0;

        value += (espresso ? 2800 : 0)
        value += (americano ? 3000 : 0)
        value += (cafelatte ? 2800 : 0)

        return value
    }

    return (
        <div>
            <h1>Order</h1>
            <h2>메뉴판</h2>

            <dl>
                <dt>에스프레소</dt>
                <dd>
                    2800원
                    <small>
                        <button onClick = {() => setEspresso(!espresso)}>
                            {espresso ? '선택해제' : '선택'}
                        </button>
                    </small>
                </dd>

                <dt>아메리카노</dt>
                <dd>
                    3000원
                    <small>
                        <button onClick = {() => setAmericano(!americano)}>
                            {americano ? '선택해제' : '선택'}
                        </button>
                    </small>
                </dd>

                <dt>카페라떼</dt>
                <dd>
                    3500원
                    <small>
                        <button onClick = {() => setCafelatte(!cafelatte)}>
                            {espresso ? '선택해제' : '선택'}
                        </button>
                    </small>
                </dd>
            </dl>

            <hr style = {{borderStyle : "dotted"}} />

            <h2>주문서</h2>

            <ul>
                {espresso && <li>에스프레소</li>}
                {americano && <li>아메리카노</li>}
                {cafelatte && <li>카페라떼</li>}
            </ul>
            
            <p>합계 : {sum()}</p>

            <div><button>주문하기</button></div>
        </div>
    )
}

export default Order