package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//this annotation means that this class is a JPA entity
@Entity
//there is no @Table annotation, thus it is assumed the objects of this entity will go into a table named Customer
public class Customer {

	//this annotation highlights to JPA that this attribute will be used as JPA's identity
    @Id
    //this means that the variable will be automatically generated
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    //can optionally add @Column(name = "firstName", length = 400, nullable = false) if required
    private String firstName;
    private String lastName;

    //written down only because of JPA
    protected Customer() {}

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }
    
    //Used for accessing private fields from customers.html
    public String getFirstName() {
    	return firstName;
    }
    
    public String getLastName() {
    	return lastName;
    }

}
