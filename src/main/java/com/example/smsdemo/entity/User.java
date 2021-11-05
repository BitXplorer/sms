package com.example.smsdemo.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity (name = "User")
@Table(name= "user", schema = "sms")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Integer id_user;
    @Column(name = "name")
    private String name;
    @Column(name = "password")
    private String password;


    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public User() {

    }

    public Integer getId() {
        return id_user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return String.format(
                "User[id_user=%d, name='%s', password='%s']",
                id_user, name, password);
    }




}
