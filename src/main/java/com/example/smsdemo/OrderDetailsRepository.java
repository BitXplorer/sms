package com.example.smsdemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetails,Integer> {

    //Optional<OrderDetails> findById (Integer id_order);
    //List<OrderDetails> findOrderByOrder_id_order (Integer Order_id_order);

}