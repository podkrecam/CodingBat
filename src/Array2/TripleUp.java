package Array2;

public class TripleUp {
    /*
    Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.

    tripleUp([1, 4, 5, 6, 2]) → true
    tripleUp([1, 2, 3]) → true
    tripleUp([1, 2, 4]) → false
     */
    private int[] nums;

    public TripleUp(int[] nums) {
        this.nums = nums;
        System.out.println("TripleUp: " + check());
    }

    private boolean check() {
        boolean hasTriple = false;

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i + 1] - nums[i] == 1 && nums[i + 2] - nums[i + 1] == 1) {
                hasTriple = true;
                break;
            }
        }

        return hasTriple;
    }
}
