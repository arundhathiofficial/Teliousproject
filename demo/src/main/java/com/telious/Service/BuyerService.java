package com.telious.Service;


import com.telious.BuyerEntity;
import com.telious.Repository.BuyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyerService {


@Autowired
    BuyerRepository buyerRepository;

    public void saveBuyer(BuyerEntity buyerEntity){
        buyerRepository.save(buyerEntity);
    }


    public BuyerEntity getBuyer(Long buyerId) {
       return buyerRepository.findById(buyerId).get();
    }
}
