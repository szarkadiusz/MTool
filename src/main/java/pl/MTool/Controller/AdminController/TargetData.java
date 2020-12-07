package pl.MTool.Controller.AdminController;

public class TargetData {
    private int weekNumber;
    private int weeklyTargetPerShift;

    public TargetData(int weekNumber, int weeklyTargetPerShift) {
        this.weekNumber = weekNumber;
        this.weeklyTargetPerShift = weeklyTargetPerShift;
    }

    public int getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(int weekNumber) {
        this.weekNumber = weekNumber;
    }

    public int getWeeklyTargetPerShift() {
        return weeklyTargetPerShift;
    }

    public void setWeeklyTargetPerShift(int weeklyTargetPerShift) {
        this.weeklyTargetPerShift = weeklyTargetPerShift;
    }
}
