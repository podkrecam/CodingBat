package Array2;

public class Sum13 {
    /*
    Return the sum of the numbers in the array, returning 0 for an empty array.
    Except the number 13 is very unlucky, so it does not count and numbers that
    come immediately after a 13 also do not count.

    sum13([1, 2, 2, 1]) → 6
    sum13([1, 1]) → 2
    sum13([1, 2, 2, 1, 13]) → 6
     */
    private int[] array;

    public Sum13(int[] array) {
        this.array = array;
        System.out.println("Sum13: " + sum());
    }

    private int sum() {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 13) {
                sum += array[i];
            } else {
                i++;
            }
        }

        return sum;
    }
}
