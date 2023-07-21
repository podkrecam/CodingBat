package Array2;

public class BigDiff {
    /*
    Given an array length 1 or more of ints, return the difference between the largest
    and smallest values in the array. Note: the built-in Math.min(v1, v2)
    and Math.max(v1, v2) methods return the smaller or larger of two values.

    bigDiff([10, 3, 5, 6]) → 7
    bigDiff([7, 2, 10, 9]) → 8
    bigDiff([2, 10, 7, 2]) → 8
     */
    private int[] array;

    public BigDiff(int[] array) {
        this.array = array;
        System.out.println("BigDiff: " + difference());
    }

    private int difference() {
        int min = array[0];
        int max = array[0];

        for (int num : array) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        return max - min;
    }
}