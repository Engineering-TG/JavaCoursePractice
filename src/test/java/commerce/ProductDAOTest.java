package commerce;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.engineering.commerce.daos.ProductDAO;
import com.engineering.commerce.entities.Product;

public class ProductDAOTest {
	
	@Test
	public void getAllProducts() {
		ProductDAO productDAO = new ProductDAO();
		productDAO.addProduct(new Product());
		productDAO.addProduct(new Product());
		assertEquals(2, productDAO.getAllProducts().size());
	}
	
}
