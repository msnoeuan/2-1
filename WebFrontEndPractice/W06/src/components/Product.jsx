// ./src/components/Product
function Product() {
    const productList = {
        products: [
          {
            title: "무릎 담요",
            price: 17500,
            id: 101,
          },
          {
            title: "노트북 파우치",
            price: 29000,
            id: 102,
          },
          {
            title: "스티커북",
            price: 29000,
            id: 103,
          },
          {
            title: "키링",
            price: 29000,
            id: 104,
          },
        ],
    }

    return (
        <>
            {productList.products.map((product, index) => (
                <li key = {product.id} style = {{listStyle : "none"}}>
                    <h2>{index + 1} {product.title}</h2>
                    <span>{`${product.price}원`}</span>
                </li>
            ))}
        </>
    )
}

export default Product