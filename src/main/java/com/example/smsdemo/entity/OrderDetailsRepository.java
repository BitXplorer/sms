package com.example.smsdemo.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetails,Integer> {

    //Optional<OrderDetails> findById (Integer id_order);
    //List<OrderDetails> findOrderByOrder_id_order (Integer Order_id_order);

}