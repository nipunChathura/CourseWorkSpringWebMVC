package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.DriverDTO;
import lk.ijse.spring.dto.ReservationDetailDTO;
import lk.ijse.spring.entity.Driver;
import lk.ijse.spring.entity.ReservationDetail;
import lk.ijse.spring.repo.ReservationDetailRepo;
import lk.ijse.spring.service.ReservationDetailService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
@Service
@Transactional
public class ReservationDetailServiceImpl implements ReservationDetailService {

    @Autowired
    ReservationDetailRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void saveReservationDetail(ReservationDetailDTO dto) {
        if (!repo.existsById(dto.getRd_id())) {
            ReservationDetail r = mapper.map(dto, ReservationDetail.class);
            repo.save(r);
        } else {
            throw new RuntimeException("Reservation already exist..!");
        }
    }

    @Override
    public void updateReservationDetail(ReservationDetailDTO dto) {
        if (repo.existsById(dto.getRd_id())) {
            ReservationDetail r = mapper.map(dto, ReservationDetail.class);
            repo.save(r);
        } else {
            throw new RuntimeException("No such reservation for update..!");
        }
    }

    @Override
    public ReservationDetailDTO searchReservationDetail(String id) {
        Optional<ReservationDetail> reservationDetail = repo.findById(id);
        if ( reservationDetail.isPresent()) {

            return mapper.map(reservationDetail.get(), ReservationDetailDTO.class);
        } else {
            throw new RuntimeException("No reservation for id: " + id);
        }
    }

    @Override
    public void deleteReservationDetail(String id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("No reservation for delete ID: " + id);
        }
    }

    @Override
    public List<ReservationDetailDTO> getAllReservationDetails() {
        List<ReservationDetail> all = repo.findAll();
        return mapper.map(all, new TypeToken<List<ReservationDetailDTO>>() {
        }.getType());
    }
}
