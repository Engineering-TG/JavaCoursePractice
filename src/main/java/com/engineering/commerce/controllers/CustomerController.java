package com.engineering.commerce.controllers;

import java.util.List;

import com.engineering.commerce.entities.Customer;
import com.engineering.commerce.entities.Order;
import com.engineering.commerce.services.CustomerService;
import com.engineering.commerce.services.ProductService;


public class CustomerController {
	
	private final CustomerService customerService;
	
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}
	
		public List<Customer> getAllCustomers(){
		return customerService.getAllCustomers();
	}
	
		public void updateCustomer(Customer customerUpdate){
		 customerService.updateCustomer(customerUpdate);
	}

		public void deleteCustomer(Customer customer){
		 customerService.deleteCustomer(customer);
	}
	
	
}
