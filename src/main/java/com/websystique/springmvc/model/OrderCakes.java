package com.websystique.springmvc.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * Created by Alina on 04.04.2017.
 */

@Entity
@Table(name="OrderCakes")
public class OrderCakes {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(name="amount")
    private double amount;
    @Column(name="date_order")
    private Date dateOrder;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orderCakes")
    private Set<Cake> cakes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(Date dateOrder) {
        this.dateOrder = dateOrder;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Set<Cake> getCakes() {
        return cakes;
    }

    public void setCakes(Set<Cake> cakes) {
        this.cakes = cakes;
    }

    @Override
    public String toString() {
        return "OrderCakes{" +
                "id=" + id +
                ", amount=" + amount +
                ", dateOrder=" + dateOrder +
                ", client=" + client +
                ", cakes=" + cakes +
                '}';
    }
}
