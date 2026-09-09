class Solution {
    public boolean kLengthApart(int[] nums, int k) 
    {
       
       int prev_index = -1 ;
       for (int i = 0 ; i< nums.length; i++)
       {

        if(nums[i]==1)
        {
        if (prev_index != -1)
        {
            int gap = i - prev_index ;
            if (gap <= k)
            {
                return false ;
            }
        }
            prev_index = i ;
        }
       } 
       return true ;
    }
}