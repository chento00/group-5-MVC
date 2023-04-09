package com.example.practice1.service;

import com.example.practice1.model.Product;
import com.example.practice1.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ProductServiceImp implements ProductService{
    private final ProductRepository repository;

    public ProductServiceImp(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Product> getAllProduct() {
        return repository.getAllProduct();
    }

    @Override
    public void addProduct(Product product) {
        repository.addProduct(product);
    }

    @Override
    public Product searchById(Integer id) {
       return repository.searchById(id);
    }

    @Override
    public void deleteProductById(Integer id) {
        repository.deleteProductById(id);
    }
}
