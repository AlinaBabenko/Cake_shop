package com.websystique.springmvc.service.impl;

import com.websystique.springmvc.model.CakeInfo;
import com.websystique.springmvc.repository.CakeInfoRepository;
import com.websystique.springmvc.service.CakeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Alina on 16.04.2017.
 */
@Service
public class CakeInfoServiceImpl implements CakeInfoService {
    @Autowired
    CakeInfoRepository cakeInfoRepository;

    @Override
    public CakeInfo findById(int id) {
        return cakeInfoRepository.findById(id);
    }

    @Override
    public List<CakeInfo> findAllCakeInfo() {
        return cakeInfoRepository.findAll();
    }

    @Override
    public void saveCakeInfo(CakeInfo cakeInfo) {
        cakeInfoRepository.saveAndFlush(cakeInfo);
    }

    @Override
    public void updateCakeInfo(CakeInfo cakeInfo) {
         CakeInfo savedCakeInfo = cakeInfoRepository.findById(cakeInfo.getId());
         if(savedCakeInfo!=null) {
             savedCakeInfo.setNameCake(cakeInfo.getNameCake());
             savedCakeInfo.setDescription(cakeInfo.getDescription());
             savedCakeInfo.setMinWeight(cakeInfo.getMinWeight());
             savedCakeInfo.setImages(cakeInfo.getImages());
         }
    }

    @Override
    public void deleteCakeInfo(int id) {
        cakeInfoRepository.delete(id);
    }
}
