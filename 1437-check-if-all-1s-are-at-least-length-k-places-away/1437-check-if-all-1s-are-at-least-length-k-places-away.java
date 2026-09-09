class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int prev_index = -1;  // no '1' found yet

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (prev_index != -1) {  // skip the check for the very first '1'
                    int gap = i - prev_index;
                    if (gap <= k) {
                        return false;   // invalid gap found → stop immediately
                    }
                }
                prev_index = i;  // update in BOTH cases: first '1' or valid gap
            }
        }

        return true;  // no bad gap found anywhere → valid
    }
}