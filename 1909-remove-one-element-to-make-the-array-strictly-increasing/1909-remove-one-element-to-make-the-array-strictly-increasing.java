class Solution {
    public boolean canBeIncreasing(int[] nums) {

        int remove = 0;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i - 1] < nums[i]) {
                continue;
            }

            remove++;

            if (remove > 1) {
                return false;
            }

            if (i == 1 || nums[i - 2] < nums[i]) {
                nums[i - 1] = nums[i];
            } else {
                nums[i] = nums[i - 1];
            }
        }

        return true;
    }
}