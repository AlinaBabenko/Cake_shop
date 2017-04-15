package com.websystique.springmvc.service;

import com.websystique.springmvc.model.Client;

import java.util.List;

/**
 * Created by Alina on 15.04.2017.
 */
public interface ClientService {
    Client findById(int id);
    List<Client> findAllClients();

    void saveClient(Client client);

    void updateClient(Client client);

    void deleteClient(int id);


}
