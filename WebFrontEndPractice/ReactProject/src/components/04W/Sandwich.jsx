// ./src/components/04W/Sandwich
function Sandwich() {
    const sandwich = {
        bread : "더치크런치",
        meat : "참치",
        cheese : "스위스",
        toppings : ["상추", "토마토", "머스타드"]
    };

    const {bread, meat} = sandwich;

    return (
        <>
            <p>빵 : {bread}</p>
            <p>고기 : {meat}</p>
            <p>치즈 : {sandwich.cheese}</p>
            <p>토핑 : {sandwich.toppings}</p>
        </>
    )  
}

export default Sandwich