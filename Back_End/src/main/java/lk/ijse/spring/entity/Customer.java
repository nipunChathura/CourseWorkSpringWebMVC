package lk.ijse.spring.entity;

import javax.persistence.*;

@Entity
public class Customer {
    @Id
    private String nic;
    private String name;
    private String address;
    private int contact_no;
    private String email;
    @Lob @Basic(fetch = FetchType.LAZY)
    @Column(name = "dl_photo1",length=1000000)
    private byte[] dl_photo1;
    private String dl_no;

    public Customer() {
    }

    public Customer(String nic, String name, String address, int contact_no, String email, byte[] dl_photo1, String dl_no, User user) {
        this.nic = nic;
        this.name = name;
        this.address = address;
        this.contact_no = contact_no;
        this.email = email;
        this.dl_photo1 = dl_photo1;
        this.dl_no = dl_no;
        this.user = user;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_user_name" , referencedColumnName = "user_name")
    private User user;

    @Override
    public String toString() {
        return "Customer{" +
                "user=" + getUser() +
                '}';
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getContact_no() {
        return contact_no;
    }

    public void setContact_no(int contact_no) {
        this.contact_no = contact_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte[] getDl_photo1() {
        return dl_photo1;
    }

    public void setDl_photo1(byte[] dl_photo1) {
        this.dl_photo1 = dl_photo1;
    }


    public String getDl_no() {
        return dl_no;
    }

    public void setDl_no(String dl_no) {
        this.dl_no = dl_no;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
