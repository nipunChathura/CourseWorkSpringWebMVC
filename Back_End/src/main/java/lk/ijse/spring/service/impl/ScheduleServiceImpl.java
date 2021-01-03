package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.DriverDTO;
import lk.ijse.spring.dto.ScheduleDTO;
import lk.ijse.spring.entity.Driver;
import lk.ijse.spring.entity.Schedule;
import lk.ijse.spring.repo.ScheduleRepo;
import lk.ijse.spring.service.ScheduleService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
@Service
@Transactional
public class ScheduleServiceImpl implements ScheduleService {
    @Autowired
    ScheduleRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void saveSchedule(ScheduleDTO dto) {
        if (!repo.existsById(dto.getScheduleID())) {
            Schedule s = mapper.map(dto, Schedule.class);
            repo.save(s);
        } else {
            throw new RuntimeException("Schedule already exist..!");
        }
    }

    @Override
    public void updateSchedule(ScheduleDTO dto) {
        if (repo.existsById(dto.getScheduleID())) {
            Schedule s = mapper.map(dto, Schedule.class);
            repo.save(s);
        } else {
            throw new RuntimeException("No such schedule for update..!");
        }
    }

    @Override
    public ScheduleDTO searchSchedule(String id) {
        Optional<Schedule> schedule = repo.findById(id);
        if (schedule.isPresent()) {

            return mapper.map( schedule.get(), ScheduleDTO.class);
        } else {
            throw new RuntimeException("No schedule for id: " + id);
        }
    }

    @Override
    public void deleteSchedule(String id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("No schedule for delete ID: " + id);
        }
    }

    @Override
    public List<ScheduleDTO> getAllSchedules() {
        List<Schedule> all = repo.findAll();
        return mapper.map(all, new TypeToken<List<ScheduleDTO>>() {
        }.getType());
    }
}
