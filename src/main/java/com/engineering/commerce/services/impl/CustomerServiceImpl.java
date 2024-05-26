package com.engineering.commerce.services.impl;

import java.util.List;

import com.engineering.commerce.daos.CustomerDAO;
import com.engineering.commerce.entities.Address;
import com.engineering.commerce.entities.CreditCard;
import com.engineering.commerce.entities.Customer;
import com.engineering.commerce.entities.Order;
import com.engineering.commerce.exception.CustomerException;
import com.engineering.commerce.exception.CustomerNotFoundException;
import com.engineering.commerce.services.CustomerService;


public class CustomerServiceImpl implements CustomerService{

	private final CustomerDAO customerDAO;
	
	public CustomerServiceImpl(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	@Override
	public void createCustomer(Customer customer) throws CustomerException {
		customerDAO.addCustomer(customer);
	}
	
	@Override
	public Customer getCustomer(int id) {
		return customerDAO.getCustomerById(id);
	}

	public List<Customer> getAllCustomers() throws CustomerNotFoundException {
		return customerDAO.getAllCustomers();
	}

	@Override
	public void updateCustomer(Customer customer) throws CustomerNotFoundException {
		customerDAO.updateCustomer(customer);
	}

	@Override
	public void updateCreditCardDetails(Customer customer, CreditCard card) throws CustomerException {
		customerDAO.updateCustomer(customer);
	}

	@Override
	public void deleteCustomer(Customer customer) throws CustomerNotFoundException {
		customerDAO.deleteCustomer(customer.getCustomerId());
	}


	@Override
	public void updateAddress(Customer customer, Address address) throws CustomerException {
		customerDAO.updateCustomer(customer);
		
	}
	

}
