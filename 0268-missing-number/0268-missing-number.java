class Solution {
    public int missingNumber(int[] nums) {
        
        int og_sum = 0;
        int new_sum = 0;

        for (int i = 0; i <= nums.length; i++) {
            og_sum += i;
        }

        for (int i = 0; i < nums.length; i++) {
            new_sum += nums[i];
        }

        int result = og_sum - new_sum;

        return result;
    }
}