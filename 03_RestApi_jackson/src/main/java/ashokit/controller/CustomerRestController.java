package ashokit.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ashokit.binding.Customer;

@RestController
public class CustomerRestController {
	@DeleteMapping(value = "/customer/{cid}", produces = "text/plain")
	public String deleteCustomer(@PathVariable Integer cid) {
		return "Customer Deleted";
	}

	@PutMapping(value = "/customer", consumes = "application/json", produces = "text/plain")
	public String updateCustomer(@RequestBody Customer c) {
		System.out.println(c);
		return "Customer Updated";

	}

	@PostMapping(value = "/cust", consumes = "application/json", produces = "text/plain")
	public ResponseEntity<String> addCustomer(@RequestBody Customer c) {
		System.out.println(c);
		String body = "customer Added";
		return new ResponseEntity<>(body, HttpStatus.CREATED);

	}

	@GetMapping(value = "/customer", produces = "applicatin/json")
	public Customer getCustomer() {
		Customer c = new Customer(1, "Jock", "Jock@gmail.com");
		return c;

	}
	@GetMapping(value = "/customers", produces = "applicatin/json")
    public List<Customer> getCustomers() {
		Customer c1 = new Customer(1, "Jock", "Jock@gmail.com");
		Customer c2 = new Customer(1, "Smith", "Jock@gmail.com");
		Customer c3 = new Customer(1, "Vinith", "Vinith@gmail.com");
		List<Customer> customers = Arrays.asList(c1, c2, c3);
		return customers;
	}
}
