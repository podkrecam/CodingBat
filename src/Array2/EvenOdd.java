package Array2;

import java.util.Arrays;

public class EvenOdd {
    /*
    Return an array that contains the exact same numbers as the given array,
    but rearranged so that all the even numbers come before all the odd numbers.
    Other than that, the numbers can be in any order.
    You may modify and return the given array, or make a new array.

    evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
    evenOdd([3, 3, 2]) → [2, 3, 3]
    evenOdd([2, 2, 2]) → [2, 2, 2]
     */

    private int[] nums;

    public EvenOdd(int[] nums) {
        this.nums = nums;
        System.out.println("EvenOdd: " + Arrays.toString(create()));
    }

    private int[] create() {
        int[] temp = new int[nums.length];
        int evenIndex = 0;
        int oddIndex = nums.length - 1;


        for (int num : nums) {
            if (num % 2 == 0) {
                temp[evenIndex] = num;
                evenIndex++;
            } else {
                temp[oddIndex] = num;
                oddIndex--;
            }
        }

        return temp;
    }
}
