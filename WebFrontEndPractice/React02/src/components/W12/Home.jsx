// ./src/components/W12/Home
import {
    BrowserRouter as Router,  // as Router 생략 가능(별명)
    Routes,
    Route
} from 'react-router-dom'  

const Index = () => <h2>Home Page</h2>
const One = ({name}) => <h2>{name} Page 1</h2>
const Two = () => <h2>Page 2</h2>
const Three = () => <h2>Page 3</h2>

function Home() {
    return (
        <Router>
            <div>
                <Routes>
                    <Route path='/' element = {<Index />} />
                    <Route path='/1' element = {<One name = 'seungmin'/>} />
                    <Route path='/2' element = {<Two />} />
                    <Route path='/3' element = {<Three />} />
                </Routes>
            </div>
        </Router>
    )
}

export default Home