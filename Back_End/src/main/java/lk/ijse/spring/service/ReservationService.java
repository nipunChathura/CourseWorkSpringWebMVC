package lk.ijse.spring.service;

import lk.ijse.spring.dto.ReservationDTO;

import java.util.List;

public interface ReservationService {
    void saveReservation(ReservationDTO dto);

    void updateReservation(ReservationDTO dto);

    ReservationDTO searchReservation(String id);

    void deleteReservation(String id);

    List<ReservationDTO> getAllReservations();
}
