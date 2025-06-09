// ./src/components/ProductPrice/ProductPrice
import './productPrice.css'

function ProductPrice({price}) {
    return (
        <div>
            <strong className = 'price m-price'>{price}<span>원</span></strong>
        </div>
    );
}

export default ProductPrice