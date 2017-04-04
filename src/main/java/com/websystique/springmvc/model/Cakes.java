package com.websystique.springmvc.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Alina on 04.04.2017.
 */

@Entity
@Table(name = "Cakes")
public class Cakes {

    @NotNull
    @Column(name = "weight", nullable = false)
    private double weight;

    @NotNull
    @Column(name = "quantity", nullable = false)
    private int quantity;

    @NotNull
    @Column(name = "price", nullable = false)
    private double price;

    @NotNull
    @Column(name = "price_for_one_kilo")
    private double priceForOneKilo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id")
    private Order order;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "cake_id_FK")
    private CakeInfo cake;

}
