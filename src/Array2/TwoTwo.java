package Array2;

public class TwoTwo {
    /*
    Given an array of ints, return true if every 2 that appears in the array is next to another 2.

    twoTwo([4, 2, 2, 3]) → true
    twoTwo([2, 2, 4]) → true
    twoTwo([2, 2, 4, 2]) → false
     */
    private int[] nums;

    public TwoTwo(int[] nums) {
        this.nums = nums;
        System.out.println("TwoTwo: " + check());
    }

    private boolean check() {
        boolean twoTwo = true;

        if (nums.length == 1 && nums[0] == 2) {
            twoTwo = false;
        } else if (nums.length > 1) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i - 1] == 2 && nums[i] == 2) {
                    twoTwo = true;
                }
                if (nums[i - 1] != 2 && nums[i] == 2) {
                    twoTwo = false;
                }
            }
        }

        return twoTwo;
    }
}
