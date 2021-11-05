package com.example.smsdemo;

import com.example.smsdemo.entity.Order;
import com.example.smsdemo.entity.User;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


@SpringBootApplication
public class Application {
    private Object User;
    //private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
        testSave();


    }


    public static void testSave() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sms");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        Order order = new Order();
        order.setMessage("Hibernate Test");
        order.setPhoneNumber("Hibernate Pass");
        order.setUser_id_user(1);
        order.setOrder_status_id_order_status(1);
        em.persist(order);
 /*       User user = new User();
        user.setName("Test Hibernate");
        user.setPassword("password Hibernate");
        em.persist(user);*/
        et.commit();
        System.out.println("User record saved successfully");
        em.close();
        emf.close();
    }
/*        try {
        emf = Persistence.createEntityManagerFactory("sms");
        entityManager = emf.createEntityManager();
        transaction = entityManager.getTransaction();
        transaction.begin();
        Order newOrder = new Order();
        newOrder.setUser_id_user(1);
        newOrder.setPhone("TelefonNR!");
        newOrder.setText("Hej här är mitt SMS!");
        newOrder.setOrder_status_id_order_status(1);

        entityManager.persist(newOrder);

        transaction.commit();
    } catch (Exception e) {
        transaction.rollback();
    } finally {
        entityManager.close();
    }*/




}
