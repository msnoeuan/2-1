// ./src/pages/Home
import {
    BrowserRouter as Router,
    Routes,
    Route,
    Link
} from 'react-router-dom'

import Index from './Index'
import Topics from './Topics'
import About from './About'

const routes = [
    {
        path : '/',
        element : <Index />
    },
    {
        path : '/topics',
        element : <Topics />
    },
    {
        path : '/about',
        element : <About />
    }
]

function Home() {
    return (
        <Router>
            <div>
                <ul>
                    <li><Link to = "/">Home</Link></li>
                    <li><Link to = "/topics">Topics</Link></li>
                    <li><Link to = "/about">About</Link></li>
                </ul>

                <Routes>
                    {routes.map(route => <Route path = {route.path} element = {route.element}/>)}
                </Routes>
            </div>
        </Router>
    )
}

export default Home