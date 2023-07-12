package Array1;

import java.util.Arrays;

public class Fix23 {
    private int[] array;

    public Fix23(int[] array) {
        this.array = array;
        System.out.println(Arrays.toString(fix()));
    }

    private int[] fix() {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 2 && array[i + 1] == 3) {
                array[i + 1] = 0;
            }
        }
        return array;
    }
}
