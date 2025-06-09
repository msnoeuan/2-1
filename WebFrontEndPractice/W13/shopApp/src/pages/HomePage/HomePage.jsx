// ./src/pages/HomePage/HomePage
import './homePage.css'
import {data} from '../../database/data'
import ProductCard from '../../components/ProductCard/ProductCard'

function HomePage() {
    console.log(data)
    
    return (
        <main className = 'product'>
            <h1>상품 메인</h1>
            <ul className = 'product-list'>
                {data.map(item => <ProductCard 
                    key = {item.id}
                    productName = {item.productName}
                    price = {item.price}
                    thumbnailImg = {item.thumbnailImg}
                />)}
            </ul>

            <a className = 'link-btn cart-link' href = '#'></a>
        </main>
    )
}

export default HomePage