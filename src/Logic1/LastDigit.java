package Logic1;

public class LastDigit {
    private int a;
    private int b;
    private int c;

    public LastDigit(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("LastDigit: " + check());
    }

    private boolean check() {
        return a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10;
    }
}
