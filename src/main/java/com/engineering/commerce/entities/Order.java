package com.engineering.commerce.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {

	private Integer orderId;
	private LocalDate date;
	private Integer customerId;
	private Integer addressId;
	private List<OrderDetails> orderDetails = new ArrayList<>();
	
	public Order() {
		
	}
	
	public static class OrderDetails {
		
		private Integer orderId;
		private Integer productId;
		private Integer quantity;
		private Double price;
		
	}
 

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public List<OrderDetails> getOrdercartItems() {
		return orderDetails;
	}

	public void setOrdercartItems(List<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
	}

   
}

