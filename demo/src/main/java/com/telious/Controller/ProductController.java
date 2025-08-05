package com.telious.Controller;

import com.telious.ProductEntity;
import com.telious.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

@GetMapping("/getAll")
    public List<ProductEntity> getAllProduct(){
        return productService.getAllProduct();

    }
}
