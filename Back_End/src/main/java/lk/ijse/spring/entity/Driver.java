package lk.ijse.spring.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Driver {
    @Id
    private String nic;
    private String name;
    private byte dl_photo1;
    private byte dl_photo2;
    private String dl_no;
    private int Contact_no;

    @OneToMany(mappedBy = "driver",cascade = CascadeType.ALL)
    private List<Schedule> schedules = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "driver_user_name" , referencedColumnName = "user_name")
    private User user;

    public Driver() {
    }

    public Driver(String nic, String name, byte dl_photo1, byte dl_photo2,
                  String dl_no, int contact_no) {
        this.nic = nic;
        this.name = name;
        this.dl_photo1 = dl_photo1;
        this.dl_photo2 = dl_photo2;
        this.dl_no = dl_no;
        Contact_no = contact_no;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getDl_photo1() {
        return dl_photo1;
    }

    public void setDl_photo1(byte dl_photo1) {
        this.dl_photo1 = dl_photo1;
    }

    public byte getDl_photo2() {
        return dl_photo2;
    }

    public void setDl_photo2(byte dl_photo2) {
        this.dl_photo2 = dl_photo2;
    }

    public String getDl_no() {
        return dl_no;
    }

    public void setDl_no(String dl_no) {
        this.dl_no = dl_no;
    }

    public int getContact_no() {
        return Contact_no;
    }

    public void setContact_no(int contact_no) {
        Contact_no = contact_no;
    }


    public List<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }
}
