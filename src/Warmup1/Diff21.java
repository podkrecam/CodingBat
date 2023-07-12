package Warmup1;

public class Diff21 {
    private int a;

    public Diff21(int a) {
        this.a = a;
        System.out.println("THe difference between " + a + " and 21 is: " + compare());
    }

    private int compare() {
        if (a <= 21) {
            return 21 - a;
        } else {
            return (21 - a) * -2;
        }
    }
}
