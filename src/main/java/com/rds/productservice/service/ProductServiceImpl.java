package com.rds.productservice.service;

import com.rds.productservice.model.Product;
import com.rds.productservice.repository.ProductRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Service
@Primary
public class ProductServiceImpl implements ProductService {


    private ProductRepository productRepository;
    private Scanner scanner;


    public ProductServiceImpl(ProductRepository productRepository, Scanner scanner) {
        this.productRepository = productRepository;
        this.scanner = scanner;
    }


    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
    }

    public void deleteProductById(long id) {
        productRepository.deleteById(id);
    }

    public Product updateQuantity(long id, int quantity) {

        Product product = getProductById(id);
        product.setQuantity(quantity);
        return productRepository.save(product);

    }
}
