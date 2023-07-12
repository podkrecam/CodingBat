package Array1;

import java.util.Arrays;

public class FrontPiece {
    private int[] array;

    public FrontPiece(int[] array) {
        this.array = array;
        System.out.println(Arrays.toString(front()));
    }

    private int[] front() {
        if (array.length > 1) {
            int[] temp = {array[0], array[1]};
            return temp;
        } else if (array.length == 1) {
            int[] temp = {array[0]};
            return temp;
        } else {
            return array;
        }
    }
}
