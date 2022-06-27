package com.project.shop.cart;

import com.project.shop.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CartController {

    private final CartService CS;
    private final OrderService OS;

    @Autowired
    public CartController(CartService CS, OrderService OS) {
        this.CS = CS;
        this.OS = OS;
    }

}
