package tn.esprit.autoloc.autolocapi.service;

import java.util.List;
import tn.esprit.autoloc.autolocapi.domain.Client;

public interface IClientService {

  Client addClient(Client client);

  List<Client> getAllClients();

  Client getClientById(Long id);

  Client updateClient(Long id, Client client);

  void deleteClient(Long id);
}
