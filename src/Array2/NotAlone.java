package Array2;

import java.util.Arrays;

public class NotAlone {
    /*
    We'll say that an element in an array is "alone" if there are values
    before and after it, and those values are different from it.
    Return a version of the given array where every instance of the
    given value which is alone is replaced by whichever value to its
    left or right is larger.

    notAlone([1, 2, 3], 2) → [1, 3, 3]
    notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
    notAlone([3, 4], 3) → [3, 4]
     */
    private int[] nums;
    private int val;

    public NotAlone(int[] nums, int val) {
        this.nums = nums;
        this.val = val;
        System.out.println("NotAlone: " + Arrays.toString(create()));
    }

    private int[] create() {
        int[] temp = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && i < nums.length - 1 && nums[i] == val) {
                if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                    temp[i] = Math.max(nums[i - 1], nums[i + 1]);
                } else {
                    temp[i] = nums[i];
                }
            } else {
                temp[i] = nums[i];
            }
        }

        return temp;
    }
}
