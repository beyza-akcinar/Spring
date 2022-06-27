package com.project.shop;

import javax.persistence.*;

@Entity
@Table
public class Product {
    private String name;
    @Id
    @SequenceGenerator(name="s", sequenceName = "s", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "s")
    private Long barcode;
    private String description;
    private int count;

    public Product(String name, String description) {
        this.name = name;
        this.description = description;
        this.count = 0;
    }

    public Product(String name, Long barcode, String description) {
        this.name = name;
        this.barcode = barcode;
        this.description = description;
        this.count = 0;
    }

    public Product() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getBarcode() {
        return barcode;
    }

    public void setBarcode(Long barcode) {
        this.barcode = barcode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
