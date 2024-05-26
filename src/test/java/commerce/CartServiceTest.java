package commerce;

import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.engineering.commerce.daos.CartDAO;
import com.engineering.commerce.entities.Cart.CartItem;
import com.engineering.commerce.services.impl.CartServiceImpl;

public class CartServiceTest {
	
	@Mock
	private CartDAO cartDAO;
	
	private CartServiceImpl cartService;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		cartService = new CartServiceImpl(cartDAO);
	}
	
	@Test
	public void testCreateCart() {
		cartService.createCart(1);
		verify(cartDAO).create(1);
	}
	
	@Test
	public void testUpdateCartItem() {
		CartItem updatedItem = new CartItem(1, 101, 5);
		cartService.updateCartItem(1, 1, updatedItem);
		verify(cartDAO).updateCartItem(1, 1, updatedItem);
	}
}
