// ./src/componetns/Home
import {
    BrowserRouter,
    Routes,
    Route
} from 'react-router-dom'

const Index = () => <h2>Home Page</h2>
const One = ({name}) => <h2>{name} Page</h2>
const Two = () => <h2>Page 2</h2>
const Three = () => <h2>Page 3</h2>

function Home() {
    return (
        <BrowserRouter>
            <div>
                <Routes>
                    <Route path = '/' element = {<Index />} />
                    <Route path = '/1' element = {<One name = "승민" />} />
                    <Route path = '/2' element = {<Two />} />
                    <Route path = '/3' element = {<Three />} />
                </Routes>
            </div>
        </BrowserRouter>
    )
}

export default Home