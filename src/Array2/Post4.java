package Array2;

import java.util.Arrays;

public class Post4 {
    /*
    Given a non-empty array of ints, return a new array containing the elements from the original array that come after the last 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.

    post4([2, 4, 1, 2]) → [1, 2]
    post4([4, 1, 4, 2]) → [2]
    post4([4, 4, 1, 2, 3]) → [1, 2, 3]
     */
    private int[] nums;

    public Post4(int[] nums) {
        this.nums = nums;
        System.out.println("Post4: " + Arrays.toString(create()));
    }

    private int[] create() {
        int size = 0;

        // look for a 4 in an array and set the size of a new array
        for (int i = nums.length - 1; i > 0 && nums[i] != 4; i--) {
            size++;
        }

        // create a new array
        int[] temp = new int[size];

        // copy elements from original array
        for (int i = 0; i < temp.length; i++) {
            temp[i] = nums[nums.length - size + i];
        }

        return temp;
    }
}
