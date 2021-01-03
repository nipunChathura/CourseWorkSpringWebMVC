package lk.ijse.spring.dto;

public class CarTypeDTO {
    private String carTypeID;
    private String carTypeName;
    private double loss_damage_payment_price;

    public CarTypeDTO() {
    }

    public CarTypeDTO(String carTypeID, String carTypeName, double loss_damage_payment_price) {
        this.carTypeID = carTypeID;
        this.carTypeName = carTypeName;
        this.loss_damage_payment_price = loss_damage_payment_price;
    }

    @Override
    public String toString() {
        return "CarTypeDTO{" +
                "carTypeID='" + carTypeID + '\'' +
                ", carTypeName='" + carTypeName + '\'' +
                ", loss_damage_payment_price=" + loss_damage_payment_price +
                '}';
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
}
