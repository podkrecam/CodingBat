package Warmup1;

public class SleepIn {
    private boolean weekday;
    private boolean vacation;

    public SleepIn(boolean weekday, boolean vacation) {
        this.weekday = weekday;
        this.vacation = vacation;
        if (!sleepIn()) {
            System.out.println("We have to go to work!");
        } else {
            System.out.println("We can sleep :)");
        }

    }

    private boolean sleepIn() {
        return (vacation || !weekday);
    }
}
