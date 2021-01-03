package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.ReservationDetailDTO;

import java.util.List;

public interface ReservationDetailService {
    void saveReservationDetail(ReservationDetailDTO dto);

    void updateReservationDetail(ReservationDetailDTO dto);

    ReservationDetailDTO searchReservationDetail(String id);

    void deleteReservationDetail(String id);

    List<ReservationDetailDTO> getAllReservationDetails();
}
