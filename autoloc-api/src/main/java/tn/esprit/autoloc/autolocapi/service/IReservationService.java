package tn.esprit.autoloc.autolocapi.service;

import java.util.List;
import tn.esprit.autoloc.autolocapi.domain.Reservation;

public interface IReservationService {

  Reservation addReservation(Reservation reservation);

  List<Reservation> getAllReservations();

  Reservation getReservationById(Long id);

  Reservation updateReservation(Long id, Reservation reservation);

  void deleteReservation(Long id);
}
