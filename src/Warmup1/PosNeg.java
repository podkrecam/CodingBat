package Warmup1;

public class PosNeg {
    private int a;
    private int b;
    private boolean negative;

    public PosNeg(int a, int b, boolean negative) {
        this.a = a;
        this.b = b;
        this.negative = negative;
        System.out.println(posOrNeg());
    }

    private boolean posOrNeg() {
        return ((a < 0 && b > 0 && !negative) || (a > 0 && b < 0 && !negative) || (a & b) < 0 && negative);
    }
}
