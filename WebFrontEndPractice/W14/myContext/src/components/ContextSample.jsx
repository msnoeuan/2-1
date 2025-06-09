// ./src/components/ContextSample.jsx
import { createContext } from "react"

const UserInfo = createContext (
    {
        name : 'gdContext',
        id : gdc
    }
)

function ContextSample() {
    return (
        <UserInfo.Provider value = {{name : 'aliceJ', id : 'aj'}}>
            <HelloContext />
        </UserInfo.Provider>
    )
}

const HelloContext = () => {
    return (
        <UserInfo.Consumer>
            {value => (
                <div>
                    <h2>{value.id}</h2>
                    <strong>{value.name}</strong>
                    <HelloContextTwo />
                </div>
            )}
        </UserInfo.Consumer>
    )
}

const HelloContextTwo = () => {
    return (
        <UserInfo.Consumer>
            {value => (
                <div>
                    <h2>Two : {value.id}</h2>
                    <strong>Two : {value.name}</strong>
                </div>
            )}
        </UserInfo.Consumer>
    )
}

export default ContextSample