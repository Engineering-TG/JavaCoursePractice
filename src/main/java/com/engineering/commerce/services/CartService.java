package com.engineering.commerce.services;

import java.util.List;

import com.engineering.commerce.entities.Cart;
import com.engineering.commerce.entities.Cart.CartItem;

public interface CartService {
	public void createCart(int cartId);
	public List<CartItem> getCartById(int cartId);
	public void deleteCart(int cartId);
	public void addCartItem(int cartId, Cart.CartItem cartItem);
	public void updateCartItem(int cartId, int itemId, Cart.CartItem cartItem);
	public void deleteCartItem(int cartId, int itemId);

}
