package lk.ijse.spring.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class CarType {
    @Id
    private String carTypeID;
    private String carTypeName;
    private double loss_damage_payment_price;
    @OneToMany(mappedBy = "carType",cascade = CascadeType.ALL)
    private List<Car> cars = new ArrayList<>();

    public CarType() {
    }

    public CarType(String carTypeID, String carTypeName, double loss_damage_payment_price) {
        this.carTypeID = carTypeID;
        this.carTypeName = carTypeName;
        this.loss_damage_payment_price = loss_damage_payment_price;
    }

    public String getCarTypeID() {
        return carTypeID;
    }

    public void setCarTypeID(String carTypeID) {
        this.carTypeID = carTypeID;
    }

    public String getCarTypeName() {
        return carTypeName;
    }

    public void setCarTypeName(String carTypeName) {
        this.carTypeName = carTypeName;
    }

    public double getLoss_damage_payment_price() {
        return loss_damage_payment_price;
    }

    public void setLoss_damage_payment_price(double loss_damage_payment_price) {
        this.loss_damage_payment_price = loss_damage_payment_price;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
