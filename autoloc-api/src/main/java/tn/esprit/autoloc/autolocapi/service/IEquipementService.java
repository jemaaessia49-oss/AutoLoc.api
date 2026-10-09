package tn.esprit.autoloc.autolocapi.service;

import java.util.List;
import tn.esprit.autoloc.autolocapi.domain.Equipement;

public interface IEquipementService {

  Equipement addEquipement(Equipement equipement);

  List<Equipement> getAllEquipements();

  Equipement getEquipementById(Long id);

  Equipement updateEquipement(Long id, Equipement equipement);

  void deleteEquipement(Long id);
}
