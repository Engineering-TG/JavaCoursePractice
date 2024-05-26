package com.engineering.commerce.daos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.engineering.commerce.entities.Cart.CartItem;

public class CartDAO {
	private Map<Integer, List<CartItem>> carts;
	
	public CartDAO() {
		carts = new HashMap<>();
	}
	
	public void create(int cartId) {
		carts.put(cartId, new ArrayList<>());
	}
	
	public List<CartItem> getCartById(int cartId) {
		return carts.getOrDefault(cartId,  new ArrayList<>());
	}
	
	public void deleteCart(int cartId) {
		carts.remove(cartId);
	}
	
	public void addCartItem(int cartId, CartItem cartItem) {
		List<CartItem> items = carts.getOrDefault(cartId, new ArrayList<>());
		items.add(cartItem);
		carts.put(cartId, items);
	}

	
	public void updateCartItem(int cartId, int itemId, CartItem cartItem) {
		List<CartItem> cartItemList = carts.getOrDefault(cartId, new ArrayList<>());
		for(int i = 0; i < cartItemList.size(); i++) {
			if(cartItemList.get(i).getCartId() == itemId) {
				cartItemList.set(i, cartItem);
				carts.put(cartId, cartItemList);
				return;
			}
		}
		throw new IllegalArgumentException("CartItem with id " + itemId+ "not found");
	}
	
	public void deleteCartItem(int cartId, int itemId) {
		List<CartItem> cartItemList = carts.getOrDefault(cartId, new ArrayList<>());
		cartItemList.removeIf(item -> item.getProductId() == itemId);
		carts.put(cartId, cartItemList);
	}
}
