package com.websystique.springmvc.service;

import com.websystique.springmvc.model.Image;

import java.util.List;

/**
 * Created by Alina on 15.04.2017.
 */
public interface ImageService {
    Image findById(int id);
    List<Image> findAllImages();

    void saveImage(Image image);

    void updateImage(Image image);

    void deleteImage(int id);

}
