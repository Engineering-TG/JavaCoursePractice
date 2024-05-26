package com.engineering.commerce.services.impl;

import java.util.List;

import com.engineering.commerce.daos.OrderDAO;
import com.engineering.commerce.entities.Order;
import com.engineering.commerce.services.OrderService;

public class OrderServiceImpl implements OrderService{
    private OrderDAO orderDAO;

    public OrderServiceImpl(OrderDAO orderDAO){
        this.orderDAO = orderDAO;
    }

    @Override
    public Order addOrder(Order order){
        orderDAO.addOrder(order);
		return order;
    }

    @Override
    public Order getOrder(int id){
        return orderDAO.getOrder(id);
    }

    @Override
    public List<Order> getAllOrders(){
        return orderDAO.getAllOrder();
    }

    @Override
    public void deleteOrder(int id){
        orderDAO.deleteOrder(id);
    }

	@Override
	public void updateOrder(Order order) {
		orderDAO.updateOrder(order);
		
	}
}
