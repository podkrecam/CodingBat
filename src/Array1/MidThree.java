package Array1;

import java.util.Arrays;

public class MidThree {
    private int[] array;

    public MidThree(int[] array) {
        this.array = array;
        System.out.println(Arrays.toString(mid3()));
    }

    private int[] mid3() {
        int[] temp = {array[(array.length / 2) - 1], array[array.length / 2], array[(array.length / 2) + 1]};
        return temp;
    }
}
