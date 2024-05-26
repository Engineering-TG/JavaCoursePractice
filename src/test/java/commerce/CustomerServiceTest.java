package commerce;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.engineering.commerce.daos.CustomerDAO;
import com.engineering.commerce.entities.Customer;
import com.engineering.commerce.services.impl.CustomerServiceImpl;

public class CustomerServiceTest {
	@Mock
	private CustomerDAO customerDAO;
	
	private CustomerServiceImpl customerService;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		
		customerService = new CustomerServiceImpl(customerDAO);
		
		Customer customer = new Customer();
		
		customer.setCustomerId(1);
		customer.setFirstName("John");
		customer.setEmail("john@example.com");
		
		when(customerDAO.getCustomerById(1)).thenReturn(customer);
	}
	
	@Test
	public void testGetCustomerById() {
		Customer customer = customerService.getCustomer(1);
		
		verify(customerDAO).getCustomerById(1);
		
		assertNotNull(customer);
		assertEquals(1, customer.getCustomerId());
		assertEquals("John", customer.getFirstName());
		assertEquals("john@example.com", customer.getEmail());
		
	}
	
	@Test
	public void testUpdateCustomer() {
		Customer customerToUpdate = new Customer();
		customerToUpdate.setCustomerId(1);
		customerToUpdate.setFirstName("Update Name");
		customerToUpdate.setEmail("update@example.com");
		
		doNothing().when(customerDAO).updateCustomer(customerToUpdate);
		customerService.updateCustomer(customerToUpdate);
		verify(customerDAO).updateCustomer(customerToUpdate);
	}
	
	@Test
	public void testDeleteCustomer() {
		Customer customerToDelete = new Customer();
		customerToDelete.setCustomerId(1);
		
		doNothing().when(customerDAO).deleteCustomer(customerToDelete.getCustomerId());
		customerService.deleteCustomer(customerToDelete);
		verify(customerDAO).deleteCustomer(customerToDelete.getCustomerId());

	}
}
