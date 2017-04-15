package com.websystique.springmvc.service;

import com.websystique.springmvc.model.Cake;
import com.websystique.springmvc.model.Client;

import java.util.List;

/**
 * Created by Alina on 15.04.2017.
 */
public interface CakeService {
    Cake findById(int id);
    List<Cake> findAllCakes();

    void saveCake(Cake cake);

    void updateCake(Cake cake);

    void deleteCake(int id);
}
