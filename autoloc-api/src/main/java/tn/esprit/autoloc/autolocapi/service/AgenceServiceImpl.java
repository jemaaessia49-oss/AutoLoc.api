package tn.esprit.autoloc.autolocapi.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.autolocapi.domain.Agence;
import tn.esprit.autoloc.autolocapi.exception.ResourceNotFoundException;
import tn.esprit.autoloc.autolocapi.repository.AgenceRepository;

@Service
@RequiredArgsConstructor
public class AgenceServiceImpl implements IAgenceService {

  private final AgenceRepository agenceRepository;

  @Override
  public Agence addAgence(Agence agence) {
    return agenceRepository.save(agence);
  }

  @Override
  public List<Agence> getAllAgences() {
    return agenceRepository.findAll();
  }

  @Override
  public Agence getAgenceById(Long id) {
    return agenceRepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Agence introuvable avec id: " + id));
  }

  @Override
  public Agence updateAgence(Long id, Agence agence) {
    Agence existing = getAgenceById(id);
    existing.setNom(agence.getNom());
    existing.setVille(agence.getVille());
    existing.setAdresse(agence.getAdresse());
    existing.setTelephone(agence.getTelephone());
    return agenceRepository.save(existing);
  }

  @Override
  public void deleteAgence(Long id) {
    if (!agenceRepository.existsById(id)) {
      throw new ResourceNotFoundException("Agence introuvable avec id: " + id);
    }
    agenceRepository.deleteById(id);
  }
}
