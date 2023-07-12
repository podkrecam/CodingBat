package Logic1;

public class TeenSum {
    private int a;
    private int b;

    public TeenSum(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("TeenSum: " + sum());
    }

    private int sum() {
        if ((a > 12 && a < 20) || (b > 12 && b < 20)) {
            return 19;
        }
        return a + b;
    }
}
