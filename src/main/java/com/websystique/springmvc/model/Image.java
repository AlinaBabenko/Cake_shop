package com.websystique.springmvc.model;

import javax.persistence.*;


/**
 * Created by Alina on 04.04.2017.
 */
@Entity
@Table(name = "Image")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "content")
    private String content;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cake_info_id")
    private CakeInfo cakeInfo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public CakeInfo getCakeInfo() {
        return cakeInfo;
    }

    public void setCakeInfo(CakeInfo cakeInfo) {
        this.cakeInfo = cakeInfo;
    }

    @Override
    public String toString() {
        return "Image{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", cakeInfo=" + cakeInfo +
                '}';
    }
}
