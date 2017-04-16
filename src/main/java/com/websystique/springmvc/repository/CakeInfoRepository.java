package com.websystique.springmvc.repository;

import com.websystique.springmvc.model.CakeInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Alina on 15.04.2017.
 */
@Repository
public interface CakeInfoRepository extends JpaRepository<CakeInfo, Integer>{
    @Query("SELECT cki FROM CakeInfo cki WHERE cki.id = :id")
    CakeInfo findById(@Param("id") int id);
}
