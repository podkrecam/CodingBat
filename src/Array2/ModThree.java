package Array2;

public class ModThree {
    /*
    Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.

    modThree([2, 1, 3, 5]) → true
    modThree([2, 1, 2, 5]) → false
    modThree([2, 4, 2, 5]) → true
     */
    private int[] nums;

    public ModThree(int[] nums) {
        this.nums = nums;
        System.out.println("ModThree: " + check());
    }

    private boolean check() {
        boolean hasEven = false;
        boolean hasOdd = false;

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0) {
                hasEven = true;
                break;
            }
            if (nums[i] % 2 != 0 && nums[i + 1] % 2 != 0 && nums[i + 2] % 2 != 0) {
                hasOdd = true;
                break;
            }
        }
        return hasEven || hasOdd;
    }
}
