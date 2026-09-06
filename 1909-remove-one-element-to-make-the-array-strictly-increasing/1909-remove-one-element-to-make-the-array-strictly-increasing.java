class Solution {
    public boolean canBeIncreasing(int[] nums) {

        for (int remove = 0; remove < nums.length; remove++) {

            boolean increasing = true;
            int previous = Integer.MIN_VALUE;

            for (int i = 0; i < nums.length; i++) {

                if (i == remove) {
                    continue;
                }

                if (previous >= nums[i]) {
                    increasing = false;
                    break;
                }

                previous = nums[i];
            }

            if (increasing) {
                return true;
            }
        }

        return false;
    }
}