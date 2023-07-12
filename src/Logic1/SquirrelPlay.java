package Logic1;

public class SquirrelPlay {
    private int temp;
    private boolean isSummer;

    public SquirrelPlay(int temp, boolean isSummer) {
        this.temp = temp;
        this.isSummer = isSummer;
        System.out.println("SquirrelPlay: " + play());
    }

    private boolean play() {
        if (isSummer && temp > 59 && temp < 101) {
            return true;
        } else if (!isSummer && temp > 59 && temp < 91) {
            return true;
        } else {
            return false;
        }
    }
}
