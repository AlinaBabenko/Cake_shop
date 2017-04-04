package com.websystique.springmvc.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by Alina on 03.04.2017.
 */
@Entity
@Table(name = "cake_info")
public class CakeInfo {
    @Id
    @Column(name="cake_id_PK")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int clientId;

    @NotNull
    @Column(name="cake_name", nullable = false)
    private String cakeName;

    @NotNull
    @Column(name="min_weight", nullable = false)
    private double weight;

    @NotNull
    @Column(name="description", nullable = false)
    private String description;

    @OneToMany(targetEntity = Image.class, mappedBy = "cake",
            cascade = CascadeType.ALL, fetch=FetchType.LAZY)
    private List<Image> images;

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getCakeName() {
        return cakeName;
    }

    public void setCakeName(String cakeName) {
        this.cakeName = cakeName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }
}
