package com.project.shop;

import com.project.shop.cart.CartService;
import com.project.shop.order.Order;
import com.project.shop.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ShopController {
    private final ProductService PS;
    private final OrderService OS;
    private final CartService CS;

    @Autowired
    public ShopController(ProductService PS, OrderService OS, CartService CS) {
        this.PS = PS;
        this.OS = OS;
        this.CS = CS;
    }

    @GetMapping("/products")
    public String products(Model model) {
        List<Product> lst = PS.getAllProducts();
        OrderForm orderForm = new OrderForm();
        model.addAttribute("something","products");
        model.addAttribute("productList", lst);
        model.addAttribute("quantity");
        model.addAttribute("orderForm", orderForm);
        return "products";
    }

    @PostMapping("/products")
    public String add(@ModelAttribute OrderForm orderForm) {
        for(OrderFormEntry O : orderForm.getEntries()) {
            Order order = new Order();
            order.setQuantity(O.getQuantity());
            Product product = new Product();
            product.setBarcode(O.getBarcode());
            order.setProduct(product);
        }
//        CS.saveCart(cart);
//        for (Order O : cart.getOrders()) {
//            OS.saveOrder(O);
//        }
        return "success";
    }

    @PostMapping("/count")
    public String count(@RequestParam long id) {
        Product p = PS.getProduct(id);
        int count = p.getCount();
        p.setCount(count+1);
        PS.saveProduct(p);
        return "products";
    }


    @GetMapping("/deleteProduct")
    public String deleteProduct(@RequestParam Long id) {
        PS.deleteProduct(id);
        return "redirect:/products";
    }

    @PostMapping("/addProduct")
    public String addProduct(@RequestBody Product p) {
        PS.saveProduct(p);
        return "redirect:/products";
    }
}
