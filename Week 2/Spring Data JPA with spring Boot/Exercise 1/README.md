# Hands On 4

## Difference between JPA, Hibernate and Spring Data JPA

### Java Persistence API (JPA)

- JPA is a specification for ORM.
- It defines interfaces.
- It does not contain implementation.
- Hibernate is one implementation of JPA.

---

### Hibernate

- Hibernate is an ORM framework.
- Implements JPA specification.
- Handles database operations.
- Requires Session and Transaction management.

---

### Spring Data JPA

- Built on top of JPA.
- Uses Hibernate internally.
- Reduces boilerplate code.
- Provides JpaRepository.
- Automatically manages transactions.

---

## Comparison

Hibernate

- More code
- Manual transaction handling
- Manual session management

Spring Data JPA

- Less code
- Automatic transaction management
- Repository interface
- Easier CRUD operations