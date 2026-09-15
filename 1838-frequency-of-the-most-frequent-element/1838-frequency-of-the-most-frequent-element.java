class Solution 
{
    public int maxFrequency(int[] nums, int k) 
    {
        Arrays.sort(nums);

        int left = 0;
        long sum = 0;
        int n = nums.length;
        int answer = 0;

        for (int right = 0; right < n; right++)
        {
            sum += nums[right];

            while ((long) nums[right] * (right - left + 1) - sum > k)
            {
                sum -= nums[left];
                left++;
            }

            int windowSize = right - left + 1;

            answer = Math.max(answer, windowSize);
        }

        return answer;
    }
}