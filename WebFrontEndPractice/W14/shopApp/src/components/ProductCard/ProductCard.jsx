// ./src/components/ProductCard/ProductCard
import './productCard.css'
import {useRef} from 'react'
import ProductImage from '../ProductImage/ProductImage'
import ProductName from '../ProductName/ProductName'
import ProductPrice from '../ProductPrice/ProductPrice'

function ProductCard({productName, price, thumbnailImg}) {
    const likeBtn = useRef()
    const handleLikeClick = e => e.currentTarget.classList.toggle('on')

    return (
        <div>
            <li className = 'product-item'>
                <div className = 'product-img'>
                    <ProductImage 
                        thumbnailImg = {thumbnailImg}
                        productName = {productName}
                    />
                </div>

                <ProductName productName = {productName} />

                <button 
                    className = 'like-btn' 
                    ref = {likeBtn} 
                    onClick = {handleLikeClick}
                >
                </button>

                <div className = 'product-price'>
                    <ProductPrice price = {price} />
                </div>
            </li>
        </div>
    );
}

export default ProductCard