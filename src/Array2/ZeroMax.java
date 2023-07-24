package Array2;

import java.util.Arrays;

public class ZeroMax {
    /*
    Return a version of the given array where each zero value in the array
    is replaced by the largest odd value to the right of the zero in the array.
    If there is no odd value to the right of the zero, leave the zero as a zero.

    zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
    zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
    zeroMax([0, 1, 0]) → [1, 1, 0]
     */

    private int[] nums;

    public ZeroMax(int[] nums) {
        this.nums = nums;
        System.out.println("ZeroMax: " + Arrays.toString(create()));
    }

    private int[] create() {
        int[] temp = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int maxOdd = 0;

                for (int j = i; j < nums.length; j++) {
                    if (nums[j] % 2 != 0 && nums[j] > maxOdd) {
                        maxOdd = nums[j];
                    }
                }

                temp[i] = maxOdd;
            } else {
                temp[i] = nums[i];
            }
        }

        return temp;
    }
}
