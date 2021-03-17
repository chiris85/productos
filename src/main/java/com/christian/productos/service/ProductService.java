package com.christian.productos.service;

import com.christian.productos.entity.Product;

import java.util.List;

public interface ProductService {
    public List<Product> listAllProducts();
    public Product getProduct(Long id);
    public Product createProduct(Product product);
    public Product updateProduct(Product product);
    public Product deleteProduct(Long id);
}
