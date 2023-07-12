package Warmup1;

public class DoubleSum {
    private int a;
    private int b;

    public DoubleSum(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("The sum of your numbers: " + add());
    }

    private int add() {
        if (a == b) {
            return 2 * (a + b);
        } else {
            return a + b;
        }
    }
}
