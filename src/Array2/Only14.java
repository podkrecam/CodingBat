package Array2;

public class Only14 {
    /*
    Given an array of ints, return true if every element is a 1 or a 4.

    only14([1, 4, 1, 4]) → true
    only14([1, 4, 2, 4]) → false
    only14([1, 1]) → true
     */
    private int[] array;

    public Only14(int[] array) {
        this.array = array;
        System.out.println("Only14: " + check());
    }

    private boolean check() {
        boolean hasOnly1Or4 = true;

        for (int num : array) {
            if (num != 1 && num != 4) {
                hasOnly1Or4 = false;
                break;
            }
        }

        return hasOnly1Or4;
    }
}
