package com.websystique.springmvc.repository;

import com.websystique.springmvc.model.Cake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Alina on 15.04.2017.
 */
@Repository
public interface CakeRepository extends JpaRepository<Cake, Integer>{
    @Query("SELECT ck FROM Cake ck WHERE ck.id = :id")
    Cake findById(@Param("id") int id);

}
