package Logic2;

public class LoneSum {
    private int a;
    private int b;
    private int c;

    public LoneSum(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("LoneSum: " + sum1());
    }

    private int sum1() {
        int sum = 0;

        if (b == c && a != b) {
            sum = a;
        } else if (a != b && a != c) {
            sum = a + b + c;
        } else if (a == b && a != c) {
            sum = c;
        } else if (a == b) {
            sum = 0;
        } else {
            sum = b;
        }

        return sum;
    }

    private int sum2() {
        int sum = 0;

        if (a != b && a != c) {
            sum += a;
        }
        if (b != a && b != c) {
            sum += b;
        }
        if (c != a && c != b) {
            sum += c;
        }

        return sum;
    }

    private int sum3() {
        if (a == b && b == c) {
            return 0;
        }
        if (a == b) {
            return c;
        }
        if (b == c) {
            return a;
        }
        if (c == a) {
            return b;
        }
        return a + b + c;
    }
}
