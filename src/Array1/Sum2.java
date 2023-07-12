package Array1;

import java.util.Arrays;

public class Sum2 {
    private int[] array;

    public Sum2(int[] array) {
        this.array = array;
        System.out.println(sum());
    }

    private int sum() {
        int sum = 0;
        for (int i = 0; i < array.length && i < 2; i++) {
            sum += array[i];
        }
        return sum;
    }
}
