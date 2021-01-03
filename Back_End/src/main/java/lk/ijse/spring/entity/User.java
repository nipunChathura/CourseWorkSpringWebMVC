package lk.ijse.spring.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {
    @Id
    private String user_name;
    private String password;
    private String states;

    public User() {
    }

    public User(String user_name, String password, String states) {
        this.user_name = user_name;
        this.password = password;
        this.states = states;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }


}
