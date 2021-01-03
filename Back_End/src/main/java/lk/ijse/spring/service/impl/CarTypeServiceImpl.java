package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CarTypeDTO;
import lk.ijse.spring.entity.CarType;
import lk.ijse.spring.repo.CarTypeRepo;
import lk.ijse.spring.service.CarTypeService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
@Service
@Transactional
public class CarTypeServiceImpl implements CarTypeService {

    @Autowired
    CarTypeRepo repo;

    @Autowired
    ModelMapper mapper;
    @Override
    public void saveCarType(CarTypeDTO dto) {
        if (!repo.existsById(dto.getCarTypeID())) {
            CarType c = mapper.map(dto, CarType.class);
            repo.save(c);
        } else {
            throw new RuntimeException("Car Type already exist..!");
        }
    }

    @Override
    public void updateCarType(CarTypeDTO dto) {
        if (repo.existsById(dto.getCarTypeID())) {
            CarType c = mapper.map(dto, CarType.class);
            repo.save(c);
        } else {
            throw new RuntimeException("No such car type for update..!");
        }
    }

    @Override
    public CarTypeDTO searchCarType(String id) {
        Optional<CarType> carType = repo.findById(id);
        if (carType.isPresent()) {

            return mapper.map(carType.get(), CarTypeDTO.class);
        } else {
            throw new RuntimeException("No car type for id: " + id);
        }
    }

    @Override
    public void deleteCarType(String id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("No car type for delete ID: " + id);
        }
    }

    @Override
    public List<CarTypeDTO> getAllCarTypes() {
        List<CarType> all = repo.findAll();
        return mapper.map(all, new TypeToken<List<CarTypeDTO>>() {
        }.getType());
    }
}
