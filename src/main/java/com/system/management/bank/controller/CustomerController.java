package com.system.management.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.system.management.bank.entity.Customer;
import com.system.management.bank.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
    private CustomerService customerService;
	
	@GetMapping("/userhome")
	public String userHome()
	{
		return "Welcome to user home controller";
	}
	
	@PostMapping("/new-save")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        Customer savedCustomer = customerService.saveCustomer(customer);
        return ResponseEntity.ok(savedCustomer);
    }
	
	@PostMapping("/simple-save")
    public ResponseEntity<Customer> simpleSaveCustomer(@RequestParam String name,
            @RequestParam String phone,
            @RequestParam String address) {
		
		Customer customer = new Customer();
        customer.setName(name);
        customer.setPhone(phone);
        customer.setAddress(address);
        Customer savedCustomer = customerService.saveCustomer(customer);
        return ResponseEntity.ok(savedCustomer);
    }
	
	@GetMapping("/get-all")
    public ResponseEntity<List<Customer>> getAllCustomers() {
        List<Customer> customers = customerService.getAllCustomers();
        return ResponseEntity.ok(customers);
    }
	
	@PutMapping("/update-customer/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
        Customer updatedCustomer = customerService.updateCustomer(id, customer);
        return updatedCustomer != null ? ResponseEntity.ok(updatedCustomer) : ResponseEntity.notFound().build();
    }
}
