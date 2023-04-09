package com.example.practice1.controller;

import com.example.practice1.model.Product;
import com.example.practice1.service.ProductServiceImp;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private final ProductServiceImp serviceImp;

    public ProductController(ProductServiceImp serviceImp) {
        this.serviceImp = serviceImp;
    }

    @GetMapping("/product")
    List<Product> getAllProduct() {
        return serviceImp.getAllProduct();
    }

    @PostMapping("/product")
    void addProduct(@RequestBody Product product) {
        serviceImp.addProduct(product);
    }

    @GetMapping("/product/{id}")
    Product searchById(@PathVariable Integer id) {
        return serviceImp.searchById(id);
    }
    @DeleteMapping("/product/{id}")
    void deleteProduct(@PathVariable Integer id){
        serviceImp.deleteProductById(id);
    }
}
