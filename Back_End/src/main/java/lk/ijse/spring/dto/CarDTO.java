package lk.ijse.spring.dto;

import lk.ijse.spring.entity.CarType;

import java.util.Arrays;

public class CarDTO {
    private String car_no;
    private byte[] photo1;
    private byte[] photo2;
    private byte[] photo3;
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
    private CarType carType;

    public CarDTO() {
    }

    public CarDTO(String car_no, byte[] photo1, byte[] photo2, byte[] photo3, byte[] photo4, int no_of_Sheet,
                  String fuel_type, String brand, String color, double rent_dur_price, String transmission_type,
                  double daily_Rate, double monthly_Rate, double free_km_of_day, double free_km_of_monthly,
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

    @Override
    public String toString() {
        return "CarDTO{" +
                "car_no='" + car_no + '\'' +
                ", photo1=" + Arrays.toString(photo1) +
                ", photo2=" + Arrays.toString(photo2) +
                ", photo3=" + Arrays.toString(photo3) +
                ", photo4=" + Arrays.toString(photo4) +
                ", no_of_Sheet=" + no_of_Sheet +
                ", fuel_type='" + fuel_type + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", rent_dur_price=" + rent_dur_price +
                ", transmission_type='" + transmission_type + '\'' +
                ", daily_Rate=" + daily_Rate +
                ", monthly_Rate=" + monthly_Rate +
                ", free_km_of_day=" + free_km_of_day +
                ", free_km_of_monthly=" + free_km_of_monthly +
                ", price_extra_km=" + price_extra_km +
                ", carType=" + carType +
                '}';
    }

    public String getCar_no() {
        return car_no;
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

    public int getNo_of_Sheet() {
        return no_of_Sheet;
    }

    public void setNo_of_Sheet(int no_of_Sheet) {
        this.no_of_Sheet = no_of_Sheet;
    }

    public String getFuel_type() {
        return fuel_type;
    }

    public void setFuel_type(String fuel_type) {
        this.fuel_type = fuel_type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRent_dur_price() {
        return rent_dur_price;
    }

    public void setRent_dur_price(double rent_dur_price) {
        this.rent_dur_price = rent_dur_price;
    }

    public String getTransmission_type() {
        return transmission_type;
    }

    public void setTransmission_type(String transmission_type) {
        this.transmission_type = transmission_type;
    }

    public double getDaily_Rate() {
        return daily_Rate;
    }

    public void setDaily_Rate(double daily_Rate) {
        this.daily_Rate = daily_Rate;
    }

    public double getMonthly_Rate() {
        return monthly_Rate;
    }

    public void setMonthly_Rate(double monthly_Rate) {
        this.monthly_Rate = monthly_Rate;
    }

    public double getFree_km_of_day() {
        return free_km_of_day;
    }

    public void setFree_km_of_day(double free_km_of_day) {
        this.free_km_of_day = free_km_of_day;
    }

    public double getFree_km_of_monthly() {
        return free_km_of_monthly;
    }

    public void setFree_km_of_monthly(double free_km_of_monthly) {
        this.free_km_of_monthly = free_km_of_monthly;
    }

    public double getPrice_extra_km() {
        return price_extra_km;
    }

    public void setPrice_extra_km(double price_extra_km) {
        this.price_extra_km = price_extra_km;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }
}
