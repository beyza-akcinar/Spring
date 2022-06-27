package com.project.shop;

import org.springframework.core.convert.converter.Converter;
import com.project.shop.order.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class OrderConverter implements Converter<String, Order> {
    @Override
    public Order convert(String id) {
        Long parseID = Long.parseLong(id);
        List<Product> products = Arrays.asList(
                new Product("ice tea",1L, "tea"),
                new Product("caramel latte",2L, "coffee"),
                new Product("vanilla latte",3L, "coffee")
        );
        List<Order> orders = Arrays.asList(
                new Order(products.get(0),products.get(0).getCount()),
                new Order(products.get(1),products.get(1).getCount()),
                new Order(products.get(2),products.get(2).getCount())
        );

        int index = (int) (parseID -1);

        return orders.get(index);
    }

}
