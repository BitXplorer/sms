package com.example.smsdemo.entity;

import javax.persistence.*;

@Entity
@Table(name= "order_details", schema = "sms")
public class OrderDetails {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idorder_details")
    private Integer idorder_details;

    @Column(name = "order_id_order")
    private Integer order_id_order;

    @Column(name = "added")
    private String added;

    @Column(name = "estimated_delivery")
    private String estimated_delivery;

    @Column(name = "sent")
    private String sent;

    @Column(name = "delivered")
    private String delivered;

    protected OrderDetails(Integer order_id_order, String added, String estimated_delivery, String sent, String delivered) {
        this.order_id_order = order_id_order;
        this.added = added;
        this.estimated_delivery = estimated_delivery;
        this.sent = sent;
        this.delivered =delivered;
    }

    protected OrderDetails() {

    }


    public Integer getIdorder_details() {
        return idorder_details;
    }

    public Integer getOrder_id_order() {
        return order_id_order;
    }

    public void setOrder_id_order(Integer order_id_order) {
        this.order_id_order = order_id_order;
    }

    public String getAdded() {
        return added;
    }


    public String getEstimated_delivery() {
        return estimated_delivery;
    }

    public void setEstimated_delivery(String estimated_delivery) {
        this.estimated_delivery = estimated_delivery;
    }

    public String getSent() {
        return sent;
    }

    public void setSent(String sent) {
        this.sent = sent;
    }

    public String getDelivered() {
        return delivered;
    }

    public void setDelivered(String delivered) {
        this.delivered = delivered;
    }

    @Override
    public String toString() {
        return String.format(
                "OrderDetails[order_id_order=%d, added='%s', estimated_delivery='%s', sent='%s', delivered='%s']",
                order_id_order, added, estimated_delivery, sent, delivered);
    }
}
