package com.example.smsdemo;

import javax.persistence.*;

@Entity (name = "User")
@Table(name= "user", schema = "sms")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @OneToOne(mappedBy = "user_id_user")
    private Integer id_user;
    @Column(name = "name", unique = true)
    private String name;
    @Column(name = "password")
    private String password;


    protected User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    protected User() {

    }

    public Integer getId() {
        return id_user;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }



    @Override
    public String toString() {
        return String.format(
                "User[id_user=%d, name='%s', password='%s']",
                id_user, name, password);
    }




}
