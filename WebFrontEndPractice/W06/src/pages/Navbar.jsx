// ./src/pages/Navbar
import { useState } from "react";
import Detail from './Detail'
import Question from './Question'
import Review from './Review'

const ContentsContainer = ({listName}) => {
    if(listName === "detail")
        return <Detail />
    else if(listName === "qa")
        return <Question />
    else if(listName === "review")
        return <Review />
    
}

function Navbar() {
    const [listName, setListName] = useState("detail")
    const checkId = e => setListName(e.target.id)

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

                <ContentsContainer listName= {listName} />
            </nav>
        </>
    )
}

export default Navbar