package com.example.smsdemo.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity (name = "Order")
@Table(name= "order", schema = "sms")
public class Order implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_order")
    private Integer id_order;
    @Column(name = "phoneNumber")
    private String phoneNumber;
    @Column(name = "message")
    private String message;
    @Column(name = "user_id_user")
    private Integer user_id_user;
    @Column(name = "order_status_id_order_status")
    private Integer order_status_id_order_status;




    public Order(String phoneNumber, String message, Integer user_id_user, Integer order_status_id_order_status) {
        this.phoneNumber = phoneNumber;
        this.message = message;
        this.user_id_user = user_id_user;
        this.order_status_id_order_status = order_status_id_order_status;

    }

    public Order() {

    }


    public Integer getId() {
        return id_order;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phone) {
        this.phoneNumber = phone;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String text) {
        this.message = text;
    }

    public Integer getUser_id_user() {
        return user_id_user;
    }

    public void setUser_id_user(Integer user_id_user) {
        this.user_id_user = user_id_user;
    }

    public Integer getOrder_status_id_order_status() {
        return order_status_id_order_status;
    }

    public void setOrder_status_id_order_status(Integer order_status_id_order_status) {
        this.order_status_id_order_status = order_status_id_order_status;
    }

    @Override
    public String toString() {
        return String.format(
                "Order[id_order=%d, phoneNumber='%s', message='%s', user_id_user=%d, order_status_id_order_status=%d]",
                id_order, phoneNumber, message, user_id_user,order_status_id_order_status);
    }
}


