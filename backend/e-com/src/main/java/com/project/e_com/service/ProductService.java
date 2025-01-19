package com.project.e_com.service;

import com.project.e_com.model.Product;
import com.project.e_com.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    public List<Product> getProducts(){
        return repository.findAll();
    }

    public Product getProductById(String id){
        return repository.findById(id).orElse(new Product());
    }

    public void addProduct(Product product){
        repository.save(product);
    }

    public void updateProduct(Product product){
        repository.save(product);
    }

    public void deleteProduct(String id){
        repository.deleteById(id);
    }
}
