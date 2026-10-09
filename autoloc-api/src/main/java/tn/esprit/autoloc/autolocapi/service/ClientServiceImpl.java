package tn.esprit.autoloc.autolocapi.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.autolocapi.domain.Client;
import tn.esprit.autoloc.autolocapi.exception.ResourceNotFoundException;
import tn.esprit.autoloc.autolocapi.repository.ClientRepository;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements IClientService {

  private final ClientRepository clientRepository;

  @Override
  public Client addClient(Client client) {
    return clientRepository.save(client);
  }

  @Override
  public List<Client> getAllClients() {
    return clientRepository.findAll();
  }

  @Override
  public Client getClientById(Long id) {
    return clientRepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Client introuvable avec id: " + id));
  }

  @Override
  public Client updateClient(Long id, Client client) {
    Client existing = getClientById(id);
    existing.setNom(client.getNom());
    existing.setPrenom(client.getPrenom());
    existing.setEmail(client.getEmail());
    existing.setTelephone(client.getTelephone());
    existing.setNumPermis(client.getNumPermis());
    existing.setDateInscription(client.getDateInscription());
    return clientRepository.save(existing);
  }

  @Override
  public void deleteClient(Long id) {
    if (!clientRepository.existsById(id)) {
      throw new ResourceNotFoundException("Client introuvable avec id: " + id);
    }
    clientRepository.deleteById(id);
  }
}
