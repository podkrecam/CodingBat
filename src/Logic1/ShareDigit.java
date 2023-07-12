package Logic1;

public class ShareDigit {
    private int a;
    private int b;

    public ShareDigit(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("ShareDigit: " + check());
    }

    private boolean check() {
        return a / 10 == b / 10 || a / 10 == b % 10 || a % 10 == b % 10 || a % 10 == b / 10;
    }
}
