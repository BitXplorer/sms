package com.example.smsdemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "OrderStatus")
@Table(name= "order_status", schema = "sms")
public class OrderStatus {


    @Id
    private Integer id_order_status;
    private String status;

    public OrderStatus(Integer id_order_status, String status) {
        this.id_order_status = id_order_status;
        this.status = status;
    }


    public OrderStatus() {

    }

    public Integer getId_order_status() {
        return id_order_status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
