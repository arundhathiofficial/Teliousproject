package com.telious.Controller;


import com.telious.Service.StockService;
import com.telious.StockEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StockController {

@Autowired
    StockService stockService;

    @PostMapping("/saveStock")
    public void saveStock(@RequestBody StockEntity stockEntity) {
        stockService.saveStock(stockEntity);
    }

    @GetMapping("/getStock/{stockId}")
    public StockEntity getStock(@PathVariable Long stockId) {
        return stockService.getStock(stockId);
        }

        @GetMapping("/getAllStocks")
        public List<StockEntity> getAllStock(){
            return stockService.getAllStock();
        }


    }

