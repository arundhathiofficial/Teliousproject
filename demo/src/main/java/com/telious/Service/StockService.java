package com.telious.Service;

import com.telious.Repository.StockRepository;
import com.telious.StockEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockService {

@Autowired
    StockRepository stockRepository;

    public void saveStock(StockEntity stockEntity){
        stockRepository.save(stockEntity);
    }

    public StockEntity getStock(Long stockId){
        return stockRepository.findById(stockId).get();
    }
}
