package Array1;

import java.util.Arrays;

public class BiggerTwo {
    private int[] a;
    private int[] b;

    public BiggerTwo(int[] a, int[] b) {
        this.a = a;
        this.b = b;
        System.out.println(Arrays.toString(compareSum()));
    }

    private int[] compareSum() {
        int sumA = 0;
        int sumB = 0;
        for (int i = 0; i < a.length; i++) {
            sumA += a[i];
        }
        for (int j = 0; j < b.length; j++) {
            sumB += b[j];
        }
        if (sumA >= sumB) {
            return a;
        } else {
            return b;
        }
    }

    private int[] compareSum1() {
        if (a[0] + a[1] >= b[0] + b[1]) {
            return a;
        } else {
            return b;
        }
    }
}
