package com.websystique.springmvc.service.impl;

import com.websystique.springmvc.model.Cake;
import com.websystique.springmvc.model.Client;
import com.websystique.springmvc.repository.ClientRepository;
import com.websystique.springmvc.service.CakeService;
import com.websystique.springmvc.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Alina on 15.04.2017.
 */
@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientRepository clientRepository;


    @Override
    public Client findById(int id) {
        return null;
    }

    @Override
    public List<Client> findAllClients() {
        return null;
    }

    @Override
    public void saveClient(Client client) {
        clientRepository.saveAndFlush(client);
    }

    @Override
    public void updateClient(Client client) {

    }

    @Override
    public void deleteClient(int id) {
       
    }
}
