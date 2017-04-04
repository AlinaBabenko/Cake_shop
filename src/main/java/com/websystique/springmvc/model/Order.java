package com.websystique.springmvc.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * Created by Alina on 04.04.2017.
 */

@Entity
@Table(name="Order")
public class Order {
    @Id
    @Column(name = "order_id_PK")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idOrder;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id_FK")
    private Client client;

    @NotNull
    @Column(name = "amount", nullable = false)
    private double amount;

    @NotNull
    @Column (name= "order_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateOrder;

    @OneToMany(targetEntity = Cakes.class, mappedBy = "order",
                    cascade = CascadeType.ALL, fetch=FetchType.LAZY)
    private List<Cakes> cakes;

    public List<Cakes> getCakes() {
        return cakes;
    }

    public void setCakes(List<Cakes> cakes) {
        this.cakes = cakes;
    }
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

    public Date getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(Date dateOrder) {
        this.dateOrder = dateOrder;
    }

}
