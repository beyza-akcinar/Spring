package com.project.shop.order;

import com.project.shop.Product;

import javax.persistence.*;

@Table(name = "orders")
@Entity
public class Order {
    @Id
    @SequenceGenerator(name="o", sequenceName = "o", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "o")
    private Long id;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(nullable = true)
    private Product product;

    private int quantity;

    public Order() {

    }

    public Order(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
