package Logic1;

public class SortaSum {
    private int a;
    private int b;

    public SortaSum(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("SortaSum: " + sum());
    }

    private int sum() {
        int sum = a + b;
        if (sum > 9 && sum < 20) {
            sum = 20;
        }
        return sum;
    }

    private int sum1() {
        if (a + b >= 10 && a + b < 20) {
            return 20;
        } else {
            return a + b;
        }
    }
}
