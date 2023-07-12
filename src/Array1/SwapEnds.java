package Array1;

import java.util.Arrays;

public class SwapEnds {
    private int[] array;

    public SwapEnds(int[] array) {
        this.array = array;
        System.out.println(Arrays.toString(swap()));
    }

    private int[] swap() {
        int temp = array[array.length - 1];
        array[array.length - 1] = array[0];
        array[0] = temp;
        return array;
    }
}
