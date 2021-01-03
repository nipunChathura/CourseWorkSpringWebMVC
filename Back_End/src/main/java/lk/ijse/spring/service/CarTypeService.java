package lk.ijse.spring.service;

import lk.ijse.spring.dto.CarTypeDTO;

import java.util.List;

public interface CarTypeService {
    void saveCarType(CarTypeDTO dto);

    void updateCarType(CarTypeDTO dto);

    CarTypeDTO searchCarType(String id);

    void deleteCarType(String id);

    List<CarTypeDTO> getAllCarTypes();
}
