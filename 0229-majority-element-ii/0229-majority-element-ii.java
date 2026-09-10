class Solution 
{
    public List<Integer> majorityElement(int[] nums) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        // Step 1: Store frequency of every number
        for (int i = 0; i < nums.length; i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Step 2: Check which numbers occur more than n/3 times
        for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            int number = entry.getKey();
            int count = entry.getValue();

            if (count > nums.length / 3)
            {
                list.add(number);
            }
        }

        return list;
    }
}