package com.websystique.springmvc.repository;

import com.websystique.springmvc.model.OrderCakes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Alina on 15.04.2017.
 */
@Repository
public interface OrderCakesRepository extends JpaRepository<OrderCakes, Integer> {
@Query("SELECT ock FROM OrderCakes ock WHERE ock.id = :id")
    OrderCakes findById(@Param("id") int id);
}
