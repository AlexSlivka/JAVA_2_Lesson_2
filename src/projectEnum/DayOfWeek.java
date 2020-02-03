package projectEnum;

public enum DayOfWeek {
    MONDAY(8), TUESDAY(8), WEDNESDAY(8), THURSDAY(8), FRIDAY(8),
    SATURDAY(0), SUNDAY(0);

    private int worksHours;

    DayOfWeek(int worksHours) {
        this.worksHours = worksHours;
    }

    public int getWorksHours() {
        return worksHours;
    }
}
