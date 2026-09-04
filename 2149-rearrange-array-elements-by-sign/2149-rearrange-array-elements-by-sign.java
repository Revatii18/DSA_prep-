class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int posPtr = 0;
        int negPtr = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                while (nums[posPtr] <= 0) {
                    posPtr++;
                }
                result[i] = nums[posPtr];
                posPtr++;
            } else {
                while (nums[negPtr] >= 0) {
                    negPtr++;
                }
                result[i] = nums[negPtr];
                negPtr++;
            }
        }

        return result;
    }
}