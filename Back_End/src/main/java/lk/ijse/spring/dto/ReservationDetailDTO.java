package lk.ijse.spring.dto;

import lk.ijse.spring.entity.Reservation;

import java.util.Date;

public class ReservationDetailDTO {
    private String rd_id;
    private Date achual_return_day;
    private double extra_charge;
    private boolean damage;
    private double damage_price;
    private Reservation reservation;

    public ReservationDetailDTO() {
    }

    public ReservationDetailDTO(String rd_id, Date achual_return_day, double extra_charge, boolean damage,
                                double damage_price, Reservation reservation) {
        this.rd_id = rd_id;
        this.achual_return_day = achual_return_day;
        this.extra_charge = extra_charge;
        this.damage = damage;
        this.damage_price = damage_price;
        this.reservation = reservation;
    }

    @Override
    public String toString() {
        return "ReservationDetailDTO{" +
                "rd_id='" + rd_id + '\'' +
                ", achual_return_day=" + achual_return_day +
                ", extra_charge=" + extra_charge +
                ", damage=" + damage +
                ", damage_price=" + damage_price +
                ", reservation=" + reservation +
                '}';
    }

    public String getRd_id() {
        return rd_id;
    }

    public void setRd_id(String rd_id) {
        this.rd_id = rd_id;
    }

    public Date getAchual_return_day() {
        return achual_return_day;
    }

    public void setAchual_return_day(Date achual_return_day) {
        this.achual_return_day = achual_return_day;
    }

    public double getExtra_charge() {
        return extra_charge;
    }

    public void setExtra_charge(double extra_charge) {
        this.extra_charge = extra_charge;
    }

    public boolean isDamage() {
        return damage;
    }

    public void setDamage(boolean damage) {
        this.damage = damage;
    }

    public double getDamage_price() {
        return damage_price;
    }

    public void setDamage_price(double damage_price) {
        this.damage_price = damage_price;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}
