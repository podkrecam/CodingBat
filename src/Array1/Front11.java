package Array1;

import java.util.Arrays;

public class Front11 {
    private int[] a;
    private int[] b;

    public Front11(int[] a, int[] b) {
        this.a = a;
        this.b = b;
        System.out.println(Arrays.toString(front()));
    }

    private int[] front() {
        if (a.length > 0 && b.length == 0) {
            return new int[]{a[0]};
        } else if (a.length == 0 && b.length > 0) {
            return new int[]{b[0]};
        } else if (a.length > 0) {
            return new int[]{a[0], b[0]};
        } else {
            return new int[]{};
        }
    }

}
