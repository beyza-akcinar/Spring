package com.project.shop;

import com.project.shop.cart.CartRepository;
import com.project.shop.order.OrderRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.util.List;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    CommandLineRunner commandLineRunner(ProductRepository PR, OrderRepository OR, CartRepository CR) {
        return args -> {
            Product P1 = new Product(
                    "ice tea",
                    "tea"
            );

            Product P2 = new Product(
                    "caramel latte",
                    "coffee"
            );

            Product P3 = new Product(
                    "vanilla latte",
                    "coffee"
            );

            PR.saveAll(
                    List.of(P1, P2, P3)
            );
        };
    }
}
