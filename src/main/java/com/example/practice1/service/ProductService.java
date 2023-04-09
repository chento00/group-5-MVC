package com.example.practice1.service;

import com.example.practice1.model.Product;
import java.util.List;
public interface ProductService {
    List<Product> getAllProduct();

    void addProduct(Product product);

    Product searchById(Integer id);

    void deleteProductById(Integer id);
}
