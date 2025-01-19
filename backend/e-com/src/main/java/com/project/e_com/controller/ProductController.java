package com.project.e_com.controller;


import com.project.e_com.model.Product;
import com.project.e_com.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {


    @Autowired
    ProductService productService;

    @GetMapping("/getProducts")
    public List<Product> getProducts(){
         return productService.getProducts();
    }

    @GetMapping("/getProduct/{id}")
    public Product getProductById(@PathVariable  String id){
        return productService.getProductById(id);
    }

    @PostMapping("/addProduct")
    public void addProduct(@RequestBody Product product){
        productService.addProduct(product);
    }



}
