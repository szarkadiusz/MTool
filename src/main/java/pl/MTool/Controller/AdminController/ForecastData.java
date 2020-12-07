package pl.MTool.Controller.AdminController;

public class ForecastData {
    private int weekNumber;
    private int weeklyForecast;

    public ForecastData(int weekNumber, int weeklyForecast) {
        this.weekNumber = weekNumber;
        this.weeklyForecast = weeklyForecast;
    }

    public int getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(int weekNumber) {
        this.weekNumber = weekNumber;
    }

    public int getWeeklyForecast() {
        return weeklyForecast;
    }

    public void setWeeklyForecast(int weeklyForecast) {
        this.weeklyForecast = weeklyForecast;
    }
}
