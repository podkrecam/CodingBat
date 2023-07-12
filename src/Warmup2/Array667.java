package Warmup2;

public class Array667 {
    private int[] array;

    public Array667(int[] array) {
        this.array = array;
        System.out.println("Array667: " + count());
    }

    private int count() {
        int counter = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 6 && (array[i + 1] == 6 || array[i + 1] == 7)) {
                counter++;
            }
        }
        return counter;
    }
}
