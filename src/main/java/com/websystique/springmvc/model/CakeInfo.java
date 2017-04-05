package com.websystique.springmvc.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

/**
 * Created by Alina on 03.04.2017.
 */
@Entity
@Table(name = "cake_info")
public class CakeInfo {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Column(name = "cake_name", nullable = false)
    private String nameCake;
    @NotNull
    @Column(name = "description", nullable = false)
    private String description;
    @NotNull
    @Column(name = "min_weight", nullable = false)
    private double minWeight;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cakeInfo")
    private Set<Image> images;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameCake() {
        return nameCake;
    }

    public void setNameCake(String nameCake) {
        this.nameCake = nameCake;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getMinWeight() {
        return minWeight;
    }

    public void setMinWeight(double minWeight) {
        this.minWeight = minWeight;
    }

    public Set<Image> getImages() {
        return images;
    }

    public void setImages(Set<Image> images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "CakeInfo{" +
                "id=" + id +
                ", nameCake='" + nameCake + '\'' +
                ", description='" + description + '\'' +
                ", minWeight=" + minWeight +
                ", images=" + images +
                '}';
    }
}
