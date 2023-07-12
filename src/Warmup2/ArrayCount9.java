package Warmup2;

public class ArrayCount9 {
    private int[] array;

    public ArrayCount9(int[] array) {
        this.array = array;
        System.out.println("ArrayCount9: " + count());
    }

    private int count() {
        int counter = 0;
        for (int n : array) {
            if (n == 9) {
                counter++;
            }
        }
        return counter;
    }
}
