package Array2;

public class Either24 {
    /*
    Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.

    either24([1, 2, 2]) → true
    either24([4, 4, 1]) → true
    either24([4, 4, 1, 2, 2]) → false
     */
    private int[] array;

    public Either24(int[] array) {
        this.array = array;
        System.out.println("Array2.Either24: " + check());
    }

    private boolean check() {
        boolean has2 = false;
        boolean has4 = false;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 2 && array[i + 1] == 2) {
                has2 = true;
            }
            if (array[i] == 4 && array[i + 1] == 4) {
                has4 = true;
            }
        }

        return has2 && !has4 || !has2 && has4;
    }
}
