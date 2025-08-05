package com.telious;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Product_Table")
@NoArgsConstructor
public class ProductEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="product_id")
    public Long id;

    @Column(name="product_name")
    public String name;

    @Column(name="product_category")
    public String category;

    @Column(name="product_price")
    public Double price;

    @Column(name="Available_stock")
    public Integer stockAvail;

    public ProductEntity(Long id, String name, String category, Double price, Integer stockAvail) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.stockAvail = stockAvail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStockAvail() {
        return stockAvail;
    }

    public void setStockAvail(Integer stockAvail) {
        this.stockAvail = stockAvail;
    }
}
