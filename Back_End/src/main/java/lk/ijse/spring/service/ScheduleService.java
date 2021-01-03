package lk.ijse.spring.service;

import lk.ijse.spring.dto.CarTypeDTO;
import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.ScheduleDTO;

import java.util.List;

public interface ScheduleService {
    void saveSchedule(ScheduleDTO dto);

    void updateSchedule(ScheduleDTO dto);

    ScheduleDTO searchSchedule(String id);

    void deleteSchedule(String id);

    List<ScheduleDTO> getAllSchedules();
}
