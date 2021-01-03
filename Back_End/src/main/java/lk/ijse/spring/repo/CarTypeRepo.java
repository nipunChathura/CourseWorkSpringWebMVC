package lk.ijse.spring.repo;

import lk.ijse.spring.entity.CarType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarTypeRepo extends JpaRepository<CarType,String> {
}
