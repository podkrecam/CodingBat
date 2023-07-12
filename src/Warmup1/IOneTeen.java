package Warmup1;

public class IOneTeen {
    private int a;
    private int b;

    public IOneTeen(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("IOneTeen: " + check2());
    }

    private boolean check() {
        return ((a > 12 && a < 20) && (b < 13 || b > 19)) || ((b > 12 && b < 20) && (a < 13 || a > 19));
    }

    private boolean check2() {
        boolean isATeen = (a > 12 && a < 20);
        boolean isBTeen = (b > 12 && b < 20);
        return (isATeen && !isBTeen) || (!isATeen && isBTeen);
    }
}
