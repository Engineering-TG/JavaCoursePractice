package com.engineering.commerce.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {

	private Integer orderId;
	private LocalDate date;
	private OrderStatusValues orderStatus;
	private Integer customerId;
	private Integer paymentId;
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
 
	
	public Order(Integer orderId, LocalDate date, OrderStatusValues orderStatus, Integer customerId, Integer paymentId,
			Integer addressId, List<OrderDetails> orderDetails) {
		this.orderId = orderId;
		this.date = date;
		this.orderStatus = orderStatus;
		this.customerId = customerId;
		this.paymentId = paymentId;
		this.addressId = addressId;
		this.orderDetails = orderDetails;
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

	public OrderStatusValues getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatusValues orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
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

