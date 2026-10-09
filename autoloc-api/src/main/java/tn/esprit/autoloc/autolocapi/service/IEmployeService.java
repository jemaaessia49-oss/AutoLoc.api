package tn.esprit.autoloc.autolocapi.service;

import java.util.List;
import tn.esprit.autoloc.autolocapi.domain.Employe;

public interface IEmployeService {

  Employe addEmploye(Employe employe);

  List<Employe> getAllEmployes();

  Employe getEmployeById(Long id);

  Employe updateEmploye(Long id, Employe employe);

  void deleteEmploye(Long id);
}
