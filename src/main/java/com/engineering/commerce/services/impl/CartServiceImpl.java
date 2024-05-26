package com.engineering.commerce.services.impl;

import java.util.List;

import com.engineering.commerce.daos.CartDAO;
import com.engineering.commerce.entities.Cart.CartItem;
import com.engineering.commerce.services.CartService;

public class CartServiceImpl implements CartService {
	private CartDAO cartDAO;
	
	public CartServiceImpl(CartDAO cartDAO) {
		this.cartDAO = cartDAO;
	}
	
	@Override
	public void createCart(int cartId) {
		cartDAO.create(cartId);
	}

	@Override
	public List<CartItem> getCartById(int cartId) {
		return cartDAO.getCartById(cartId);
	}

	@Override
	public void deleteCart(int cartId) {
		cartDAO.deleteCart(cartId);
	}

	@Override
	public void addCartItem(int cartId, CartItem cartItem) {
		cartDAO.addCartItem(cartId, cartItem);
	}

	@Override
	public void updateCartItem(int cartId, int itemId, CartItem cartItem) {
		cartDAO.updateCartItem(cartId, itemId, cartItem);
	}

	@Override
	public void deleteCartItem(int cartId, int itemId) {
		cartDAO.deleteCartItem(cartId, itemId);
	}

}
