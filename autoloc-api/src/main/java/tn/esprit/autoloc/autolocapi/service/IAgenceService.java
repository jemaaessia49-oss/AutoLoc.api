package tn.esprit.autoloc.autolocapi.service;

import java.util.List;
import tn.esprit.autoloc.autolocapi.domain.Agence;

public interface IAgenceService {

  Agence addAgence(Agence agence);

  List<Agence> getAllAgences();

  Agence getAgenceById(Long id);

  Agence updateAgence(Long id, Agence agence);

  void deleteAgence(Long id);
}
