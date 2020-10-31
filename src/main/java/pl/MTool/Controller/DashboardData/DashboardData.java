package pl.MTool.Controller.DashboardData;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class DashboardData {

    @Id
    private String station;
    private String dateTime;

    public DashboardData() {
    }

    public DashboardData(String station, String dateTime) {
        this.station = station;
        this.dateTime = dateTime;
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
}
