package Array2;

import java.util.Arrays;

public class TenRun {
    /*
    For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.

    tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
    tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
    tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]
     */
    private int[] nums;

    public TenRun(int[] nums) {
        this.nums = nums;
        System.out.println("TenRun: " + Arrays.toString(create()));
    }

    private int[] create() {
        int[] temp = new int[nums.length];
        int tempValue = 0;
        boolean noRemainder = false;

        for (int i = 0; i < temp.length; i++) {
            if (nums[i] % 10 != 0 && noRemainder) {
                temp[i] = tempValue;
            }
            if (nums[i] % 10 == 0) {
                tempValue = nums[i];
                temp[i] = tempValue;
                noRemainder = true;
            }
            if (nums[i] % 10 != 0 && !noRemainder) {
                temp[i] = nums[i];
            }
        }

        return temp;
    }
}
