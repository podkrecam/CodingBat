package Logic1;

import Warmup2.StringTimes;

public class AlarmClock {
    private int day;
    private boolean isVacation;

    public AlarmClock(int day, boolean isVacation) {
        this.day = day;
        this.isVacation = isVacation;
        System.out.println("AlarmClock: " + alarm());
    }

    private String alarm() {
        String hour = "off";
        if (day < 6 && day > 0 && !isVacation) {
            hour = "7:00";
        } else if (day < 6 && day > 0 || day > 5 && !isVacation || day == 0 && !isVacation) {
            hour = "10:00";
        }
        return hour;
    }
}
