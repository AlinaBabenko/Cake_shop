package com.websystique.springmvc.service.impl;

import com.websystique.springmvc.model.Image;
import com.websystique.springmvc.repository.ImageRepository;
import com.websystique.springmvc.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Alina on 16.04.2017.
 */
@Service
public class ImageServiceImpl implements ImageService{
    @Autowired
    ImageRepository imageRepository;

    @Override
    public Image findById(int id) {
        return imageRepository.findById(id);
    }

    @Override
    public List<Image> findAllImages() {
        return imageRepository.findAll();
    }

    @Override
    public void saveImage(Image image) {
        imageRepository.saveAndFlush(image);
    }

    @Override
    public void updateImage(Image image) {
        Image savedImage = imageRepository.findById(image.getId());

        if (savedImage!=null) {
            savedImage.setContent(image.getContent());
            savedImage.setCakeInfo(image.getCakeInfo());
        }
    }

    @Override
    public void deleteImage(int id) {
        imageRepository.delete(id);
    }
}
