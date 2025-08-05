package com.telious.Controller;

import com.telious.ProductEntity;
import com.telious.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

@Autowired
    ProductService productService;

@PostMapping("/saveProduct")
public void saveProduct(@RequestBody ProductEntity productEntity){
    productService.saveProduct(productEntity);
}

@GetMapping("/getProduct/{id}")
public ProductEntity getProduct(@PathVariable Long id){
    return productService.getProduct(id);

}
}
