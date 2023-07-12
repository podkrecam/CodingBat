package Warmup2;

public class Array123 {
    private int[] nums;

    public Array123(int[] nums) {
        this.nums = nums;
        System.out.println("Array123: " + check());
    }

    private boolean check() {
        boolean is123 = false;
        if (nums.length > 2) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                    is123 = true;
                }
            }
        }
        return is123;
    }
}
