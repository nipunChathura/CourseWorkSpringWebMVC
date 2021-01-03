package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.UserDTO;

import java.util.List;

public interface UserService {
    void saveUser(UserDTO dto);

    void updateUser(UserDTO dto);

    UserDTO searchUser(String id);

    void deleteUser(String id);

    List<UserDTO> getAllUsers();
}
