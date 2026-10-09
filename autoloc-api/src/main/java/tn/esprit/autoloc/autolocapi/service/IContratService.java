package tn.esprit.autoloc.autolocapi.service;

import java.util.List;
import tn.esprit.autoloc.autolocapi.domain.Contrat;

public interface IContratService {

  Contrat addContrat(Contrat contrat);

  List<Contrat> getAllContrats();

  Contrat getContratById(Long id);

  Contrat updateContrat(Long id, Contrat contrat);

  void deleteContrat(Long id);
}
