package Array1;

import java.util.Arrays;

public class MaxEnd3 {
    private int[] array;

    public MaxEnd3(int[] array) {
        this.array = array;
        System.out.println(Arrays.toString(maxEnd()));
    }

    private int max() {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    private int[] maxEnd() {
        for (int i = 0; i < array.length; i++) {
            array[i] = max();
        }
        return array;
    }
}
