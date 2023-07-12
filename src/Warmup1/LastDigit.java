package Warmup1;

public class LastDigit {
    private int a;
    private int b;

    public LastDigit(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("LastDigit: " + check());
    }

    private boolean check() {
        return a % 10 == b % 10;
    }
}
