package Array2;

public class HaveThree {
    /*
    Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.

    haveThree([3, 1, 3, 1, 3]) → true
    haveThree([3, 1, 3, 3]) → false
    haveThree([3, 4, 3, 3, 4]) → false
     */
    private int[] nums;

    public HaveThree(int[] nums) {
        this.nums = nums;
        System.out.println("HaveThree: " + check());
    }

    private boolean check() {
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            if ((i < nums.length - 1 && nums[i] == 3 && nums[i + 1] != 3) || (i == nums.length - 1 && nums[i] == 3)) {
                counter++;
            }
        }

        return counter == 3;
    }
}
