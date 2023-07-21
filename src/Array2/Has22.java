package Array2;

public class Has22 {
    /*
    Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.

    has22([1, 2, 2]) → true
    has22([1, 2, 1, 2]) → false
    has22([2, 1, 2]) → false
     */
    private int[] array;

    public Has22(int[] array) {
        this.array = array;
        System.out.println("Has22: " + check());
    }

    private boolean check() {
        boolean has22 = false;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 2 && array[i + 1] == 2) {
                has22 = true;
                break;
            }
        }

        return has22;
    }
}
