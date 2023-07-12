package Array1;

import java.util.Arrays;

public class MakeMiddle {
    private int[] array;

    public MakeMiddle(int[] array) {
        this.array = array;
        System.out.println(Arrays.toString(make()));
    }

    private int[] make() {
        int[] temp = {array[(array.length / 2) - 1], array[array.length / 2]};
        return temp;
    }
}
