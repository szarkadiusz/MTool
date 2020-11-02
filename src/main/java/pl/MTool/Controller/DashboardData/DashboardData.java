package pl.MTool.Controller.DashboardData;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "MTool_db")
public class DashboardData {

    @Id
    private Integer id;
    private String station;
    private String dateTime;
    private Boolean pinState;
    private Integer cycleTime;

    public DashboardData(int id, String station, String dateTime, Boolean pinState, Integer cycleTime) {
        this.id = id;
        this.station = station;
        this.dateTime = dateTime;
        this.pinState = pinState;
        this.cycleTime = cycleTime;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "DashboardData{" +
                "id=" + id +
                ", station='" + station + '\'' +
                ", dateTime='" + dateTime + '\'' +
                ", pinState=" + pinState +
                ", cycleTime=" + cycleTime +
                '}';
    }

    public DashboardData setId(int id) {
        this.id = id;
        return this;
    }

    public String getStation() {
        return station;
    }

    public DashboardData setStation(String station) {
        this.station = station;
        return this;
    }

    public String getDateTime() {
        return dateTime;
    }

    public DashboardData setDateTime(String dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    public Boolean getPinState() {
        return pinState;
    }

    public DashboardData setPinState(Boolean pinState) {
        this.pinState = pinState;
        return this;
    }

    public Integer getCycleTime() {
        return cycleTime;
    }

    public DashboardData setCycleTime(Integer cycleTime) {
        this.cycleTime = cycleTime;
        return this;
    }

    public DashboardData() {
    }
}

