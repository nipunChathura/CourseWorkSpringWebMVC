package lk.ijse.spring.entity;

import javax.persistence.*;
import java.util.Date;
@Entity
public class Reservation {
    @Id
    private String reservationID;
    private Date pick_up_date;
    private Date returnDate;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "payment_photo",length=1000000)
    private byte[] waiver_payment_img;
    private String admin_apr;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "car_no",referencedColumnName = "car_no")
    private Car car;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_nic",referencedColumnName = "nic")
    private Customer customer;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "driver_nic",referencedColumnName = "nic")
    private Driver driver;

    public Reservation() {
    }

    public Reservation(String reservationID, Date pick_up_date, Date returnDate,
                       byte[] waiver_payment_img, String admin_apr, Car car,
                       Customer customer, Driver driver) {
        this.reservationID = reservationID;
        this.pick_up_date = pick_up_date;
        this.returnDate = returnDate;
        this.waiver_payment_img = waiver_payment_img;
        this.admin_apr = admin_apr;
        this.car = car;
        this.customer = customer;
        this.driver = driver;
    }

    public String getReservationID() {
        return reservationID;
    }

    public void setReservationID(String reservationID) {
        this.reservationID = reservationID;
    }

    public Date getPick_up_date() {
        return pick_up_date;
    }

    public void setPick_up_date(Date pick_up_date) {
        this.pick_up_date = pick_up_date;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public byte[] getWaiver_payment_img() {
        return waiver_payment_img;
    }

    public void setWaiver_payment_img(byte[] waiver_payment_img) {
        this.waiver_payment_img = waiver_payment_img;
    }

    public String getAdmin_apr() {
        return admin_apr;
    }

    public void setAdmin_apr(String admin_apr) {
        this.admin_apr = admin_apr;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
