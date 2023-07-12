package Warmup2;

public class ArrayFront9 {
    private int[] array;

    public ArrayFront9(int[] array) {
        this.array = array;
        System.out.println("ArrayFront9: " + count());
    }

    private boolean count() {
        boolean is9 = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 9 && i < 4) {
                is9 = true;
            }
        }
        return is9;
    }
}
