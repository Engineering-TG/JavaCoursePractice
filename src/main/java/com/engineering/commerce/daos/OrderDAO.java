package com.engineering.commerce.daos;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.engineering.commerce.entities.Order;

public class OrderDAO {
	private List<Order> orders = new ArrayList<>();
	private int currentId = 1;

	public void addOrder(Order order){
		order.setOrderId(currentId++);
		orders.add(order);
	}

	public Order getOrder(int id){
		Optional<Order> order = orders.stream().filter(o -> o.getOrderId() == id).findFirst();
		return order.orElse(null);
	}

	public List<Order> getAllOrder(){
		return new ArrayList<>(orders);
	}

	public void updateOrder(Order order){
		for(int i = 0; i < orders.size(); i++){
			if(orders.get(i).getOrderId() == order.getOrderId()){
				orders.set(i, order);
				return;
			}
		}
	}

	public void deleteOrder(int id){
		orders.removeIf(order -> order.getOrderId() == id);
	}
}
