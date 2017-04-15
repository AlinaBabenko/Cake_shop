package com.websystique.springmvc.repository;

import com.websystique.springmvc.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Alina on 15.04.2017.
 */
public interface ImageRepository extends JpaRepository<Image, Integer>{
}
