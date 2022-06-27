package com.project.shop.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    private final CartRepository CR;

    @Autowired
    public CartService(CartRepository CR) {
        this.CR = CR;
    }

    public List<Cart> getAllCarts() {
        return  CR.findAll();
    }

    public Cart saveCart(Cart cart) {
        return CR.save(cart);
    }



}
