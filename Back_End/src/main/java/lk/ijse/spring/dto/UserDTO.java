package lk.ijse.spring.dto;

public class UserDTO {
    private String user_name;
    private String password;
    private String states;

    public UserDTO() {
    }

    public UserDTO(String user_name, String password, String states) {
        this.user_name = user_name;
        this.password = password;
        this.states = states;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "user_name='" + user_name + '\'' +
                ", password='" + password + '\'' +
                ", states='" + states + '\'' +
                '}';
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
