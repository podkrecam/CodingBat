package Array2;

public class No14 {
    /*
    Given an array of ints, return true if it contains no 1's or it contains no 4's.

    no14([1, 2, 3]) → true
    no14([1, 2, 3, 4]) → false
    no14([2, 3, 4]) → true
     */
    private int[] array;

    public No14(int[] array) {
        this.array = array;
        System.out.println("No14: " + check());
    }

    private boolean check() {
        boolean has1 = false;
        boolean has4 = false;

        for (int num : array) {
            if (num == 1) {
                has1 = true;
            }
            if (num == 4) {
                has4 = true;
            }
        }

        return !has1 || !has4;
    }
}
