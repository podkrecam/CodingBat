package Array1;

import java.util.Arrays;

public class MakeEnds {
    private int[] array;

    public MakeEnds(int[] array) {
        this.array = array;
        System.out.println(Arrays.toString(make()));
    }
    private int[] make(){
        int[] temp = {array[0], array[array.length - 1]};
        return temp;
    }
}
