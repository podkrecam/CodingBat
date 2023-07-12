package Logic1;

public class CaughtSpeeding {
    private int speed;
    private boolean isBirthday;

    public CaughtSpeeding(int speed, boolean isBirthday) {
        this.speed = speed;
        this.isBirthday = isBirthday;
        System.out.println("CaughtSpeeding: " + ticket());
    }

    private int ticket() {
        if (!isBirthday) {
            if (speed <= 60) {
                return 0;
            } else if (speed <= 80) {
                return 1;
            } else {
                return 2;
            }
        } else {
            if (speed <= 65) {
                return 0;
            } else if (speed <= 85) {
                return 1;
            } else {
                return 2;
            }
        }
    }
}
