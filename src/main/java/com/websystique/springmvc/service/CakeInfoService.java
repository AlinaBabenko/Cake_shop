package com.websystique.springmvc.service;

import com.websystique.springmvc.model.CakeInfo;
import com.websystique.springmvc.model.Client;

import java.util.List;

/**
 * Created by Alina on 15.04.2017.
 */
public interface CakeInfoService  {
    CakeInfo findById(int id);
    List<CakeInfo> findAllCakeInfo();

    void saveCakeInfo(CakeInfo cakeInfo);

    void updateCakeInfo(CakeInfo cakeInfo);

    void deleteCakeInfo(int id);
}
