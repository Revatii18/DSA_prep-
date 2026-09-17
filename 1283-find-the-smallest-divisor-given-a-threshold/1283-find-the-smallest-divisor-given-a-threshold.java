class Solution 
{
    public int smallestDivisor(int[] nums, int threshold)
    {
       int low = 1 ;
       int high = nums[0];
       int ans = -1 ;
       

       for (int i = 1; i < nums.length; i++)
    {
   
    high = Math.max(high, nums[i]);
   }

   while (low <= high)
   {
      int mid = low + (high - low) / 2 ;
      int sumofDiv = 0 ;
      for (int i = 0 ; i <nums.length ; i++)
      {
          sumofDiv += (nums[i] + mid - 1) / mid;
      }
      if (sumofDiv <= threshold)
      {
        ans = mid ;
        high = mid - 1 ;
      }
      else 
      {
        low = mid + 1 ;
      }
   }
  return ans ;
        
    }
}