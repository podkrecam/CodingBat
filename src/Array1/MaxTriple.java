package Array1;

public class MaxTriple {
    private int[] array;

    public MaxTriple(int[] array) {
        this.array = array;
        System.out.println(maxValue());
    }

    private int maxValue() {
        int max = array[0];
        if (array[array.length / 2] > max) {
            max = array[array.length / 2];
        }
        if (array[array.length - 1] > max) {
            max = array[array.length - 1];
        }
        return max;
    }
}
