package com.project.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository PR;

    @Autowired
    public ProductService(ProductRepository PR) {
        this.PR = PR;
    }

    public List<Product> getAllProducts() {
        return  PR.findAll();
    }

    public void saveProduct(Product p) {
        PR.save(p);
    }

    public Product getProduct(long id) {
        return  PR.findById(id).orElse(null);
    }

    public void deleteProduct(long id) {
        PR.deleteById(id);
    }
}
