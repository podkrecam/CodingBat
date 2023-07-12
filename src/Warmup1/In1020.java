package Warmup1;

public class In1020 {
    private int a;
    private int b;

    public In1020(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println(check());
    }

    private boolean check() {
        return (a > 9 && a < 21) || (b > 9 && b < 21);
    }
}
