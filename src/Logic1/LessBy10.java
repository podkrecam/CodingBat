package Logic1;

public class LessBy10 {
    private int a;
    private int b;
    private int c;

    public LessBy10(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("LessBy10: " + check());
    }

    private boolean check() {
        return Math.abs(a - b) >= 10 || Math.abs(a - c) >= 10 || Math.abs(b - c) >= 10;
    }
}
