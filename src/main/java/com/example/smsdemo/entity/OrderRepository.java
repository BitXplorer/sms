package com.example.smsdemo.entity;

import com.example.smsdemo.service.PersistenceManager;
import org.mariadb.jdbc.internal.logging.Logger;
import org.mariadb.jdbc.internal.logging.LoggerFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {


    //Optional<Order> findById (Integer id_order);
    //Optional<Order> findById (Integer id_order);

}
