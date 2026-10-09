package tn.esprit.autoloc.autolocapi.service;

import java.util.List;
import tn.esprit.autoloc.autolocapi.domain.Vehicule;

public interface IVehiculeService {

  Vehicule addVehicule(Vehicule vehicule);

  List<Vehicule> getAllVehicules();

  Vehicule getVehiculeById(Long id);

  Vehicule updateVehicule(Long id, Vehicule vehicule);

  void deleteVehicule(Long id);
}
