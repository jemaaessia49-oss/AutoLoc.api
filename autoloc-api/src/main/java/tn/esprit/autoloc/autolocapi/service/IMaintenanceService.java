package tn.esprit.autoloc.autolocapi.service;

import java.util.List;
import tn.esprit.autoloc.autolocapi.domain.Maintenance;

public interface IMaintenanceService {

  Maintenance addMaintenance(Maintenance maintenance);

  List<Maintenance> getAllMaintenances();

  Maintenance getMaintenanceById(Long id);

  Maintenance updateMaintenance(Long id, Maintenance maintenance);

  void deleteMaintenance(Long id);
}
