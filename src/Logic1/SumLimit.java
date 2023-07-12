package Logic1;

public class SumLimit {
    private int a;
    private int b;

    public SumLimit(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("SumLimit: " + sum());
    }

    private int sum() {
        int sum = a + b;
        if (String.valueOf(a + b).length() > String.valueOf(a).length()) {
            sum = a;
        }
        return sum;
    }
}
