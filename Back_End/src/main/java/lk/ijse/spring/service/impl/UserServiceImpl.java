package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.DriverDTO;
import lk.ijse.spring.dto.UserDTO;
import lk.ijse.spring.entity.Driver;
import lk.ijse.spring.entity.User;
import lk.ijse.spring.repo.UserRepo;
import lk.ijse.spring.service.UserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void saveUser(UserDTO dto) {
        if (!repo.existsById(dto.getUser_name())) {
            User u = mapper.map(dto, User.class);
            repo.save(u);
        } else {
            throw new RuntimeException("User already exist..!");
        }
    }

    @Override
    public void updateUser(UserDTO dto) {
        if (repo.existsById(dto.getUser_name())) {
            User u = mapper.map(dto, User.class);
            repo.save(u);
        } else {
            throw new RuntimeException("No such user for update..!");
        }
    }

    @Override
    public UserDTO searchUser(String id) {
        Optional<User> user = repo.findById(id);
        if ( user.isPresent()) {

            return mapper.map(user.get(), UserDTO.class);
        } else {
            throw new RuntimeException("No user for id: " + id);
        }
    }

    @Override
    public void deleteUser(String id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("No driver for user ID: " + id);
        }
    }

    @Override
    public List<UserDTO> getAllUsers() {
        List<User> all = repo.findAll();
        return mapper.map(all, new TypeToken<List<UserDTO>>() {
        }.getType());
    }
}
