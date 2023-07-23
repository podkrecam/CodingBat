package Array2;

public class SameEnds {
    /*
    Return true if the group of N numbers at the start and end of the array are the same.
    For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2,
    and false for n=1 and n=3. You may assume that n is in the range 0..nums.length inclusive.

sameEnds([5, 6, 45, 99, 13, 5, 6], 1) → false
sameEnds([5, 6, 45, 99, 13, 5, 6], 2) → true
sameEnds([5, 6, 45, 99, 13, 5, 6], 3) → false
     */
    private int[] nums;
    private int len;

    public SameEnds(int[] nums, int len) {
        this.nums = nums;
        this.len = len;
        System.out.println("SameEnds: " + check());
    }

    private boolean check() {
        boolean sameEnd = true;

        for (int i = 0; i < len; i++) {
            if (nums[i] != nums[nums.length + i - len]) {
                sameEnd = false;
                break;
            }
        }
        return sameEnd;
    }
}
