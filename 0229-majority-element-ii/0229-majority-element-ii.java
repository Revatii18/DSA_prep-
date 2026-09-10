class Solution 
{
    public List<Integer> majorityElement(int[] nums) 
    {
        List<Integer> list = new ArrayList<>();

        Arrays.sort(nums);

        int n = nums.length;
        int window = n / 3;

        for (int i = 0; i + window < n; i++)
        {
            if (nums[i] == nums[i + window])
            {
                if (!list.contains(nums[i]))
                {
                    list.add(nums[i]);
                }
            }
        }

        return list;
    }
}