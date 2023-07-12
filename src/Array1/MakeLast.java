package Array1;

import java.util.Arrays;

public class MakeLast {
    private int[] array;

    public MakeLast(int[] array) {
        this.array = array;
        System.out.println(Arrays.toString(make1()));
    }

    private int[] make() {
        int[] temp = new int[array.length * 2];
        for (int i = 0; i < temp.length - 1; i++) {
            temp[i] = 0;
        }
        temp[temp.length - 1] = array[array.length - 1];
        return temp;
    }

    private int[] make1() {
        int newArray[] = new int[array.length * 2];
        newArray[newArray.length - 1] = array[array.length - 1];
        return newArray;
    }
}
