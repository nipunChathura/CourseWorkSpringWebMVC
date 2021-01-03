package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.DriverDTO;
import lk.ijse.spring.dto.ReservationDTO;
import lk.ijse.spring.dto.ReservationDetailDTO;
import lk.ijse.spring.entity.Driver;
import lk.ijse.spring.entity.Reservation;
import lk.ijse.spring.repo.ReservationRepo;
import lk.ijse.spring.service.ReservationDetailService;
import lk.ijse.spring.service.ReservationService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
@Service
@Transactional
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    ReservationRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void saveReservation(ReservationDTO dto) {
        if (!repo.existsById(dto.getReservationID())) {
            Reservation r = mapper.map(dto, Reservation.class);
            repo.save(r);
        } else {
            throw new RuntimeException("Reservation already exist..!");
        }
    }

    @Override
    public void updateReservation(ReservationDTO dto) {
        if (repo.existsById(dto.getReservationID())) {
            Reservation r = mapper.map(dto, Reservation.class);
            repo.save(r);
        } else {
            throw new RuntimeException("No such reservation for update..!");
        }
    }

    @Override
    public ReservationDTO searchReservation(String id) {
        Optional<Reservation> reservation = repo.findById(id);
        if (reservation.isPresent()) {

            return mapper.map( reservation.get(), ReservationDTO.class);
        } else {
            throw new RuntimeException("No reservation for id: " + id);
        }
    }

    @Override
    public void deleteReservation(String id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("No reservation for delete ID: " + id);
        }
    }

    @Override
    public List<ReservationDTO> getAllReservations() {
        List<Reservation> all = repo.findAll();
        return mapper.map(all, new TypeToken<List<ReservationDTO>>() {
        }.getType());
    }
}
