package com.engineering.commerce.services;

import java.util.List;

import com.engineering.commerce.entities.Address;
import com.engineering.commerce.entities.CreditCard;
import com.engineering.commerce.entities.Customer;
import com.engineering.commerce.entities.Order;
import com.engineering.commerce.exception.CustomerException;
import com.engineering.commerce.exception.CustomerNotFoundException;

public interface CustomerService {
	public void createCustomer(Customer customer) throws CustomerException;
	
	public Customer getCustomer(int id);
		
	public List<Customer> getAllCustomers() throws CustomerNotFoundException;
	
	public void updateCustomer(Customer customer) throws CustomerNotFoundException;
		
	public void updateCreditCardDetails(Customer customer, CreditCard card) throws CustomerException;
		
	public void deleteCustomer(Customer customer) throws CustomerNotFoundException;
	
	public void updateAddress(Customer customer, Address address) throws CustomerException;
	}
