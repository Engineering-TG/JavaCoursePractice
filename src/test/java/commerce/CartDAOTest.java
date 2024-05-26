package commerce;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.engineering.commerce.daos.CartDAO;
import com.engineering.commerce.entities.Cart.CartItem;

public class CartDAOTest {
	
	private CartDAO cartDAO;
	
	@Before
	public void setUp() {
		cartDAO = new CartDAO();
	}
	
	@Test
	public void testCreateCart() {
		cartDAO.create(1);
		assertTrue(cartDAO.getCartById(1).isEmpty());
	}
	
	@Test
	public void testDeleteCart() {
		cartDAO.create(1);
		CartItem item = new CartItem(1, 101, 2);
		cartDAO.addCartItem(1, item);
		
		cartDAO.deleteCart(1);
		assertTrue(cartDAO.getCartById(1).isEmpty());
	}
	
	@Test
	public void testAddCartItem() {
		cartDAO.create(1);
		CartItem item = new CartItem(1, 101, 2);
		cartDAO.addCartItem(1, item);
		
		List<CartItem> items = cartDAO.getCartById(1);
		assertEquals(1, items.size());
		assertEquals(101, items.get(0).getProductId());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testUpdateNonExistentCartItem() {
		cartDAO.create(1);
		CartItem updatedItem = new CartItem(1, 101, 5);
		cartDAO.updateCartItem(1, 2, updatedItem);
	}
}
