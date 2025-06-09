// ./src/pages/Home.jsx
import { 
    BrowserRouter as Router,
    Routes,
    Route,
    Link
} from "react-router-dom"

import Index from './Index'
import Topics from './Topics'
import About from './About'

function Home() {
    return (
        <Router>
            <div>
                <ul>
                    <li><Link to = "/">Home</Link></li>
                    <li><Link to = "/topics">Topics</Link></li>
                    <li><Link to = "/about">About</Link></li>
                </ul>

                <ul>
                    <Routes>
                        <Route path = "/" element = {<Index />} />
                        <Route path = "/topics" element = {<Topics />} />
                        <Route path = "/about" element = {<About />} />
                    </Routes>
                </ul>
            </div>
        </Router>
    );
}

export default Home