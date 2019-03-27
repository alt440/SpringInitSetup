package hello;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

//using Thymeleaf along with this

//there is also the PostMapping/ PutMapping/ and DeleteMapping that you can use
//notice that every annotation is found under the same path (look at imports)
@Controller
public class GreetingController {

	//searches for the class associated with this object
	@Autowired
	//put the CustomerRepository here because this is the object that handles the Customer objects
	private CustomerRepository repository;
	
    @GetMapping("/greeting")
    public String greeting() {
    	//returns the html file named Hello. Found in src/main/resources/templates
    	return "Hello";
    }
    
    @GetMapping("/greetings")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
    	//this is how you pass variables to the page
        model.addAttribute("name", name);
        return "greeting";
    }
    
    @GetMapping("/customer")
    public String customers(Model model) {
    	// method findAll() comes from CustomerRepository object
    	model.addAttribute("customers", repository.findAll());
    	return "customers";
    }

}
