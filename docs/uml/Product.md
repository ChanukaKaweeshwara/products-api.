```mermaid
classDiagram
class Product {
    # Long id
    # String name
    # double price
    + getId()
    + getName()
    + getPrice()
}

class DigitalProduct {
    - String downloadUrl
    - double fileSizeMB
    + getDownloadUrl()
    + getFileSizeMB()
}

class PhysicalProduct {
    - double weightKg
    - String dimensions
    + getWeightKg()
    + getDimensions()
}

class ProductService {
    - List~Product~ products
    - Long nextId
    + getAllProducts()
    + addProduct(Product)
    + getProductById(Long)
    + deleteProduct(Long)
    + findByName(String)
}

class ProductController {
    - ProductService productService
    + getAllProducts()
    + getProductById(Long)
    + addProduct(Product)
    + deleteProduct(Long)
    + search(String)
}

Product <|-- DigitalProduct
Product <|-- PhysicalProduct
ProductService --> Product : manages
ProductController ..> ProductService : uses