package com.project.shop.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class OrderController {

    private final OrderService OS;

    @Autowired
    public OrderController(OrderService OS) {
        this.OS = OS;
    }


    @PostMapping("/addOrder")
    public String addOrder(@RequestBody Order order) {
        OS.saveOrder(order);
        return "success";
    }


}
