package com.example.practice1.repository;

import com.example.practice1.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ProductRepository {
    private List<Product> list;
    public ProductRepository() {
        this.list = new ArrayList<>(
                List.of(
                        new Product(1,"Coca",10, 20.0),
                        new Product(2,"Fanta",10,1.5),
                        new Product(3,"Jinro",4,2.5)

                )
        );
    }
    public List<Product> getAllProduct(){
        return list;
    }

    public void addProduct(Product product) {
        list.add(product);
    }

    public Product searchById(Integer id) {
        return list.stream().filter(product -> product.getId().equals(id)).findFirst().orElse(null);
    }

    public void deleteProductById(Integer id) {
        list=list.stream().filter(product -> !product.getId().equals(id)).collect(Collectors.toList());
    }
}
