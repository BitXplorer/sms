package com.example.smsdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class Application {
    //private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner addOrders(OrderRepository orderRepository){
        return (args ->{
            insertOrder(orderRepository);
            System.out.println(orderRepository.findAll());
        });

    }

    private void insertOrder(OrderRepository orderRepository){
        orderRepository.save(new Order("Test3", "Test3", 2, 2));

    }


/*
    @Bean
    public CommandLineRunner addUser(UserRepository userRepository){
        return (args ->{
            insertUser(userRepository);
            System.out.println(userRepository.findAll());
        });

    }
    private void insertUser(UserRepository userRepository){
        userRepository.save(new User("JavaInsert3", "password1"));

    }
*/








    /*
        public CommandLineRunner demo(UserRepository userRepository) {
            return (args) -> {
                // save a few customers


                repository.save(new Customer("Jack", "Bauer"));
                repository.save(new Customer("Chloe", "O'Brian"));
                repository.save(new Customer("Kim", "Bauer"));
                repository.save(new Customer("David", "Palmer"));
                repository.save(new Customer("Michelle", "Dessler"));



                // fetch all customers
                log.info("Customers found with findAll():");
                log.info("-------------------------------");
                for (User user : userRepository.findAll()) {
                    log.info(user.toString());
                }
                log.info("");

                // fetch an individual customer by ID
                User user = userRepository.findById(1);
                log.info("Customer found with findById(1):");
                log.info("--------------------------------");
                log.info(user.toString());
                log.info("");

                // fetch customers by last name
                log.info("Customer found with findByName('Dan'):");
                log.info("--------------------------------------------");
                userRepository.findAllByName("Dan").forEach(dan -> {
                    log.info(dan.toString());
                });
                // for (Customer bauer : repository.findByLastName("Bauer")) {
                //  log.info(bauer.toString());
                // }
                log.info("");
            };



        }
*/





}
