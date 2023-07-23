package Array2;

import java.util.Arrays;

public class Pre4 {
    /*
    Given a non-empty array of ints, return a new array containing the elements from the original array that come before the first 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.

    pre4([1, 2, 4, 1]) → [1, 2]
    pre4([3, 1, 4]) → [3, 1]
    pre4([1, 4, 4]) → [1]
     */
    private int[] nums;

    public Pre4(int[] nums) {
        this.nums = nums;
        System.out.println("Pre4: " + Arrays.toString(create()));
    }

    private int[] create() {
        int size = 0;

        // look for a 4 in an array and set the size of a new array
        for (int i = 0; i < nums.length && nums[i] != 4; i++) {
            size++;
        }

        // create a new array
        int[] temp = new int[size];

        // copy elements from original array
        for (int i = 0; i < temp.length; i++) {
            temp[i] = nums[i];
        }

        return temp;
    }
}
