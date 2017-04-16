package com.websystique.springmvc.service.impl;


import com.websystique.springmvc.model.Client;
import com.websystique.springmvc.repository.ClientRepository;
import com.websystique.springmvc.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


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
        return clientRepository.findById(id);
    }

    @Override
    public List<Client> findAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public void saveClient(Client client) {
        clientRepository.saveAndFlush(client);
    }

    @Override
    public void updateClient(Client client) {
        Client savedClient = clientRepository.findById(client.getId());

        if(savedClient!=null){
            savedClient.setFirstName(client.getFirstName());
            savedClient.setLastName(client.getLastName());
            savedClient.setEmail(client.getEmail());
            savedClient.setPhone(client.getPhone());
            savedClient.setOrderCakes(client.getOrderCakes());
        }

    }

    @Override
    public void deleteClient(int id) {
        clientRepository.delete(id);
    }
}
