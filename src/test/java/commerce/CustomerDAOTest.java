package commerce;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.engineering.commerce.daos.CustomerDAO;
import com.engineering.commerce.entities.Customer;

public class CustomerDAOTest {
	
	private CustomerDAO customerDAO;
	
	@Before
	public void setUp() {
		customerDAO = new CustomerDAO();
	}
	
	@Test
	public void testCreate() {
		Customer customer = new Customer();
		customer.setFirstName("TestFistName");
		customer.setLastName("TestLastName");
		customer.setEmail("test@example.com");
		customer.setPassword("test123");
		
		customerDAO.addCustomer(customer);
		Customer fetchedCustomer = customerDAO.getCustomerById(customer.getCustomerId());
		assertEquals(customer, fetchedCustomer);
	}
	
	@Test
	public void testRead() {
		Customer customer = customerDAO.getCustomerById(1);
		assertNull(customer);
	}
}
