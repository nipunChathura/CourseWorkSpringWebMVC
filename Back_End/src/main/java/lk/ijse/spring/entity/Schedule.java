package lk.ijse.spring.entity;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
public class Schedule {
    @Id
    private String scheduleID;
    private Date date;
    private Time time;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "driver_nic",referencedColumnName = "nic")
    private Driver driver;

    public Schedule() {
    }

    public Schedule(String scheduleID, Date date, Time time, Driver driver) {
        this.scheduleID = scheduleID;
        this.date = date;
        this.time = time;
        this.driver = driver;
    }

    public String getScheduleID() {
        return scheduleID;
    }

    public void setScheduleID(String scheduleID) {
        this.scheduleID = scheduleID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
