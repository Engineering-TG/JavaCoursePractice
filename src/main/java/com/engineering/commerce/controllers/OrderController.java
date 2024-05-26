package com.engineering.commerce.controllers;

import java.util.List;

import com.engineering.commerce.entities.Order;
import com.engineering.commerce.services.OrderService;

public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }

    public Order addOrder(Order order){
        return orderService.addOrder(order);
    }

    public Order getOder(int id){
        Order order = orderService.getOrder(id);
        return order;
    }

    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    public Order updateOrder(int id, Order order){
        Order existingOrder = orderService.getOrder(id);
        if(existingOrder != null){
            order.setOrderId(order.getOrderId());
        }
		return existingOrder;
    }
}
