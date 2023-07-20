package Array2;

public class CountEvens {
    /*
    Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

    countEvens([2, 1, 2, 3, 4]) → 3
    countEvens([2, 2, 0]) → 3
    countEvens([1, 3, 5]) → 0
     */
    private int[] array;
    private int counter;

    public CountEvens(int[] array) {
        this.array = array;
        System.out.println("CountEvens: " + count());
    }

    private int count() {
        counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }
}
