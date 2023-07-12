package Array1;

import java.util.Arrays;

public class Make2 {
    private int[] a;
    private int[] b;

    public Make2(int[] a, int[] b) {
        this.a = a;
        this.b = b;
        System.out.println(Arrays.toString(make()));
    }

    private int[] make() {
        int res[] = new int[2];
        if (a.length > 1) {
            res[0] = a[0];
            res[1] = a[1];
        } else if (a.length == 1) {
            res[0] = a[0];
            res[1] = b[0];
        } else {
            res[0] = b[0];
            res[1] = b[1];
        }
        return res;
    }
}
