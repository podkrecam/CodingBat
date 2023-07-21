package Array2;

public class Lucky13 {
    /*
    Given an array of ints, return true if the array contains no 1's and no 3's.

    lucky13([0, 2, 4]) → true
    lucky13([1, 2, 3]) → false
    lucky13([1, 2, 4]) → false
     */
    private int[] array;

    public Lucky13(int[] array) {
        this.array = array;
        System.out.println("Lucky13: " + check());
    }

    private boolean check() {
        boolean hasNot1Or3 = true;

        for (int j : array) {
            if (j == 1 || j == 3) {
                hasNot1Or3 = false;
                break;
            }
        }

        return hasNot1Or3;
    }
}
