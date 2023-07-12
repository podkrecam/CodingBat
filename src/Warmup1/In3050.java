package Warmup1;

public class In3050 {
    private int a;
    private int b;

    public In3050(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("In3050: " + check());
    }

    private boolean check() {
        return (a >= 30 && a <= 40 && b >= 30 && b <= 40) || (a >= 40 && a <= 50 && b >= 40 && b <= 50);
    }
}
