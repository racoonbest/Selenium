package inheritance.Desi.Day5Homework.DaysOfWeek;

public class Weekend extends DaysOfWeek{
    int WeekendDays;

    public int getWeekendDays() {
        return WeekendDays;
    }

    public boolean setWeekendDays(int WeekendDays) {
        if (WeekendDays >= 2) {
            this.WeekendDays = WeekendDays;
            return false;

        }else {
            return true;
        }

    }
}
