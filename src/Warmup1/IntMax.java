package Warmup1;

public class IntMax {
    private int a;
    private int b;
    private int c;

    public IntMax(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("IntMax: " + max());
    }

    private int max() {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}
