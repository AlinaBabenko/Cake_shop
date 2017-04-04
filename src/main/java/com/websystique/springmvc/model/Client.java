package com.websystique.springmvc.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Alina on 03.04.2017.
 */
@Entity
@Table(name="Client_info")
public class Client {

    @Id
    @Column(name="client_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int clientId;


    @NotNull
    @Size(min=2, max=30)
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @NotNull
    @Size(min=2, max=30)
    @Column(name = "last_name", nullable = false)
    private String lastName;

    @NotNull
    @Column(name="email", nullable = false)
    private String email;

    @NotNull
    @Column(name="tel_number", nullable = false)
    private String telephone;

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
