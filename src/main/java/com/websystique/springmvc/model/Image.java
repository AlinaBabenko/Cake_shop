package com.websystique.springmvc.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Alina on 04.04.2017.
 */
@Entity
@Table(name = "Image")
public class Image {
    @Id
    @Column(name = "content")
    private String content;
    @ManyToOne
    @JoinColumn(name = "cake_id_FK")
    private CakeInfo cake;
}
