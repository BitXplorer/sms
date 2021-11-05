package com.example.smsdemo.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

/*    List<User> findAllByName(String name);
    Optional<User> findById(Integer id_user);*/

}
