// ./src/components/ProductName/ProductName
import './productName.css'

function ProductName({productName}) {
    return (
        <div>
            <strong>{productName}</strong>
        </div>
    );
}

export default ProductName