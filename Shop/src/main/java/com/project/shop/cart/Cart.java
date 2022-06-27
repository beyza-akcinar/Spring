package com.project.shop.cart;

import com.project.shop.order.Order;

import javax.persistence.*;
import java.util.List;

@Table(name = "carts")
@Entity
public class Cart {
    @Id
    @SequenceGenerator(name="c", sequenceName = "c", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "c")
    private Long id;

    @Transient
    @OneToMany(cascade = CascadeType.MERGE)
    private List<Order> orders;

    public Cart(List<Order> orders) {
        this.orders = orders;
    }

    public Cart() {
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
