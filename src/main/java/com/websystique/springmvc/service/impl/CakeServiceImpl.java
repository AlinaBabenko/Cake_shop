package com.websystique.springmvc.service.impl;

import com.websystique.springmvc.model.Cake;
import com.websystique.springmvc.repository.CakeRepository;
import com.websystique.springmvc.service.CakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Alina on 16.04.2017.
 */
@Service
public class CakeServiceImpl implements CakeService {
    @Autowired
    private CakeRepository cakeRepository;

    @Override
    public Cake findById(int id) {
        return cakeRepository.findById(id);
    }

    @Override
    public List<Cake> findAllCakes() {
        return cakeRepository.findAll();
    }

    @Override
    public void saveCake(Cake cake) {
        cakeRepository.saveAndFlush(cake);
    }

    @Override
    public void updateCake(Cake cake) {
     Cake savedCake = cakeRepository.findById(cake.getId());

     if(savedCake!=null) {
         savedCake.setWeight(cake.getWeight());
         savedCake.setQuantity(cake.getQuantity());
         savedCake.setPriceForOneKilo(cake.getPriceForOneKilo());
         savedCake.setPriceCake(cake.getPriceCake());
         savedCake.setOrderCakes(cake.getOrderCakes());
         savedCake.setCakeInfo(cake.getCakeInfo());
     }
    }

    @Override
    public void deleteCake(int id) {
      cakeRepository.delete(id);
    }
}
