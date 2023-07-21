package Array2;

public class IsEverywhere {
    /*
    We'll say that a value is "everywhere" in an array if for every pair of adjacent
    elements in the array, at least one of the pair is that value.
    Return true if the given value is everywhere in the array.

    isEverywhere([1, 2, 1, 3], 1) → true
    isEverywhere([1, 2, 1, 3], 2) → false
    isEverywhere([1, 2, 1, 3, 4], 1) → false
     */
    private int[] nums;
    private int val;

    public IsEverywhere(int[] nums, int val) {
        this.nums = nums;
        this.val = val;
        System.out.println("IsEverywhere: " + check());
    }

    private boolean check() {
        int countHasN = 0;
        int countPairs = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == val || nums[i + 1] == val) {
                countHasN++;
            }
            countPairs++;
        }

        return countHasN == countPairs;
    }
}
