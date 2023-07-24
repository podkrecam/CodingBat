package Array2;

import java.util.Arrays;

public class WithoutTen {
    /*
    Return a version of the given array where all the 10's have been removed.
    The remaining elements should shift left towards the start of the array as needed,
    and the empty spaces at the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}.
    You may modify and return the given array or make a new array.

    withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
    withoutTen([10, 2, 10]) → [2, 0, 0]
    withoutTen([1, 99, 10]) → [1, 99, 0]
     */
    private int[] nums;

    public WithoutTen(int[] nums) {
        this.nums = nums;
        System.out.println("WithoutTen: " + Arrays.toString(create()));
    }

    private int[] create() {
        int[] temp = new int[nums.length];
        int tenIndex = nums.length - 1;
        int nonTenIndex = 0;

        for (int num : nums) {
            if (num == 10) {
                temp[tenIndex] = 0;
                tenIndex--;
            } else {
                temp[nonTenIndex] = num;
                nonTenIndex++;
            }
        }

        return temp;
    }
}
