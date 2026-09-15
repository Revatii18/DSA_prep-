class Solution {
    public int findMin(int[] nums) 
    {
        int smallest = nums[0] ;
        for (int i = 0 ; i < nums.length ; i++)
        {
            if (smallest > nums[i])
            {
                smallest = nums[i];
            }
        }
        return smallest ;
    }
}