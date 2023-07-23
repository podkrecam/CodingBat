package Array2;

public class Has12 {
    /*
    Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.

    has12([1, 3, 2]) → true
    has12([3, 1, 2]) → true
    has12([3, 1, 4, 5, 2]) → true
     */
    private int[] nums;

    public Has12(int[] nums) {
        this.nums = nums;
        System.out.println("Has12: " + check());
    }

    private boolean check() {
        boolean has1 = false;
        boolean has2 = false;

        for (int num : nums) {
            if (num == 1) {
                has1 = true;
            }
            if (has1 && num == 2) {
                has2 = true;
            }
        }

        return has1 && has2;
    }
}
