package com.websystique.springmvc.repository;

import com.websystique.springmvc.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Created by Alina on 15.04.2017.
 */
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
