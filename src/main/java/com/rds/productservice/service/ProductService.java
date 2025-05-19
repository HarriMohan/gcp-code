package com.rds.productservice.service;

import com.rds.productservice.model.Product;

import java.util.List;

public interface ProductService {

    Product addProduct(Product product);

    List<Product> getAllProducts();

    Product getProductById(long id);

    void deleteProductById(long id);

    Product updateQuantity(long id, int quantity);

}
