package com.engineering.commerce.entities;

import java.util.ArrayList;
import java.util.List;


public class Cart {
	private int cartId;	
	private List<CartItem> cartItems = new ArrayList<>();
	private int customerId;
   
	public static class CartItem {
		private int cartId;
		private int productId;
		private int cartItemQuantity;
		
		public CartItem() {
			
		}
		
		public CartItem(int cartId, int productId, int cartItemQuantity) {
			super();
			this.cartId = cartId;
			this.productId = productId;
			this.cartItemQuantity = cartItemQuantity;
		}
		public int getCartId() {
			return cartId;
		}
		public void setCartId(int cartId) {
			this.cartId = cartId;
		}
		public int getProductId() {
			return productId;
		}
		public void setProductId(int productId) {
			this.productId = productId;
		}
		public int getCartItemQuantity() {
			return cartItemQuantity;
		}
		public void setCartItemQuantity(int cartItemQuantity) {
			this.cartItemQuantity = cartItemQuantity;
		}	
		
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public List<CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
}

