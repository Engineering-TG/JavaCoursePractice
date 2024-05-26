package com.engineering.commerce.services;

import java.util.List;

import com.engineering.commerce.entities.Order;

public interface OrderService {

    Order addOrder(Order order);
    Order getOrder(int id);
    List<Order> getAllOrders();
    void updateOrder(Order order);
    void deleteOrder(int id);
}
