package Array1;

import java.util.Arrays;

public class PlusTwo {
    private int[] a;
    private int[] b;

    public PlusTwo(int[] a, int[] b) {
        this.a = a;
        this.b = b;
        System.out.println(Arrays.toString(make()));
    }

    private int[] make() {
        int[] temp = {a[0], a[1], b[0], b[1]};
        return temp;
    }
}
