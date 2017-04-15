package com.websystique.springmvc.model;

import javax.persistence.*;

/**
 * Created by Alina on 04.04.2017.
 */

@Entity
@Table(name = "Cakes")
public class Cake {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(name = "weight")
    private double weight;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "priceForOneKilo")
    private double priceForOneKilo;
    @Column(name = "price_for_cake")
    private double priceCake;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private OrderCakes orderCakes;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cakeInfo_id")
    private CakeInfo cakeInfo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPriceForOneKilo() {
        return priceForOneKilo;
    }

    public void setPriceForOneKilo(double priceForOneKilo) {
        this.priceForOneKilo = priceForOneKilo;
    }

    public double getPriceCake() {
        return priceCake;
    }

    public void setPriceCake(double priceCake) {
        this.priceCake = priceCake;
    }

    public OrderCakes getOrderCakes() {
        return orderCakes;
    }

    public void setOrderCakes(OrderCakes orderCakes) {
        this.orderCakes = orderCakes;
    }

    public CakeInfo getCakeInfo() {
        return cakeInfo;
    }

    public void setCakeInfo(CakeInfo cakeInfo) {
        this.cakeInfo = cakeInfo;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "id=" + id +
                ", weight=" + weight +
                ", quantity=" + quantity +
                ", priceForOneKilo=" + priceForOneKilo +
                ", priceCake=" + priceCake +
                ", orderCakes=" + orderCakes +
                ", cakeInfo=" + cakeInfo +
                '}';
    }
}
