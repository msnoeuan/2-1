// ./src/components/06W/Navbar
import {useState} from 'react'
import Detail from './pages/Detail'
import Question from './pages/Question'
import Review from './pages/Review'

const ContentsContainer = ({listName}) => {
    if(listName === "detail"){
        return <Detail />
    }
    else if(listName === "qa") {
        return <Question />
    }
    else if(listName === "review") {
        return <Review />
    }
}

function Navbar({}) {
    const [listName, setListName] = useState("detail");
    const checkId = (e) => {
        setListName(e.target.id);
    }

    return (
        <>
            <nav>
                <ul>
                    <li id = "detail" style = {listName === "detail" ? {color : "red"} : {color : "black"}} onClick = {checkId}>
                        상세정보
                    </li>
                    <li id = "qa" style = {listName === "qa" ? {color : "red"} : {color : "black"}} onClick = {checkId}>
                        Q&A
                    </li>
                    <li id = "review" style = {listName === "review" ? {color : "red"} : {color : "black"}} onClick = {checkId}>
                        Review
                    </li>
                </ul>
            </nav>
            <ContentsContainer listName={listName} />
        </>
    )
}

export default Navbar