package Warmup1;

public class ParrotTrouble {
    private boolean isTalking;
    private int hour;

    public ParrotTrouble(boolean isTalking, int hour) {
        this.isTalking = isTalking;
        this.hour = hour;
        if (trouble()) {
            System.out.println("We are in trouble! Parrot stop talking!");
        } else {
            System.out.println("We are not in trouble :)");
        }
    }

    private boolean trouble() {
        return ((hour < 7 || hour > 20) && isTalking);
    }
}
