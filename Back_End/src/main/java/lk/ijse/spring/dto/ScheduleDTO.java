package lk.ijse.spring.dto;

import lk.ijse.spring.entity.Driver;

import java.sql.Time;
import java.util.Date;

public class ScheduleDTO {
    private String scheduleID;
    private Date date;
    private Time time;
    private Driver driver;

    public ScheduleDTO() {
    }

    public ScheduleDTO(String scheduleID, Date date, Time time, Driver driver) {
        this.scheduleID = scheduleID;
        this.date = date;
        this.time = time;
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "ScheduleDTO{" +
                "scheduleID='" + scheduleID + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", driver=" + driver +
                '}';
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
