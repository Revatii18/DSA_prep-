class Solution {
    public int minMoves(int[] nums) 
    {
        int largest = nums[0];
        int count = 0 ;
        for (int i = 1 ; i < nums.length ; i++)
        {
            if (nums[i] > largest)
            {
                largest = nums[i];
            }
        }
        for (int i = 0 ; i < nums.length ; i++ )
        {
            
            
                count += largest - nums[i];
        

        }
        return count ;
    }
}