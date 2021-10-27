package com.example.smsdemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {


    //Optional<Order> findById (Integer id_order);
    Optional<Order> findById (Integer id_order);

}
