package Array2;

public class Has77 {
    /*
    Given an array of ints, return true if the array contains two 7's next to each other,
    or there are two 7's separated by one element, such as with {7, 1, 7}.

    has77([1, 7, 7]) → true
    has77([1, 7, 1, 7]) → true
    has77([1, 7, 1, 1, 7]) → false
     */
    private int[] nums;

    public Has77(int[] nums) {
        this.nums = nums;
        System.out.println("Has77: " + check());
    }

    private boolean check() {
        boolean has77 = false;

        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 2 && nums[i] == 7 && nums[i + 2] == 7) {
                has77 = true;
                break;
            }
            if (i < nums.length - 1 && nums[i] == 7 && nums[i + 1] == 7) {
                has77 = true;
                break;
            }
        }

        return has77;
    }
}
