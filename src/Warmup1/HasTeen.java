package Warmup1;

public class HasTeen {
    private int a;
    private int b;
    private int c;

    public HasTeen(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("HasTeen: " + check());
    }

    private boolean check() {
        return (a > 12 && a < 20) || (b > 12 && b < 20) || (c > 12 && c < 20);
    }
}
