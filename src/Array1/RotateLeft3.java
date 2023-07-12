package Array1;

import java.util.Arrays;

public class RotateLeft3 {
    private int[] array;

    public RotateLeft3(int[] array) {
        this.array = array;
        System.out.println(Arrays.toString(rotate()));
    }

    private int[] rotate() {
        int temp = array[0];
        array[0] = array[1];
        array[1] = array[2];
        array[2] = temp;
        return array;
    }
}
