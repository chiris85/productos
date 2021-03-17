package com.christian.productos.service;

import com.christian.productos.entity.Product;
import com.christian.productos.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/*Service implementation*/
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public List<Product> listAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        Product productDB = getProduct(product.getId());
        if (null == productDB){
            return null;
        }
        productDB.setId(product.getId());
        productDB.setTitle(product.getTitle());
        productDB.setImage(product.getImage());
        productDB.setPrice(product.getPrice());
        productDB.setDescription(product.getDescription());
        return productRepository.save(productDB);
    }

    @Override
    public Product deleteProduct(Long id) {
        Product productDB = getProduct(id);
        if (null == productDB){
            return null;
        }
        productRepository.deleteById(productDB.getId());
        return productDB;
    }
}
