package lk.ijse.spring.entity;

import javax.persistence.*;
@Entity
public class Car {
    @Id
    private String car_no;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "car_photo1",length=1000000)
    private byte[] photo1;
    @Lob @Basic(fetch = FetchType.LAZY)
    @Column(name = "car_photo2",length=1000000)
    private byte[] photo2;
    @Lob @Basic(fetch = FetchType.LAZY)
    @Column(name = "car_photo3",length=1000000)
    private byte[] photo3;
    @Lob @Basic(fetch = FetchType.LAZY)
    @Column(name = "car_photo4",length=1000000)
    private byte[] photo4;
    private int no_of_Sheet;
    private String fuel_type;
    private String brand;
    private String color;
    private double rent_dur_price;
    private String transmission_type;
    private double daily_Rate;
    private double monthly_Rate;
    private double free_km_of_day;
    private double free_km_of_monthly;
    private double price_extra_km;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "car_type",referencedColumnName = "carTypeID")
    private CarType carType;


    public Car() {
    }

    public Car(String car_no, byte[] photo1, byte[] photo2, byte[] photo3, byte[] photo4,
               int no_of_Sheet, String fuel_type, String brand, String color,
               double rent_dur_price, String transmission_type, double daily_Rate,
               double monthly_Rate, double free_km_of_day, double free_km_of_monthly,
               double price_extra_km, CarType carType) {
        this.car_no = car_no;
        this.photo1 = photo1;
        this.photo2 = photo2;
        this.photo3 = photo3;
        this.photo4 = photo4;
        this.no_of_Sheet = no_of_Sheet;
        this.fuel_type = fuel_type;
        this.brand = brand;
        this.color = color;
        this.rent_dur_price = rent_dur_price;
        this.transmission_type = transmission_type;
        this.daily_Rate = daily_Rate;
        this.monthly_Rate = monthly_Rate;
        this.free_km_of_day = free_km_of_day;
        this.free_km_of_monthly = free_km_of_monthly;
        this.price_extra_km = price_extra_km;
        this.carType = carType;
    }

    public void setCar_no(String car_no) {
        this.car_no = car_no;
    }

    public byte[] getPhoto1() {
        return photo1;
    }

    public void setPhoto1(byte[] photo1) {
        this.photo1 = photo1;
    }

    public byte[] getPhoto2() {
        return photo2;
    }

    public void setPhoto2(byte[] photo2) {
        this.photo2 = photo2;
    }

    public byte[] getPhoto3() {
        return photo3;
    }

    public void setPhoto3(byte[] photo3) {
        this.photo3 = photo3;
    }

    public byte[] getPhoto4() {
        return photo4;
    }

    public void setPhoto4(byte[] photo4) {
        this.photo4 = photo4;
    }

    public void setNo_of_Sheet(int no_of_Sheet) {
        this.no_of_Sheet = no_of_Sheet;
    }

    public void setFuel_type(String fuel_type) {
        this.fuel_type = fuel_type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRent_dur_price(double rent_dur_price) {
        this.rent_dur_price = rent_dur_price;
    }

    public void setTransmission_type(String transmission_type) {
        this.transmission_type = transmission_type;
    }

    public void setDaily_Rate(double daily_Rate) {
        this.daily_Rate = daily_Rate;
    }

    public void setMonthly_Rate(double monthly_Rate) {
        this.monthly_Rate = monthly_Rate;
    }

    public void setFree_km_of_day(double free_km_of_day) {
        this.free_km_of_day = free_km_of_day;
    }

    public void setFree_km_of_monthly(double free_km_of_monthly) {
        this.free_km_of_monthly = free_km_of_monthly;
    }

    public void setPrice_extra_km(double price_extra_km) {
        this.price_extra_km = price_extra_km;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }
}
