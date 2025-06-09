// ./src/components/ProductImage/ProductImage

function ProductImage({thumbnailImg, productName}) {
    const imgUrl = 'http://localhost:5173/' + thumbnailImg

    return (
        <div>
            <img src = {imgUrl} alt = {productName} />
        </div>
    )
}

export default ProductImage