package com.websystique.springmvc.repository;

import com.websystique.springmvc.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Alina on 15.04.2017.
 */
@Repository
public interface ImageRepository extends JpaRepository<Image, Integer>{
    @Query("SELECT im FROM Image im WHERE im.id = :id")
    Image findById(@Param("id") int id);
}
