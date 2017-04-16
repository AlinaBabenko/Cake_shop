package com.websystique.springmvc.repository;

import com.websystique.springmvc.model.Client;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by Alina on 16.04.2017.
 */
public interface ClientRepository extends JpaRepository<Client, Integer> {
    @Query("SELECT c FROM Client c WHERE c.id = :id")
    Client findById(@Param("id") int id);

}
