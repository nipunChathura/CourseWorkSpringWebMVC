package lk.ijse.spring.dto;

import lk.ijse.spring.entity.Car;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.entity.Driver;

import java.util.Arrays;
import java.util.Date;

public class ReservationDTO {
    private String reservationID;
    private Date pick_up_date;
    private Date returnDate;
    private byte[] waiver_payment_img;
    private String admin_apr;
    private Car car;
    private Customer customer;
    private Driver driver;

    public ReservationDTO() {
    }

    public ReservationDTO(String reservationID, Date pick_up_date, Date returnDate, byte[] waiver_payment_img,
                          String admin_apr, Car car, Customer customer, Driver driver) {
        this.reservationID = reservationID;
        this.pick_up_date = pick_up_date;
        this.returnDate = returnDate;
        this.waiver_payment_img = waiver_payment_img;
        this.admin_apr = admin_apr;
        this.car = car;
        this.customer = customer;
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "ReservationDTO{" +
                "reservationID='" + reservationID + '\'' +
                ", pick_up_date=" + pick_up_date +
                ", returnDate=" + returnDate +
                ", waiver_payment_img=" + Arrays.toString(waiver_payment_img) +
                ", admin_apr='" + admin_apr + '\'' +
                ", car=" + car +
                ", customer=" + customer +
                ", driver=" + driver +
                '}';
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
