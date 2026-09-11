class Solution 
{
    public List<List<Integer>> threeSum(int[] nums) 
    {
Set<List<Integer>> ans = new HashSet<>();

        // First loop for first element
        for (int i = 0; i < nums.length; i++) {
            // Set to store elements seen in this iteration
            Set<Integer> hashset = new HashSet<>();

            // Second loop for second element
            for (int j = i + 1; j < nums.length; j++) {
                // Calculate third element needed
                int third = -(nums[i] + nums[j]);

                // If third already in set, we found a triplet
                if (hashset.contains(third)) {
                    List<Integer> temp = Arrays.asList(nums[i],nums[j], third);
                    Collections.sort(temp);
                    ans.add(temp);
                }

                // Add current element to set
                hashset.add(nums[j]);
            }
        }

        // Convert set to list
        return new ArrayList<>(ans);
    }    
}
