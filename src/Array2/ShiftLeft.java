package Array2;

import java.util.Arrays;

public class ShiftLeft {
    /*
    Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}.
    You may modify and return the given array, or return a new array.

    shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
    shiftLeft([1, 2]) → [2, 1]
    shiftLeft([1]) → [1]
     */

    private int[] nums;

    public ShiftLeft(int[] nums) {
        this.nums = nums;
        System.out.println("ShiftLeft: " + Arrays.toString(create()));
    }

    private int[] create() {
        int[] temp = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                temp[nums.length - 1] = nums[0];
            } else {
                temp[i] = nums[i + 1];
            }
        }

        return temp;
    }
}
