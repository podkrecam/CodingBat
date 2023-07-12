package Array1;

import java.util.Arrays;

public class MiddleWay {
    private int[] a;
    private int[] b;

    public MiddleWay(int[] a, int[] b) {
        this.a = a;
        this.b = b;
        System.out.println(Arrays.toString(middle()));
    }

    private int[] middle() {
        int[] temp = {a[1], b[1]};
        return temp;
    }
}
