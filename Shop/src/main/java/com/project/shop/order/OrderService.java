package com.project.shop.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository OR;

    @Autowired
    public OrderService(OrderRepository OR) {
        this.OR = OR;
    }

    public List<Order> getAllOrders() {
        return  OR.findAll();
    }

    public Order saveOrder(Order order) {
        return OR.save(order);
    }





}
