package Array3;

public class MaxSpan {
    /*
    Consider the leftmost and righmost appearances of some value in an array.
    We'll say that the "span" is the number of elements between the two inclusive.
    A single value has a span of 1. Returns the largest span found in the given array.
    (Efficiency is not a priority.)

    maxSpan([1, 2, 1, 1, 3]) → 4
    maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
    maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6
     */
    private int[] nums;

    public MaxSpan(int[] nums) {
        this.nums = nums;
        System.out.println("MaxSpan: " + count());
    }

    private int count() {
        int span = 0;

        if (nums.length > 1) {
            for (int i = 0; i < nums.length; i++) {
                span++;
            }
            if (nums[0] != nums[nums.length - 1]) {
                span--;
            }
        } else {
            span = nums.length;
        }

        return span;
    }

    // solution without loops
    private int count1() {
        if (nums.length == 0 || nums[0] == nums[nums.length - 1]) {
            return nums.length;
        } else {
            return nums.length - 1;
        }
    }
}
