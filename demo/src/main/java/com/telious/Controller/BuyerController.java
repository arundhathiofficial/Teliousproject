package com.telious.Controller;


import com.telious.BuyerEntity;
import com.telious.Service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
public class BuyerController {

@Autowired
    BuyerService buyerService;


    @PostMapping("/saveBuyer")
    public void saveBuyer(@RequestBody BuyerEntity buyerEntity){
        buyerService.saveBuyer(buyerEntity);

    }
    @GetMapping("/getBuyer/{buyerId}")
    public BuyerEntity getBuyer(@PathVariable Long buyerId){
        return  buyerService.getBuyer(buyerId);

    }


}
