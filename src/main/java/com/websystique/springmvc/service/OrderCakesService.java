package com.websystique.springmvc.service;

import com.websystique.springmvc.model.Client;
import com.websystique.springmvc.model.OrderCakes;

import java.util.List;

/**
 * Created by Alina on 15.04.2017.
 */
public interface OrderCakesService  {
    OrderCakes findById(int id);
    List<OrderCakes> findAllOrderCakes();

    void saveOrderCakes(OrderCakes orderCakes);

    void updateOrderCakes(OrderCakes orderCakes);

    void deleteOrderCakes(int id);

}
