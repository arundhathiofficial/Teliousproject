package com.telious.Service;

import com.telious.ProductEntity;
import com.telious.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

@Autowired
    ProductRepository productRepository;

    public void saveProduct(ProductEntity productEntity){
        productRepository.save(productEntity);
    }

   public ProductEntity getProduct(Long id){
        return productRepository.findById(id).get();

   }

    public List<ProductEntity> getAllProduct() {
        return productRepository.findAll();
    }
}
