package com.websystique.springmvc.service.impl;



import com.websystique.springmvc.model.OrderCakes;
import com.websystique.springmvc.repository.OrderCakesRepository;
import com.websystique.springmvc.service.OrderCakesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Alina on 16.04.2017.
 */
@Service
public class OrderCakesServiceImpl implements OrderCakesService {
    @Autowired
    OrderCakesRepository orderCakesRepository;

    @Override
    public OrderCakes findById(int id) {
        return orderCakesRepository.findById(id);
    }

    @Override
    public List<OrderCakes> findAllOrderCakes() {
        return orderCakesRepository.findAll();
    }

    @Override
    public void saveOrderCakes(OrderCakes orderCakes) {
        orderCakesRepository.saveAndFlush(orderCakes);
    }

    @Override
    public void updateOrderCakes(OrderCakes orderCakes) {
       OrderCakes savedOrderCakes = orderCakesRepository.findById(orderCakes.getId());

       if(savedOrderCakes!=null) {
           savedOrderCakes.setAmount(orderCakes.getAmount());
           savedOrderCakes.setDateOrder(orderCakes.getDateOrder());
           savedOrderCakes.setClient(orderCakes.getClient());
           savedOrderCakes.setCakes(orderCakes.getCakes());
       }
    }

    @Override
    public void deleteOrderCakes(int id) {
      orderCakesRepository.delete(id);
    }
}
