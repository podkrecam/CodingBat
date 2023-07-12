package Array1;

import java.util.Arrays;

public class Reverse3 {
    private int[] array;

    public Reverse3(int[] array) {
        this.array = array;
        System.out.println(Arrays.toString(reverse()));
    }

    private int[] reverse() {
        int temp = array[0];
        array[0] = array[2];
        array[2] = temp;
        return array;
    }
}
