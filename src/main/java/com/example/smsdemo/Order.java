package com.example.smsdemo;

import javax.persistence.*;

@Entity (name = "Order")
@Table(name= "order", schema = "sms")
public class Order {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_order")
    private Integer id_order;
    @Column(name = "phone")
    private String phone;
    @Column(name = "text")
    private String text;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id_user", referencedColumnName = "id_user")
    private User user;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_status_id_order_status", referencedColumnName = "id_order_status")
    private OrderDetails orderDetails;



    protected Order(String phone, String text) {
        this.phone = phone;
        this.text = text;
    }

    protected Order() {

    }


    public Integer getId() {
        return id_order;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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
                "Order[id_order=%d, phone='%s', text='%s', user_id_user=%d, order_status_id_order_status=%d]",
                id_order, phone, text, user_id_user,order_status_id_order_status);
    }
}


