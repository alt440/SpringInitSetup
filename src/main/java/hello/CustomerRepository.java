package hello;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

//by extending CrudRepository, CustomerRepository inherits several methods for saving, deleting, and finding Customer entities
//NOTE: this is the ONLY thing you need to do to get all the methods you need for working with Customer entities. The rest is 
//automatically generated by JPA. See https://spring.io/guides/gs/accessing-data-jpa/

/*
 * More specifically:
 * This interface extends Spring Data JPA’s JpaRepository, specifying the domain type as Employee and the id type as Long. 
 * This interface, though empty on the surface, packs a punch given it supports:
 * Creating new instances
 * Updating existing ones
 * Deleting
 * Finding (one, all, by simple or complex properties)
 */

//for the methods below, no need for the actual code because CRUD handles that. You only have to put an existing method name
//and it will associate that name to the method.
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    public List<Customer> findByLastName(String lastName);
    
    public List<Customer> findAll();
}