```mermaid
classDiagram
class Address {
  -String street
  -String city
  -String postcode
  +Address()
  +Address(street: String, city: String, postcode: String)
  +getStreet() String
  +getCity() String
  +getPostcode() String
}

class Customer {
  -Long id
  -String name
  -String email
  -Address address
  +Customer()
  +Customer(id: Long, name: String, email: String, address: Address)
  +getId() Long
  +getName() String
  +getEmail() String
  +getAddress() Address
}

Customer --> Address
```