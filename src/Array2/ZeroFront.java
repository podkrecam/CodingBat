package Array2;

import java.util.Arrays;

public class ZeroFront {
    /*
    Return an array that contains the exact same numbers as the given array, but rearranged
    so that all the zeros are grouped at the start of the array. The order of the non-zero
    numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}.
    You may modify and return the given array or make a new array.

    zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
    zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
    zeroFront([1, 0]) → [0, 1]
     */
    private int[] nums;

    public ZeroFront(int[] nums) {
        this.nums = nums;
        System.out.println("ZeroFront: " + Arrays.toString(create()));
    }

    private int[] create() {
        int[] temp = new int[nums.length];
        int oneIndex = nums.length - 1;
        int zeroIndex = 0;

        for (int num : nums) {
            if (num == 0) {
                temp[zeroIndex] = 0;
                zeroIndex++;
            }
            if (num != 0) {
                temp[oneIndex] = num;
                oneIndex--;
            }
        }

        return temp;
    }
}
