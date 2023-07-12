package Logic1;

public class TwoAsOne {
    private int a;
    private int b;
    private int c;

    public TwoAsOne(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("TwoAsOne: " + check());
    }

    private boolean check() {
        if (a + b == c) {
            return true;
        } else if (a + c == b) {
            return true;
        } else if (b + c == a) {
            return true;
        }
        return false;
    }
}
