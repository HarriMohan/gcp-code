package com.rds.productservice.api;

import com.rds.productservice.model.Product;
import com.rds.productservice.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private ProductService productService;


    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") long id) {
        return productService.getProductById(id);
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable("id") long id) {
        productService.deleteProductById(id);
    }

    @PatchMapping("/{id}/quantity/{quantity}")
    public Product updateQuantity(@PathVariable("id") long id, @PathVariable("quantity") int quantity) {
        return productService.updateQuantity(id, quantity);
    }


}
