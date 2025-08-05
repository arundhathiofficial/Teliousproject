package com.telious;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Stock_Table")
@AllArgsConstructor
@NoArgsConstructor
public class StockEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="StockId")
     public Long stockId;

     @Column(name="TotalStock")
     public Integer totalStock;

     @Column(name="StockName")
     public String stockOwner;

    public Long getStockId() {
        return stockId;
    }

    public void setStockId(Long stockId) {
        this.stockId = stockId;
    }

    public Integer getTotalStock() {
        return totalStock;
    }

    public void setTotalStock(Integer totalStock) {
        this.totalStock = totalStock;
    }

    public String getStockOwner() {
        return stockOwner;
    }

    public void setStockOwner(String stockOwner) {
        this.stockOwner = stockOwner;
    }
}
