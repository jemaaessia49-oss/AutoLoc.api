package tn.esprit.autoloc.autolocapi.service;

import java.util.List;
import tn.esprit.autoloc.autolocapi.domain.Paiement;

public interface IPaiementService {

  Paiement addPaiement(Paiement paiement);

  List<Paiement> getAllPaiements();

  Paiement getPaiementById(Long id);

  Paiement updatePaiement(Long id, Paiement paiement);

  void deletePaiement(Long id);
}
