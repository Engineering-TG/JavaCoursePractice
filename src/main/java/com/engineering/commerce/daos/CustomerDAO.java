package com.engineering.commerce.daos;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.engineering.commerce.entities.Customer;

public class CustomerDAO {
	
	private final List<Customer> customers = new ArrayList<>();
	private int currentId = 1;
	
	public void addCustomer(Customer customer) {
		customer.setCustomerId(currentId++);
		customers.add(customer);
	}
	
	public Customer getCustomerById(int id){
		Optional<Customer> customer = customers.stream().filter(c -> c.getCustomerId() == id).findFirst();
		return customer.orElse(null);
	}
	
	public List<Customer> getAllCustomers(){
		return new ArrayList<>(customers);
	}
	
	public void updateCustomer(Customer customer) {
		Customer existingCustomer = getCustomerById(customer.getCustomerId());
		if(existingCustomer != null) {
			existingCustomer.setFirstName(customer.getFirstName());
			existingCustomer.setEmail(customer.getEmail());
		}
	}
	
	public void deleteCustomer(int id) {
		customers.removeIf(c -> c.getCustomerId() == id);
	}
	
}
