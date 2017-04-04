package com.websystique.springmvc.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Alina on 04.04.2017.
 */
@Entity
@Table(name="order")
public class Order {
    @Id
    @Column("order_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idOrder;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id")
    private Client client;

    @NotNull
    @Column(name = "amount", nullable = false)
    private double amount;

    @NotNull
    @Column (name= "order_date", nullable = false)

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }
    
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
